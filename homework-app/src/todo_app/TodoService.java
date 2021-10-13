package todo_app;

import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class TodoService {
	private AtomicInteger sequence = null;
	private TreeSet<Todo> todoSet = new TreeSet<>();
	
	public TodoService() {
		try {
			todoSet = FileUtils.load();
		} catch (Exception e){}
		
		if (todoSet.isEmpty()) {
			sequence = new AtomicInteger(1001);
		} else {
			sequence = new AtomicInteger(todoSet.first().getNo() + 1);			
		}
	}
	
	/**
	 * 가장 최근에 등록된 일정 5개를 반환한다.<br />
	 * 반환된 일정정보는 메뉴에서 매번 출력된다.
	 */
	public List<Todo> getRecentTodos() {
		return todoSet.stream().limit(5).collect(Collectors.toList());
	}

	/**
	 * 등록된 모든 일정을 출력한다.
	 */
	public void printAllTodos() {
		for (Todo todo : todoSet) {
			todo.printSimpleTodo();
		}
	}
	
	/**
	 * 지정된 번호의 일정 상세정보를 출력한다.
	 * @param no 일정번호
	 */
	public void printTodoDetail(int no) {
		// TODO 내용을 구현하세요
	}
	
	/**
	 * 지정된 키워드를 제목에 포함하고 있는 일정을 모두 출력한다.
	 * @param keyword 검색어
	 */
	public void printTodosByTitle(String keyword) {
		// TODO 내용을 구현하세요
	}
	
	/**
	 * 지정된 작성자가 등록한 일정을 모두 출력한다.
	 * @param writer 작성자명
	 */
	public void printTodosByWriter(String writer) {
		// TODO 내용을 구현하세요
	}
	
	/**
	 * 지정된 상태에 해당하는 일정을 모두 출력한다.
	 * @param status 일정상태(등록, 완료, 삭제 중 하나다.)
	 */
	public void printTodosByStatus(String status) {
		// TODO 내용을 구현하세요
	}
	
	/**
	 * 지정된 일정을 추가한다.
	 * @param todo 새 일정
	 */
	public void addNewTodo(Todo todo) {
		todo.setNo(sequence.getAndIncrement());
		todoSet.add(todo);
	}
	
	/**
	 * 일정번호, 제목, 내용을 전달받아서 일정정보를 변경한다.<br />
	 * 해당 일정의 제목, 내용을 변경하고, 최종 변경일에 시스템의 현재 Date정보를 저장한다.
	 * @param no 일정번호
	 * @param title 제목
	 * @param content 내용
	 */
	public void updateTodo(int no, String title, String text) {
		// TODO 내용을 구현하세요
	}
	
	/**
	 * 일정번호와 일정상태를 전달받아서 상태를 변경한다.<br />
	 * 해당 일정의 일정상태를 전달받은 상태로 변경하고, 최종변경일에 시스템의 현재 Date정보를 저장한다.
	 * @param no 일정번호
	 * @param status 일정상태()
	 */
	public void updateTodoStatus(int no, String status) {
		// TODO 내용을 구현하세요
	}
	
	/** 
	 * 지정된 일정번호의 일정정보를 삭제한다.<br />
	 * 해당 일정의 일정상태를 "삭제"로 변경하고, 최종변경일과 삭제일에 시스템의 현재 Date정보를 저장한다.
	 * @param no 일정번호
	 */
	public void deleteTodo(int no) {
		// TODO 내용을 구현하세요
	}
	
	public void saveTodos() {
		FileUtils.save(todoSet);
		System.out.println("### [완료] 모든 일정정보가 저장되었습니다.");
	}
	
	
}
