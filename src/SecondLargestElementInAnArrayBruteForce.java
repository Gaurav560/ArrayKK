public class SecondLargestElementInAnArrayBruteForce {
    static  int[] secondLargestElementInAnArray(int[] arr){


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr.length-1 ; j++) {
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
        int[] arr1={arr[arr.length-2]};
        return arr1;
    }

    public static void main(String[] args) {
        int[] arr2={2,2,210,5,-7,9,503,1,3};
        int[] arr3=secondLargestElementInAnArray(arr2);
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+" ");

        }



    }

}
