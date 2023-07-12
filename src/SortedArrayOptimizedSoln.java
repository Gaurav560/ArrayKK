public class SortedArrayOptimizedSoln {

    static  boolean sortedArrayOrNot(int[] arr){
        boolean f=true;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]>arr[i+1]){
                f=false;
                break;
            }

        }
        return  f;
    }

    public static void main(String[] args) {
        int[] arr={54,56,86,322,866};
        boolean k=sortedArrayOrNot(arr);
    if (k){
        System.out.println("Array is sorted ");
    }else System.out.println("array is not sorted");
    }
}

