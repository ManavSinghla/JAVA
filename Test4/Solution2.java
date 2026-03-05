import java.util.*;
public class Solution2 {
    public static int canReach(int n, int s, int[] a, int[] b) {
        if(a[0]==0) return 0;
        if(a[s-1]== 1) return 1;
        if(b[s-1]==0) return 0;
        for(int i=s;i<n;i++){
            if(a[i]==1 && b[i]==1){
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args){
        int n=7;
        int s=6;
        int[] a={1, 1, 1, 0, 1, 1, 1 };
        int[] b={1, 1, 0, 1, 1, 0, 1 };
        int result =canReach(n, s, a, b);
        System.out.println(result);
    }
}