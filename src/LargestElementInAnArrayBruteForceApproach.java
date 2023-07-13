public class LargestElementInAnArrayBruteForceApproach {
    static int maxVal(int[] arr){
        int max=Integer.MIN_VALUE;
        for (int x:arr
             ) {
            if (x>max){
                max=x;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr1={4,6,5,700,4,12,4};
        int ans=maxVal(arr1);
        System.out.println(ans);

    }

}
