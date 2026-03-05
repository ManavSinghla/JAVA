import java.util.*;
public class Solution5 {
    // Problem 5 — Longest Bitonic Subsequence
    public static int longestBitonicSubsequence(int[] nums) {
        int n=nums.length;
        int[] left=new int[n];
        int[] right= new int[n];
        Arrays.fill(left, 1);
        Arrays.fill(right, 1);
        // from left
        for(int i=0;i<n;i++){
            for (int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    left[i]=Math.max(left[i],left[j]+1);
                }
            }
        }
        
        // from right
        for (int i=n-1;i>=0;i--){
            for (int j=n-1;j>i;j--){
                if(nums[j]<nums[i]){
                    right[i]=Math.max(right[i],right[j]+1);
                }
            }
        }
        int max=0;
        for (int i=0;i<n;i++){
            if(left[i]>1 && right[i]>1){
                max=Math.max(max,left[i]+right[i]-1);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println(longestBitonicSubsequence(arr));
        s.close();
    }
}