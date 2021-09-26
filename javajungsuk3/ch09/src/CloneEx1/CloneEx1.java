package CloneEx1;

class Point implements Cloneable { // Cloneable인터페이스를 구현한 클래스에서만 clone()을 호출할 수 있다.
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "x=" + x + ", y=" + y;
    }

//    public Object clone() {
//        Object obj = null;
//        try {
//            obj = super.clone(); // clone()은 반드시 예외처리를 해주어야 한다.
//        } catch(CloneNotSupportedException e) {}
//        return obj;
//    }

    public Point clone() {
        Object obj = null;
        try {
            obj = super.clone(); // clone()은 반드시 예외처리를 해주어야 한다.
        } catch(CloneNotSupportedException e) {}
        return (Point)obj;
    }
}

class CloneEx1 {
    public static void main(String[] args) {
        Point original = new Point(3, 5);
        Point copy = original.clone(); // 복제(clone)해서 새로운 객체를 생성
        System.out.println(original);
        System.out.println(copy);
    }
}
