public class Array9 {
    public static void main(String[] args){
        int[] a = {5,9,45,22,3,11};
        int m = a[0];
        for(int i=1;i<a.length;i++) {
            if (a[i] < m) {
                m = a[i];
            }
        }
        System.out.println("smallest number is "+m);
        for(int i=1;i<a.length;i++) {
            if (a[i] > m) {
                m = a[i];
            }
        }
        System.out.println("greatest number is "+m);
    }
}
