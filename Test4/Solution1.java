import java.util.*;
public class Solution1 {
    public static int maxPairs(int[] boys, int[] girls) {
        Arrays.sort(boys);
        Arrays.sort(girls);
        int i=0;
        int j=0;
        int count=0;
        while(i<boys.length && j<girls.length){
            if(Math.abs(boys[i]-girls[j])<=1){
                count++;
                i++;
                j++;
            }
            else if(boys[i]<girls[j]){
                i++;
            } 
            else{
                j++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] boys = {3,1,4,6,2};
        int[] girls = {5,1,3,7,2,4};
        System.out.println(maxPairs(boys, girls));
    }
}