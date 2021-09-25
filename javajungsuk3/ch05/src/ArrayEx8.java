class ArrayEx8 {
    /*
    [예제5-8] 섞기(shuffle)를 활용한 로또번호생성
    배열의 요소의 순서를 반복해서 바꾼다.
     */
    public static void main(String[] args) {
        int[] ball = new int[45];   // 45개의 정수값을 저장하기 위한 배열 생성

        // 배열의 각 요소에 1~45값을 저장한다.
        for(int i=0; i < ball.length; i++) {
            ball[i] = i+1;  // 1부터 저장하기 위해 i값에 1을 더한다.
        }

        int temp = 0;   // 두 값을 바꾸는데 사용할 임시변수
        int j = 0;      // 임의의 값을 얻어서 저장할 변수

        // 배열의 i번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을 섞는다.
        // 0번째 부터 5번째 요소까지 모두 6개만 바꾼다.
        for(int i=0; i < 6; i++) {
            j = (int)(Math.random()*45); // 0~44범위의 임의의 값을 얻는다.

            // ball[i]와 ball[j]의 값을 서로 바꾼다.
            temp = ball[i];
            ball[i] = ball[j];
            ball[j] = temp;
        }

        // 배열 ball의 앞에서 부터 6개의 요소를 출력한다.
        for(int i=0; i < 6; i++) {
            System.out.printf("ball[%d]=%d%n", i, ball[i]);
        }
    }
}
