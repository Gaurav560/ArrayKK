public class SecondSmallestElementInAnArrayBruteForce {

        static int minVal(int[] arr) {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]<min){
                    min=arr[i];

                }

            }return min;


        }

        static int secondMaxVal(int[] arr1){
            int findMin=minVal(arr1);
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i]==findMin){
                    arr1[i]= Integer.MAX_VALUE;
                }

            }
            int findSecondMin=minVal(arr1);
            return  findSecondMin;
        }




        public static void main(String[] args) {
            int[] arr1={0,2,3,4,1,44,9};
            int s=secondMaxVal(arr1);
            System.out.println(s);




        }
}
