class ArrayEx10 {
    /*
    [예제5-10] 버블정렬(bubble sort)
    길이가 10인 배열에 0과 9사이의 임의의 값을 채운 다음 오름차순으로 정렬하기
     */
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for(int i=0; i < numArr.length; i++) {
            System.out.print(numArr[i] = (int)(Math.random()*10));
        }
        System.out.println();

        for (int i=0; i < numArr.length-1; i++) {
            boolean changed = false; // 자리바꿈이 발생했는지를 체크하기 위한 변수

            for(int j=0; j < numArr.length-1-i; j++) {
                if(numArr[j] > numArr[j+1]) { // 옆의 값이 작으면 서로 바꾼다.
                    int temp = numArr[j];
                    numArr[j] = numArr[j+1];
                    numArr[j+1] = temp;
                    changed = true; // 자리바꿈이 발생했으니 changed를 true로
                }
            } // end of for j

            if(!changed) {  // 자리바꿈이 없으면 반복문을 벗어난다.
                break;
            }

            for(int k=0; k < numArr.length; k++) {
                System.out.print(numArr[k]); // 정렬된 결과를 출력
            }
//            // 향상된 for문을 이용한 for k
//            for(int k : numArr) {
//                System.out.print(k);
//            }

            System.out.println();
        } // end of for i
    }
}
