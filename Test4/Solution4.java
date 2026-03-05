import java.util.*;
public class Solution4 {
    public static int[] countOfPairs(int n, int x, int y) {
        int[] result = new int[n];
        x--;
        y--;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                int direct = Math.abs(i - j);
                int viaXY = Math.abs(i - x) + 1 + Math.abs(y - j);
                int viaYX = Math.abs(i - y) + 1 + Math.abs(x - j);
                int dist = Math.min(direct, Math.min(viaXY, viaYX));
                result[dist - 1]++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int n = 5;
        int x = 2;
        int y = 5;
        int[] ans = countOfPairs(n, x, y);
        System.out.println(Arrays.toString(ans));
    }
}