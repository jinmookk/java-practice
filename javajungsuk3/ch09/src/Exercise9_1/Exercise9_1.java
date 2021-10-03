package Exercise9_1;

class Exercise9_1 {
    public static void main(String[] args) {
        SutaCard c1 = new SutaCard(3, true);
        SutaCard c2 = new SutaCard(3, true);

        System.out.println("c1=" + c1);
        System.out.println("c2=" + c2);
        System.out.println("c1.equals(c2):" + c1.equals(c2));
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

    public boolean equals(Object obj) {
        if (!(obj instanceof SutaCard)) {
            return false;
        } else {
            return num == ((SutaCard)obj).num && isKwang == ((SutaCard)obj).isKwang;
        }
    }

    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}