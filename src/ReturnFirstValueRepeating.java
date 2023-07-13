public class ReturnFirstValueRepeating {

    static int returnFirstValueRepeating(int[] arr) {


        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                {
                    return arr[i];
                }


            }

        }
return -1;
    }


    public static void main(String[] args) {
        int[] arr2={3,5,14,6,2,6,5,2,1};
        int answer=returnFirstValueRepeating(arr2);
        System.out.println(answer);
    }
}
