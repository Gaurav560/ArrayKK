public class BetterApproachForReversingAnArrayWithNewArray {

    public  static int[] reverseArray(int[] arr){
        int[] newArray=new int[arr.length];
        int j=0;
        for (int i = arr.length-1; i >=0 ; i--) {
         newArray[j++]=arr[i];
        }
        return newArray;

    }

    public static void main(String[] args) {
        int[] arr={3,4,5,0,6,-54,8};
        int[] arr3=  reverseArray(arr);
        for (int x :arr3
        ) {
            System.out.print(x+" ");

        }
    }
}
