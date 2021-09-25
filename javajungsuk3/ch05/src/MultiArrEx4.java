import java.util.Scanner;

class MultiArrEx4 {
    /*
    [예제5-23] 단어 맞추기
    영어 단어를 보여주고, 뜻을 맞추는 게임
     */
    public static void main(String[] args) {
        String[][] words = {{"chair", "의자"},
                            {"computer", "컴퓨터"},
                            {"integer", "정수"}};

        Scanner scanner = new Scanner(System.in);

        for(int i=0; i < words.length; i++) {
            System.out.printf("Q%d. %s의 뜻은? ", i+1, words[i][0]);

            String temp = scanner.nextLine();

            if(temp.equals(words[i][1])) {
                System.out.printf("정답입니다.%n%n");
            } else {
                System.out.printf("틀렸습니다. 정답은 %s입니다.%n%n", words[i][1]);
            }
        } // end of for
    } // end of main
}
