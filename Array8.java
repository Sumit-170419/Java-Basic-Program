// print even and odd numbers in an array
public class Array8 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("even numbers in array");
        for (int i = 0; i < a.length; i++) {
            if (a[i]%2 == 0) {
                System.out.println(a[i]);
            }
        }
            System.out.println("odd numbers in array");
            for (int i = 0; i < a.length; i++) {
                if (a[i]%2 != 0) {
                    System.out.println(a[i]);
                }
            }

        }
    }

