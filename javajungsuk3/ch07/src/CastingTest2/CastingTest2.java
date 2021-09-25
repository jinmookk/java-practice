package CastingTest2;

class CastingTest2 {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = null;
        FireEngine fe = null;

        car.drive();
        fe = (FireEngine)car; // 컴파일은 OK. 실행 시 에러가 발생
        fe.drive();
        car2 = fe;
        car2.drive();
    }
}

class Car {
    String color;
    int door;

    void drive() { // 운전하는 기능
        System.out.println("drivem Brrrr~");
    }

    void stop() { // 멈추는 기능
        System.out.println("stop!!!");
    }
}

class FireEngine extends Car { // 소방차
    void water() { // 물을 뿌리는 기능
        System.out.println("water!!!");
    }
}
