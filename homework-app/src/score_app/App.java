package score_app;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ScoreService service = new ScoreService();
		
		while (true) {
			System.out.println("========================================================");
			System.out.println("1.전체  2.등록  3.변경  4.삭제  0.종료");
			System.out.println("========================================================");
			
			System.out.print("메뉴 선택: ");
			int menuNo = scan.nextInt();
			
			if (menuNo == 1) {
				System.out.println("[전체 성적 조회]");
				service.printAllScores();
				
			} else if (menuNo == 2) {
				System.out.println("[새 성적 등록]");
				
				System.out.println("### 성적정보를 입력하세요");
				System.out.print("### 이름 입력: ");
				String name = scan.next();
				System.out.print("### 국어점수 입력: ");
				int kor = scan.nextInt();
				System.out.print("### 영어점수 입력: ");
				int eng = scan.nextInt();
				System.out.print("### 수학점수 입력: ");
				int math = scan.nextInt();
				
				service.addNewScore(new Score(name, kor, eng, math));
				
			} else if (menuNo == 3) {
				System.out.println("[성적 정보 변경]");
				
				System.out.println("### 변경할 성적정보를 입력하세요");
				System.out.print("### 이름 입력: ");
				String name = scan.next();
				System.out.print("### 국어점수 입력: ");
				int kor = scan.nextInt();
				System.out.print("### 영어점수 입력: ");
				int eng = scan.nextInt();
				System.out.print("### 수학점수 입력: ");
				int math = scan.nextInt();
				
				service.updateScore(new Score(name, kor, eng, math));
				
			} else if (menuNo == 4) {
				System.out.println("[성적 정보 삭제]");
				
				System.out.print("### 학생이름 입력: ");
				String name = scan.next();
				
				service.deleteScore(name);
			} else if (menuNo == 0) {
				System.out.println("[프로그램 종료]");
				System.out.println("### 프로그램을 종료합니다.");
				break;
			}
			System.out.println();
		}
		
		scan.close();
	}
}
