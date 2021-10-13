package bank_app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // 계좌관련 조회/비밃번호변경/입출금/이체/해지환급금조회 등의 기능을 제공하는 객체 생성하기
        Bank bank = new Bank();

        while (true) {
            System.out.println("================================================================");
            System.out.println("1.전계좌 2.상세조회 3.비밀번호변경 4.입금 5.출금 6.이체 7.해지환급금 0.종료");
            System.out.println("================================================================");

            System.out.print("메뉴를 선택하세요: ");
            int menuNo = scan.nextInt();

            if (menuNo == 1) {
            	System.out.println("[나의 전계좌 조회하기]");
            	
            	System.out.println("### 지정된 예금주가 개설한 모든 계좌정보를 출력합니다.");
            	System.out.print("### 예금주 이름 입력: ");
            	String name = scan.next();
            	
            	bank.displayMyAccounts(name);
            	
            } else if (menuNo == 2) {
            	System.out.println("[계좌 상세정보 조회하기]");
            	
            	System.out.println("### 지정된 계좌의 상세정보를 출력합니다.");
            	System.out.print("### 계좌아이디 입력: ");
            	String accId = scan.next();
            	
            	System.out.print("### 계좌비밀번호 입력: ");
            	int pwd = scan.nextInt();
            	
            	bank.displayAccountInfo(accId, pwd);
            	
            } else if (menuNo == 3) {
            	System.out.println("[비밀번호 변경하기]");
            	
            	System.out.println("### 지정된 계좌의 비밀번호를 변경합니다.");
            	System.out.print("### 계좌아이디 입력: ");
            	String accId = scan.next();
            	
            	System.out.print("### 이전 계좌비밀번호 입력: ");
            	int oldPwd = scan.nextInt();
            	
            	System.out.print("### 새 계좌비밀번호 입력: ");
            	int newPwd = scan.nextInt();
            	
            	bank.changePassword(accId, oldPwd, newPwd);
            	
            } else if (menuNo == 4) {
            	System.out.println("[입금하기]");
            	
            	System.out.println("### 지정된 계좌에 입력한 금액만큼 입금합니다.");
            	System.out.print("### 계좌아이디 입력: ");
            	String accId = scan.next();
            	
            	System.out.print("### 입금액 입력: ");
            	long amount = scan.nextLong();
            	
            	bank.deposit(accId, amount);

            } else if (menuNo == 5) {
            	System.out.println("[출금하기]");
            	
            	System.out.println("### 지정된 계좌에서 입력한 금액만큼 출금합니다.");
            	System.out.print("### 계좌아이디 입력: ");
            	String accId = scan.next();
            	
            	System.out.print("### 계좌비밀번호 입력: ");
            	int pwd = scan.nextInt();
            	
            	System.out.print("### 출금액 입력: ");
            	long amount = scan.nextLong();
            	
            	bank.withdraw(accId, pwd, amount);
            	
            } else if (menuNo == 6) {
            	System.out.println("[이체하기]");
            	
            	System.out.println("### 지정된 계좌로 입력한 금액만큼 이체합니다.");
            	System.out.print("### 내 계좌아이디 입력: ");
            	String accId = scan.next();
            	
            	System.out.print("### 상대방 계좌아이디 입력: ");
            	String otherAccId = scan.next();
            	
            	System.out.print("### 계좌비밀번호 입력: ");
            	int pwd = scan.nextInt();
            	
            	System.out.print("### 이체금액 입력: ");
            	long amount = scan.nextLong();
            	
            	bank.transfer(accId, otherAccId, pwd, amount);
            	
            } else if (menuNo == 7) {
            	System.out.println("[해지환급금 조회하기]");
            	
            	System.out.println("### 계좌에 대한 예상해지환급금을 조회합니다.");
            	System.out.print("### 계좌아이디 입력: ");
            	String accId = scan.next();
            	
            	System.out.print("### 계좌비밀번호 입력: ");
            	int pwd = scan.nextInt();
            	
            	bank.calculateCancellationRefund(accId, pwd);
            	
            } else if (menuNo == 0) {
                System.out.println("[프로그램 종류]");
                System.out.println("### 프로그램을 종료합니다.");
                break;
            }
            System.out.println();
        }

        scan.close();
    }
}
