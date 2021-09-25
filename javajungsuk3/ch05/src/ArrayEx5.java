class ArrayEx5 {
    /*
    [예제5-5] 총합과 평균 구하기
    배열의 모든 요소를 더해서 총합과 평균을 구한다.
     */
    public static void main(String[] args) {
        int   sum = 0;      // 총점을 저장하기 위한 변수
        float average = 0f; // 평균을 저장하기 위한 변수

        int[] score = {100, 88, 100, 100, 90};

        // 반복문을 이용해 배열에 저장되어 있는 값을 모두 더한다.
        for(int i=0; i<score.length; i++) {
            sum += score[i];
        }
        average = sum / (float)score.length; // 계산결과를 float으로 얻기 위해 형변환

        System.out.println("총점: "+sum);
        System.out.println("평균: "+average);
    }
}
