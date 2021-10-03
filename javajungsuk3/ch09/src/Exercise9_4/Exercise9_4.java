package Exercise9_4;

class Exercise9_4 {
    static void printGraph(int[] dataArr, char ch) {
        for (int data : dataArr) {
            for (int i=0; i < data; i++) {
                System.out.print(ch);
            }
            System.out.println(data);
        }
    }

    public static void main(String[] args) {
        printGraph(new int[]{3,7,1,4},'*');
    }
}
