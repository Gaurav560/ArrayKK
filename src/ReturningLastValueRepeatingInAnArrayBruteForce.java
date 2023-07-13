public class ReturningLastValueRepeatingInAnArrayBruteForce {
    static int returnLastValueRepeating(int[] arr) {
int ans=0;


        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                {
                    ans= arr[i];
                }


            }

        }
        return ans;
    }


    public static void main(String[] args) {
        int[] arr2={3,5,14,6,2,6,5,2,1,11,11};
        int answer=returnLastValueRepeating(arr2);
        System.out.println(answer);
    }
}
