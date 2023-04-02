// copying a array
public class Array3 {
    public static void main(String[] args){
        int[] copyFrom = {1,3,5,7,9};
        int[] copyTo = new int[3];

        System.arraycopy(copyFrom, 2, copyTo , 0, 3);

       for(int i : copyTo){
           System.out.println(i);
       }
    }
}
