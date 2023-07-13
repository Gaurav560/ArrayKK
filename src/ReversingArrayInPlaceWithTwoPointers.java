public class ReversingArrayInPlaceWithTwoPointers {

    public static void reversingArray(int[] nums){

     int i=0;
     int j=nums.length-1;
     while (i<=j){
         int temp=nums[i];
         nums[i]=nums[j];
         nums[j]=temp;
         i++;
         j--;
     }
    }

    public static void main(String[] args) {
        int[] num={1,2,3,0,5,6,-1};
        reversingArray(num);
        for (int x:num
             ) {
            System.out.print(x+" ");
        }
    }
}
