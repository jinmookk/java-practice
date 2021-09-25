package TvTest2;

class Tv {
    // Tv의 속성(Member Variables)
    String color;   // 색상
    boolean power;  // 전원상태(on/off)
    int channel;    // 채널

    // Tv의 기능(Methods)
    void power() { power = !power; }    // TV를 켜거나 끄는 기능을 하는 메소드
    void channelUp() { ++channel; }     // TV의 채널을 높이는 기능을 하는 메소드
    void channelDown() { --channel; }   // TV의 채널을 낮추는 기능을 하는 메소드
}

class TvTest2 {
    public static void main(String[] args) {
        Tv t1 = new Tv();   // Tv t1; t1 = new Tv();를 한 문장으로 표현
        Tv t2 = new Tv();
        System.out.println("t1의 channel1값은 "+t1.channel+"입니다.");
        System.out.println("t2의 channel2값은 "+t2.channel+"입니다.");

        t1.channel = 7; // Tv 클래스의 인스턴스 t1의 channel 값을 7로 저장
        System.out.println("t1의 channel값을 7로 변경하였습니다.");

        System.out.println("t1의 channel값은 "+t1.channel+"입니다.");
        System.out.println("t2의 channel2값은 "+t2.channel+"입니다.");
    }
}