public class SmallestAndLargestElement {

    //brute force approach
    static  int[] smallestAndLargestElementArray(int[] arr){


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr.length-1 ; j++) {
              if (arr[j]>arr[j+1]){
                  int temp=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
              }
            }

        }
        int[] arr1={arr[0],arr[arr.length-1]};
        return arr1;
    }

    public static void main(String[] args) {
        int[] arr2={2,2,210,5,-7,9,53,1,3};
        int[] arr3=smallestAndLargestElementArray(arr2);
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+" ");

        }



    }
}

