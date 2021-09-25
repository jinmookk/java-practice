package ExceptionEx8;

class ExceptionEx8 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0); // 0으로 나눠서 고의로 ArithmeticException을 발생시킨다.
            System.out.println(4); // 실행되지 않는다.
        } catch (ArithmeticException ae) {
            ae.printStackTrace(); // 참조변수 ae를 통해, 생성된 ArithmeticException인스턴스에 접근할 수 있다.
            System.out.println("예외메시지 : " + ae.getMessage());
        } // end of try-catch
        System.out.println(6);
    } // end of main
}
