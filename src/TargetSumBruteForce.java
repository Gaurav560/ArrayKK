public class TargetSumBruteForce {

    static int targetSum(int[] arr,int target){
        int count=0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (target-arr[i]==arr[j]){
                    count++;
                }

            }

        }return  count;
    }

    public static void main(String[] args) {
        int [] arr1={4,6,3,5,8,2};
        int target=7;
        int totalNumberOfPairs=targetSum(arr1,target);
        System.out.println(totalNumberOfPairs);
    }
}
