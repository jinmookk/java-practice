package Exercise9_11;

class Exercise9_11 {

    public static void main(String[] args) {
        int from = 0;
        int to   = 0;

        try {
            if (args.length != 2) {
                throw new Exception("시작 단과 끝 단, 두 개의 정수를 입력해주세요.");
            }

            from = Integer.parseInt(args[0]);
            to   = Integer.parseInt(args[1]);

            if (!(2 <= from && from <= 9 && 2 <= to && to <= 9)) {
                throw new Exception("단의 범위는 2와 9사이의 값이어야 합니다.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("USAGE : GugudanTest 3 5");
            System.exit(0);
        }

        // 시작 단(from)이 끝 단(to)보다 작아야하므로
        // to보다 from의 값이 크면 두 값을 바꾼다.
        if (from > to) {
            int tmp = from;
            from = to;
            to = from;
        }

        // from단부터 to단까지 출력한다.
        for (int i=from; i <= to; i++) {
            for (int j=1; j <= 9; j++) {
                System.out.println(i+"*"+j+"="+i*j);
            }
            System.out.println();
        }
//        if (args.length != 2) {
//            System.out.println("시작 단과 끝 단, 두 개의 정수를 입력해주세요.");
//            System.out.println("USAGE : GugudanTest 3 5");
//            System.exit(0);
//        }
//
//        int num1 = Integer.parseInt(args[0]);
//        int num2 = Integer.parseInt(args[1]);
//
//        if (!(2 <= num1 && num1 <= 9) || !(2 <= num2 && num2 <= 9)) {
//            System.out.println("단의 범위는 2와 9사이의 값이어야 합니다.");
//            System.out.println("USAGE : GugudanTest 3 5");
//            System.exit(0);
//        }
//
//        for (int i=num1; i <= num2; i++) {
//            for (int j=1; j <= 9; j++) {
//                System.out.println(i+"*"+j+"="+i*j);
//            }
//            System.out.println();
//        }
    }
}
