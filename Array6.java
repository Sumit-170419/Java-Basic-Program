// sum values of array
public class Array6 {
    public static void main(String[] args){
        int[] a= {1,2,3,4,5,6};
        int b = 0;
        for(int i=0;i<a.length;i++){
            b += a[i];
        }
        System.out.println("sum value of array is "+b);

    }
}
