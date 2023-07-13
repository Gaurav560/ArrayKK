public class SwappingTwoNumberWithTempVariable {

    public static void swap(int a,int b){
        int temp=0;
        temp=a;
        a=b;
       b=temp;
        System.out.println("After swapping-> a::"+a);
        System.out.println("After swapping->b::"+b);
    }

    public static void main(String[] args) {
        swap(4,5);
    }
}
