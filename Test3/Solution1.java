import java.util.*;
public class Solution1 {
    // Problem 1 — Monica and Offers
    // Make a dp array and check for the minimum if previos+curr is minimum or if there we not include cost of previous then 2nd prev+curr will be minimum.
    // If the min of that index is less than equal to p then it can be the answer otherwise it is not the answer
    // We can break the loop because further cost will be always more.
    public static int maxGoods(int n, int p, int[] a) {
        Arrays.sort(a);
        long[] dp = new long[n+1];
        if(n==0) return 0;
        if(n==1){
            if(a[0]>p) return 0;
            if(a[0]>p) return 1;
        }
        dp[0]=0;
        dp[1]=a[0];
        int ans = 0;
        for (int i=2;i<=n;i++) {
            dp[i]=Math.min(dp[i-1] + a[i-1],dp[i-2]+a[i-1]);
            if (dp[i] <= p){
                ans = i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int p=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println(maxGoods(n, p, arr));
        s.close();
    }
}