import java.util.*;
public class Solution2 {
    // Problem 2 — Chocolates Pickup
    // dp[row][col1][col2] stores the maximum chocolates collected when robot1 is at col1
    // and robot2 is at col2 in the current row.
    // For each position both robots can move in 3 directions so we try all combinations
    // and take the maximum chocolates possible.
    // If both robots land on same cell. count chocolates only once,
    // otherwise count chocolates from both cells.
    // Start from row 0 with robot1 at col 0 and robot2 at col m-1,
    // and the final answer will be the maximum chocolates collected.
    static int[][][] dp;
    static int n,m;
    public static int maximumChocolates(int[][] grid){
        n=grid.length;
        m=grid[0].length;
        dp=new int[n][m][m];
        for (int[][] layer: dp)
            for (int[] row: layer)
                Arrays.fill(row, -1);
        return solve(0, 0, m-1, grid);
    }
    static int solve(int row, int col1, int col2, int[][] grid){
        if (col1<0||col1>=m||col2<0||col2>=m) return (int)-1;
        if (row == n-1) {
            if(col1== col2){
                return grid[row][col1];
            }
            else{
                return grid[row][col1]+grid[row][col2];
            }
        }
        if (dp[row][col1][col2]!= -1) return dp[row][col1][col2];
        int max = 0;
        // Try all 9 combination
        for (int d1=-1;d1<= 1;d1++) {
            for (int d2=-1;d2<=1;d2++) {
                int value;
                if (col1 ==col2){
                    value=grid[row][col1];
                }
                else{
                    value= grid[row][col1] + grid[row][col2];
                }
                value+=solve(row+1,col1+d1,col2+d2,grid);
                max=Math.max(max,value);
            }
        }
        return dp[row][col1][col2] = max;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int[][] grid=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                grid[i][j]=s.nextInt();
            }
        }
        System.out.println(maximumChocolates(grid));
        s.close();
    }
}