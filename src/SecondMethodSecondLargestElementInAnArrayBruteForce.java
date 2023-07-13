import java.lang.*;


public class SecondMethodSecondLargestElementInAnArrayBruteForce {
    static int maxVal(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];

            }

        }return max;


    }

        static int secondMaxVal(int[] arr1){
            int findMax=maxVal(arr1);
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i]==findMax){
                    arr1[i]= Integer.MIN_VALUE ;
                }

            }
            int findSecondMax=maxVal(arr1);
return  findSecondMax;
    }




    public static void main(String[] args) {
        int[] arr1={-5,-4,0};
       int s=secondMaxVal(arr1);
        System.out.println(s);




    }

}
