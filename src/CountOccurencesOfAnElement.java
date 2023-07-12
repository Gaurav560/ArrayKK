import java.util.Scanner;

public class CountOccurencesOfAnElement {

    static int countNoOfOccurences(int[] arr,int x){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
    if (arr[i]==x){
        count++;
    }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("Enter " +
                "the elements of the array for which you want to find the occurence::");

        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();

        }
        System.out.println("Enter  the element to be found ::");
        int x=sc.nextInt();
        int noOfOccurences=countNoOfOccurences(arr,x);
        System.out.println(x+" has repeated "+noOfOccurences+" times .");
    }
}
