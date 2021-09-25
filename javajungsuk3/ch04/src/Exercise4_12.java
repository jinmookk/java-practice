class Exercise4_12 {
    public static void main(String[] args) {
        for(int i=1; i<=9; i++) {
            for(int j = 1; j<=9; j++) {
                int x = (j%3==0 ? 4 : j%3+1) + (i%3==0 ? (i/3-1)*3 : i/3*3);
                int y = (j%3==0 ? j/3 : j/3+1) + (i%3==0? 6 : (i%3-1)*3);

                if(x<=9)
                    System.out.print(x+"*"+y+"="+x*y+"\t");
                if(j%3 == 0)
                    System.out.println();
            }
            if(i%3 == 0)
                System.out.println();
        }
    }
}
