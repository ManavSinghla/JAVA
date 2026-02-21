import java.util.Scanner;

public class Solution3 {
    //  Problem 3 — Count Square Submatrices with All Ones
    // We will make one dp array
    // If the matrix is one ans if it is in corner then we will assign that to 1
    // and if matrix one is in center then we will check its adjacent that how much square they are making
    // as square can be only formed with adjacent above,left and diagonal we will add 1 to the minimum of that.
    public static int countSquares(int[][] matrix){
        int n=matrix.length;
        int m=matrix[0].length;
        int[][] dp=new int[n][m];
        int total=0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(matrix[i][j]==1){
                    if (i==0 || j==0) {
                        dp[i][j] = 1;
                    }
                    else {
                        dp[i][j] = 1 + Math.min(dp[i-1][j],Math.min(dp[i][j-1], dp[i-1][j-1]));
                    }
                    total += dp[i][j];
                }
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int[][] matrix=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=s.nextInt();
            }
        }
        System.out.println(countSquares(matrix));
        s.close();
    }
}