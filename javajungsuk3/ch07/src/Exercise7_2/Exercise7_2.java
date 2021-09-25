package Exercise7_2;

class SutaDeck {
    final int CARD_NUM = 20;
    SutaCard[] cards = new SutaCard[CARD_NUM];

    SutaDeck() {
        for(int i=0; i < cards.length; i++) {
            int num = i % 10 + 1;
            boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);

            cards[i] = new SutaCard(num, isKwang);
        }
    }

    // 배열 cards에 담긴 카드의 위치를 뒤섞는다.
    void shuffle() {
        for(int i=0; i < cards.length; i++) {
            int r = (int)(Math.random() * cards.length);

            SutaCard temp = cards[i];
            cards[i] = cards[r];
            cards[r] = temp;
        }
    }

    // 배열 cards에서 지정된 위치의 SutaCard를 반환한다.
    SutaCard pick(int index) {
        if(index < 0 || index >= CARD_NUM) { // index의 유효성을 검사한다.
            return null;
        }
        return cards[index];
    }

    // 배열 cards에서 임의의 위치의 SutaCard를 반환한다.
    SutaCard pick() {
        int index = (int)(Math.random() * cards.length);
        return cards[index]; // pick(int index)를 호출한다.
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

class Exercise7_2 {
    public static void main(String[] args) {
        SutaDeck deck = new SutaDeck();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for(int i=0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i]+",");
        }

        System.out.println();
        System.out.println(deck.pick(0));
    }
}
