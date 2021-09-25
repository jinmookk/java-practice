package ExceptionEx3;

class ExceptionEx3 {
    public static void main(String[] args) {
        int number = 100;
        int result = 0;

        for(int i=0; i < 10; i++) {
            try {
                result = number / (int) (Math.random() * 10); // 7번째 라인
                System.out.println(result);
            } catch (ArithmeticException e) {
                System.out.println("0"); // ArithmeticException이 발생하면 실행되는 코드
            } // end of try-catch
        } // end of for
    } // end of main
}
