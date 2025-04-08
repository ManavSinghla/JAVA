import java.util.Scanner;
public class TwoDArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=s.nextInt();
            }
        }
        s.close();
        for(int[] row : arr){
            for(int val : row){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}
