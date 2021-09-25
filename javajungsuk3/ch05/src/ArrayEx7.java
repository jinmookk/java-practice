class ArrayEx7 {
    /*
    [예제5-7] 섞기(shuffle)를 활용한 카드섞기
    배열의 요소의 순서를 반복해서 바꾼다.
     */
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for(int i=0; i < numArr.length; i++) {
            numArr[i] = i;  // 배열을 0~9의 숫자로 초기화한다.
            System.out.print(numArr[i]);
        }
        System.out.println();

        for(int i=0; i < numArr.length; i++) {
            int n = (int)(Math.random() * 10);  // 0~9중의 한 값을 임의로 얻는다.

            // numArr[i]와 numArr[n]의 값을 서로 바꾼다.
            int tmp = numArr[i];
            numArr[i] = numArr[n];
            numArr[n] = tmp;
        }

        for(int i=0; i < numArr.length; i++) {
            System.out.print(numArr[i]);
        }
    } // end of main
}
