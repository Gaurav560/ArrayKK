public class ReversingAnArrayWithoutNewArray {

    public  static void swapArray(int[] array)
    {

            for (int i = 0; i < array.length/2; i++)
            {
                int temp=array[i];
                array[i]=array[array.length-1-i];
                array[array.length-1-i]=temp;
            }


        }

    public static void main(String[] args) {
        int[] arr={-33,4,6,0,7,8,1,55,33,12};
        swapArray(arr);
        for (int x :arr
                ) {
            System.out.print(x+" ");
        }
    }
    }

