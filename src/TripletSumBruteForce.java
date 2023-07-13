public class TripletSumBruteForce {

    static int targetSum(int[] arr,int target){
        int count=0;
        for (int i = 0; i < arr.length-2; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                for (int k = j+1; k < arr.length; k++) {

                    if (arr[i]+arr[j]+arr[k]==target){
                        count++;
                    }
                }


            }

        }return  count;
    }
    public static void main(String[] args) {
        int [] arr1={1,4,5,6,3};
        int target=12;
        int totalNumberOfPairs=targetSum(arr1,target);
        System.out.println(totalNumberOfPairs);
    }
}
