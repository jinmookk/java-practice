package Exercise7_1;

class SutaDeck {
    final int CARD_NUM = 20;
    SutaCard[] cards = new SutaCard[CARD_NUM];

    SutaDeck() {
        for(int i=0; i < cards.length; i++) {
            int num = i%10 + 1;
            boolean isKwang = (i < 10) && (num==1 || num==3 || num==8);

            cards[i] = new SutaCard(num, isKwang);
        }
//        int num = 1;
//
//        for(int i=0; i < CARD_NUM; i++, num++) {
//            if(i == 10) {
//                num = 1;
//            }
//
//            if(i < 10 && (num == 1 || num == 3 || num == 8)) {
//                cards[i] = new SutaCard(num, true);
//            } else {
//                cards[i] = new SutaCard(num, false);
//            }
//        }
    }
}

class SutaCard {
    int num;
    boolean isKwang;

    SutaCard() {
        this(1, true);
    }

    SutaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    // info()대신 object클래스의 toString()을 오버라이딩했다.
    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}

class Exercise7_1 {
    public static void main(String[] args) {
        SutaDeck deck = new SutaDeck();

        for(int i=0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i]+",");
        }
    }
}
