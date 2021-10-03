package Exercise9_9;

public class Exercise9_9 {
    public static String delChar(String src, String delCh) {
//        StringBuffer sb = new StringBuffer(src);
//
//        for (int i=0; i < delCh.length(); i++) {
//            char target = delCh.charAt(i);
//            int pos = 0;
//
//            while (true) {
//                pos = sb.indexOf(String.valueOf(target), pos);
//                if (pos == -1) {
//                    break;
//                }
//                sb.deleteCharAt(pos);
//            }
//        }
        StringBuffer sb = new StringBuffer(src.length());

        for (int i=0; i < src.length(); i++) {
            char ch = src.charAt(i);

            // ch가 delCh에 포함되있지 않으면(indexOf()로 못찾으면) sb에 추가
            if (delCh.indexOf(ch) == -1) {
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("(1!2@3^4~5)" + " -> " + delChar("(1!2@3^4~5)","~!@#$%^&*()"));
        System.out.println("(1 2   3   4\t5)" + " -> " + delChar("(1 2   3   4\t5)"," \t"));
    }
}
