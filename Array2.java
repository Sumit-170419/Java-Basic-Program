// 2 dimensional array
public class Array2 {
    public static void main(String[] args){

     /*   int[][] arr = new int[3][3];
        arr[0][0] = 23;
        arr[0][1] = 34;
        arr[0][2] = 31;
        arr[1][0] = 22;
        arr[1][1] = 54;
        arr[1][2] = 12;
        arr[2][0] = 71;
        arr[2][1] = 33;
        arr[2][2] = 44; */

        int[][] arr = {{23,22,11},{43,23,35},{45,65,76}};

        for(int[] d:arr){
            for(int i:d){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
