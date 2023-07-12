public class CheckIfTheArrayIsSortedOrNot {

    //logic method
    static  boolean checkIfTheArrayIsSortedOrNot(int[] arr){
        boolean f=true;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
              if (  arr[i]>arr[j]){
                  f=false;
              break;
              }
break;
            }

        }
        return  f;
    }


    //driver method
    public static void main(String[] args) {
        int[] arr={3111,5,66,78,99};
        boolean bool=checkIfTheArrayIsSortedOrNot(arr);
        if (bool){
            System.out.println("array is sorted ");
        }
        else System.out.println("array is not sorted.");
    }
}
