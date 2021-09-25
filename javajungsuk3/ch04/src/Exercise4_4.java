class Exercise4_4 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while(sum < 100) {
            if(i%2 != 0) {
                sum += i;
            } else {
                sum -= i;
            }
            i++;
        }

        System.out.printf("sum=%d, i=%d%n",sum, i-1);
    }
}
