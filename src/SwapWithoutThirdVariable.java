public class SwapWithoutThirdVariable {
    public static  void swap(int a ,int b){
        //4,5
        a=a+b;
        //a=9
        b=a-b;
        //b=9-5=4
        a=a-b;
        System.out.println("after swapping the value of a is "+a+" and b is:"+b);
    }

    public static void main(String[] args) {
        swap(6,10);
    }
}
