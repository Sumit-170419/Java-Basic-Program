// multiplication of matrics
public class Array5 {
    public static void main(String[] args){

        int[][] a = {{2,3},{6,7}};
        int[][] b = {{3,2},{5,4}};
        int[][] c = new int[2][2];

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                    c[i][j] = 0;
                    for(int k=0;k<2;k++){
                    c[i][j] += (a[i][k]*b[k][j]);
            }
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
