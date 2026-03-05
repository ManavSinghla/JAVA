import java.util.Scanner;

public class Solution4 {
    // Problem 4 — Wildcard Matching
    public static int isMatch(String s, String p) {
        int n=s.length();
        int m=p.length();
        boolean[][] dp = new boolean[n+1][m+1];
        dp[0][0]=true;
        for(int j=1;j<=m;j++) {
            if (p.charAt(j-1)== '*'){
                dp[0][j]=dp[0][j-1];
            }
        }
        for(int i=1;i<=n;i++){
            for (int j=1;j<=m;j++) {
                char sc= s.charAt(i-1);
                char pc=p.charAt(j-1);
                if (sc==pc || pc=='?') {
                    dp[i][j]=dp[i-1][j-1];
                }
                else if (pc== '*') {
                    dp[i][j]=dp[i][j-1] || dp[i-1][j];
                }
            }
        }
        return dp[n][m] ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.next();
        String p=s.next();
        System.out.println(isMatch(s1,p));
        s.close();
    }
}