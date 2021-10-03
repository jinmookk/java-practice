package Exercise9_2;

class Exercise9_2 {
    public static void main(String[] args) {
        Point3D p1 = new Point3D(1,2,3);
        Point3D p2 = new Point3D(1,2,3);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println("p1==p2?"+(p1==p2));
        System.out.println("p1.equals(p2)?"+(p1.equlas(p2)));
    }
}

class Point3D {
    int x,y,z;

    Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    Point3D() {
        this(0,0,0);
    }

    public boolean equlas(Object obj) {
        if (!(obj instanceof  Point3D)) {
            return false;
        } else {
            Point3D p = (Point3D)obj;
            return x == p.x && y == p.y && z == p.z;
        }
    }

    public String toString() {
        return "[" + x + "," + y + "," + z + "]";
    }
}
