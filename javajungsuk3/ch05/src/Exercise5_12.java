import java.util.Scanner;

class Exercise5_12 {
    public static void main(String[] args) {
        String[][] words = {{"chair", "의자"},
                            {"computer", "컴퓨터"},
                            {"integer", "정수"}};
        int counter = 0;

        Scanner scanner = new Scanner(System.in);

        for(int i=0; i < words.length; i++) {
            System.out.printf("Q%d. %s의 뜻은? ", i+1, words[i][0]);

            String temp = scanner.nextLine();

            if(temp.equals(words[i][1])) {
                System.out.printf("정답입니다.%n%n");
                counter++;
            } else {
                System.out.printf("틀렸습니다. 정답은 %s입니다.%n%n", words[i][1]);
            }
        } // end of for

        System.out.println("전체 "+words.length+"문제 중 "+counter+"문제 맞추셨습니다.");
    } // end of main
}
