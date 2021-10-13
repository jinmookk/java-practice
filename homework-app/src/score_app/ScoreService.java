package score_app;

public class ScoreService {

	private Score[] database = new Score[100];
	private int position = 0;
	
	public ScoreService() {
		database[position++] = new Score("강감찬", 100, 95, 100);
		database[position++] = new Score("이순신", 90, 95, 95);
		database[position++] = new Score("류관순", 85, 90, 90);
		database[position++] = new Score("안창호", 85, 80, 80);
		database[position++] = new Score("김유신", 70, 70, 70);
		database[position++] = new Score("이성계", 65, 65, 60);
		database[position++] = new Score("안중근", 40, 40, 50);
	}
	
	/**
	 * 모든 성적정보를 화면에 출력한다.
	 */
	public void printAllScores() {
		System.out.println("--------------------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		for (Score score : database) {
			if (score == null) {
				break;
			}
			System.out.print(score.getName() + "\t");
			System.out.print(score.getKor() + "\t");
			System.out.print(score.getEng() + "\t");
			System.out.print(score.getMath() + "\t");
			System.out.print(score.getTotal() + "\t");
			System.out.println(score.getAverage());
		}
		System.out.println("--------------------------------------------------------");
		System.out.println("### [완료] 모든 성적정보가 출력되었습니다.");
	}
	
	/**
	 * 지정된 성적정보를 배열에 추가한다.<br/>
	 * 성적정보는 총점에 대한 내림차순으로 배열에 저장된다.
	 * @param score 새 성적정보
	 */
	public void addNewScore(Score score) {
		// 성적정보를 총점을 기준으로 내림차순으로 저장한다.
		this.addScore(score);	
		System.out.println("### [완료] 새 성적정보가 추가되었습니다.");
	}
	
	/**
	 * 변경된 성적정보를 배열에 저장한다.<br />
	 * 변경된 성적정보는 배열에 저장될 때 총점에 대한 내림차순으로 배열에 다시 저장된다.
	 * @param score
	 */
	public void updateScore(Score score) {
		// 이름으로 성적정보를 검색해서 저장된 위치를 조회한다.
		int orginalIndex = this.findIndexByName(score.getName());
		if (orginalIndex == -1) {
			System.out.println("### [오류] 성적정보가 존재하지 않습니다.");
			return;
		}
		// 원래 위치에 저장된 성적정보를 삭제한다.
		this.deleteByIndex(orginalIndex);
		// 성적정보를 총점을 기준으로 내림차순으로 다시 저장한다.
		this.addScore(score);
		System.out.println("### [완료] 성적정보 변경이 완료되었습니다.");
	}
	
	/**
	 * 지정된 이름의 성적정보를 삭제한다.
	 * @param name 삭제할 학생이름
	 */
	public void deleteScore(String name) {
		int foundIndex = this.findIndexByName(name);
		if (foundIndex == -1) {
			System.out.println("### [오류] 성적정보가 존재하지 않습니다.");
			return;
		}
		this.deleteByIndex(foundIndex);
		System.out.println("### [완료] 성적정보가 삭제되었습니다.");
	}
	
	/**
	 * 지정된 이름의 성적정보가 저장된 배열의 인덱스를 반환한다.
	 * @param name 조회할 학생의 이름
	 * @return 학생의 성적이 저장된 배열의 인덱스, 성적정보가 존재하지 않으면 -1을 반환한다.
	 */
	private int findIndexByName(String name) {
		for (int index = 0; index < position; index++) {
			Score score = database[index];
			if (score.getName().equals(name)) {
				return index;
			}
		}
		return -1;
	}
	
	/**
	 * 지정된 총점보다 총점이 낮은 성적정보가 저장된 배열의 인덱스를 반환한다.
	 * @param total 총점
	 * @return 낮은 총점이 저장된 배열의 위치를 반환한다. 낮은 총점이 존재하지 않으면 position값을 반환한다. 
	 */
	private int findIndexLessThenTotal(int total) {
		for (int index = 0; index < position; index++) {
			Score score = database[index];
			if (score.getTotal() < total) {
				return index;
			}
		}
		return position;
	}
	
	/**
	 * 성적정보를 전달받아서 총점에 대한 내림차순으로 정렬해서 저장시킨다.
	 * @param score 성적정보
	 */
	private void addScore(Score score) {
		// 전달받은 성적정보의 총점보다 낮은 총점을 가진 성적정보가 저장된 인덱스를 조회한다.
		int foundIndex = this.findIndexLessThenTotal(score.getTotal());
		// 조회된 인덱스에 새 성적정보를 추가한다.
		this.setScoreByIndex(foundIndex, score);		
	}
	
	/**
	 * 지정된 인덱스에 성적정보를 추가한다.<br />
	 * 저장할 위치가 position과 동일하면 맨 마지막 성적정보 다음에 추가한다.<br />
	 * 성적정보를 중간에 추가할 경우, 해당 위치 이후의 모든 성적정보를 한 칸씩 뒤로 이동시킨 다음 추가한다.
	 * @param index 저장할 위치
	 * @param score 성적정보
	 */
	private void setScoreByIndex(int index, Score score) {
		if (index == position) {
			database[position] = score;
		} else {
			for (int i = position - 1; i >= index; i--) {
				database[i + 1] = database[i];
			}
			database[index] = score;
		}
		position++;
	}
	
	private void deleteByIndex(int index) {
		for (int i= index; i<position - 1;  i++) {
			database[i] = database[i + 1];
		}
		database[position - 1] = null;
		position--;
	}
}
