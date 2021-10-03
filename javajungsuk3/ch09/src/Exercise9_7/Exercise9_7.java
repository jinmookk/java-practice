package Exercise9_7;

class Exercise9_7 {
    public static boolean contains(String src, String target) {
//        if (src.indexOf(target) != -1) {
//            return true;
//        }
//
//        return false;
        return src.indexOf(target) != -1;
    }

    public static void main(String[] args) {
        System.out.println(contains("12345","23"));
        System.out.println(contains("12345","67"));
    }
}
