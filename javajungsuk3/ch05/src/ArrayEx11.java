class ArrayEx11 {
    /*
    [예제5-11] 빈도수 구하기
    배열에 어떤 값이 몇 개 저장되어 있는지 세어서 보여준다.
     */
    public static void main(String[] args) {
        int[] numArr  = new int[10];
        int[] counter = new int[10];

        for(int i=0; i < numArr.length; i++) {
            numArr[i] = (int)(Math.random()*10); // 0~9의 임의의 수를 배열에 저장
            System.out.print(numArr[i]);
        }
        System.out.println();

        for(int i=0; i < numArr.length; i++) {
            counter[numArr[i]]++;
        }
//        // 향상된 for문을 이용한 for i
//        for(int i : numArr) {
//            counter[i]++;
//        }

        for(int i=0; i < numArr.length; i++) {
            System.out.println(i+"의 개수: "+counter[i]);
        }
    } // end of main
}
