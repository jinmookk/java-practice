package PointTest;

class PointTest {
    public static void main(String[] args) {
        Point3D p3 = new Point3D(1,2,3);
    }
}

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    String getLocation() {
        return "x :"+x+", y :"+y;
    }
}

class Point3D extends Point {
    int z;

    Point3D(int x, int y, int z) {
//        super(); // 에러. super(x, y);로 변경하거나 Point 클래스에 생성자 Point()를 추가해주어야 한다.
        super(x, y);
        this.z = z;
    }

    String getLocation() {
        return "x :"+x+", y :"+y+", z :"+z;
    }
}
