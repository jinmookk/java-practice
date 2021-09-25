package ExceptionEx1;

class ExceptionEx1 {
    public static void main(String[] args) {
        try {
            try { } catch (Exception e) { }
        } catch (Exception e) {
//            try { } catch (Exception e) { } // 에러. 변수 e가 중복 선언되었다.
        } // end of try-catch

        try {

        } catch (Exception e) {

        } // end of try-catch
    } // end of main
}
