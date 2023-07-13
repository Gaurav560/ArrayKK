public class UniqueElementInArrayBruteForce {
    static int uniqueElement(int[] arr){
int uniqueElement=0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]){
          arr[i]=-1;
          arr[j]=-1;

            }

        }



            }
        for (int i : arr) {
            if (i != -1) {
                uniqueElement = i;
            }
        }
        return uniqueElement;
    }


    public static void main(String[] args) {
        int [] arr1={6,3,2,6,1,2,3};
        int ans=uniqueElement(arr1);
        System.out.println(ans);
    }
}
