package PolyArgumentTest2;

class Product {
    int price;      // 제품의 가격
    int bonusPoint; // 제품구매 시 제공하는 보너스점수

    Product(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0); // 보너스점수는 제품가격의 10%
    }
    Product() {} // 기본 생성자
}

class Tv extends Product {
    Tv() {
        // 조상클래스의 생성자 Product(int price)를 호출한다.
        super(100); // Tv의 가격을 100만원으로 한다.
    }

    // Object클래스의 toString()을 오버라이딩한다.
    public String toString() { return "Tv"; }
}

class Computer extends Product {
    Computer() {
        super(200);
    }

    public String toString() { return "Computer"; }
}

class Audio extends Product {
    Audio() {
        super(50);
    }

    public String toString() { return "Audio"; }
}

class Buyer { // 고객, 물건을 사는 사람
    int money = 1000;   // 소유금액
    int bonusPoint = 0; // 보너스점수
    Product[] item = new Product[10]; // 구입한 제품을 저장하기 위한 배열
    int i = 0; // Product배열 item에 사용될 index

    void buy(Product p) {
        if(money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }

        money -= p.price; // 가진 돈에서 구입한 제품의 가격을 뺀다.
        bonusPoint += p.bonusPoint; // 제품의 보너스 점수를 추가한다.
        item[i++] = p; // 제품을 Product[] item에 저장한다.
        System.out.println(p+"을/를 구입하셨습니다.");
    }

    void summary() { // 구매한 물품에 대한 정보를 요약해서 보여 준다.
        int sum = 0; // 구입한 물품의 가격합계
        String itemList = ""; // 구입한 물품목록

        // 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
        for(Product i : item) {     // for(int i=0; i<item.length; i++)
            if(i == null) break;    // if(item[i]==null) break;
            sum += i.price;         // sum += item[i].price;
            itemList += i + ", ";   // itemList += item[i]+", ";
            // 구입한 제품목록의 마지막에 출력되는 콤마(,)가 눈에 거슬린다면 다음과 같이 변경하면 된다.
//            itemList += (i==item[0]) ? ""+i : ", "+i; // itemList += (i==0) ? ""+item[i] : ", "+item[i];

        }
        System.out.println("구입하신 물품의 총금액은 "+sum+"만원입니다.");
        System.out.println("구입하신 제품은 "+itemList+"입니다.");
    }
}

class PolyArgumentTest2 {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Audio());
        b.summary();
    }
}
