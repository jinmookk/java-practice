class ReferenceParamEx3 {
    public static void main(String[] args) {
        int[] arr = new int[] {3,2,1,6,5,4};

        printArr(arr);  // 배열의 모든 요소를 출력
        sortArr(arr);   // 배열을 정렬
        printArr(arr);  // 정렬 후 결과를 출력
        System.out.println("sum="+sumArr(arr)); // 모든 요소의 총합을 출력
    }

    // 배열의 모든 요소를 출력하는 메서드
    static void printArr(int[] arr) {
        System.out.print("[");
        for(int i : arr) { // 향상된 for문
            System.out.print(i+",");
        }
        System.out.println("]");
    }

    // 배열의 모든 요소의 합을 반환하는 메서드
    static int sumArr(int[] arr) {
        int sum = 0;

        for(int i : arr) { // 향상된 for문
            sum += i;
        }

        return sum;
    }

    // 배열을 오름차순으로 정렬하는 메서드 ([예제5-10] 버블정렬)
    static void sortArr(int[] arr) {
        for(int i=0; i < arr.length-1; i++) {
            boolean changed = false;

            for(int j=0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    changed = true;
                }
            }

            if(!changed) {
                break;
            }
        } // end of for i
    } // end of sortArr
}
