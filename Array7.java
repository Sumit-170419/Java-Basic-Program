//calculate average value of an array
public class Array7 {
    public static void main(String[] args){
        int[] a = {22,11,33,34,32};
        int b =0;
        for(int i=0;i<a.length;i++){
            b += a[i];
        }
        int avg = b/a.length;
        System.out.println("average value of array is "+avg);

    }
}
