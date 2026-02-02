import java.util.*;
public class Solution {
    // 1 
    // The recorded data is divided into all possible consecutive segments of length K.
    // For each segment, compute a single value representing the highest load observed during that segment.
    // These values must be reported in the order in which the segments occur.
    public static int[] maxSegment(int[] arr,int k,int n){
        Deque<Integer> d=new ArrayDeque<>();
        int[] ans=new int[n-k+1];
        for(int i=0;i<arr.length;i++){
            while (!d.isEmpty() && d.peekFirst()<=i-k) {
                d.pollFirst();
            }
            while (!d.isEmpty() && arr[d.peekLast()]<=arr[i]) {
                d.pollLast();
            }
            d.offerLast(i);
            if(i>=k-1){
                ans[i-k+1]=arr[d.peekFirst()];
            }
        }
        return ans;
    }

    // 2.
    // For every time position in the input sequence, determine whether there exists an earlier time position with a strictly higher load.
    // If such a position exists, report the closest earlier index where this happens.
    // If it does not exist, report -1.
    // Same as previous greater we just have to find previous greater elements.
    public static int[] higherLoad(int[] arr,int n){
        int[] ans=new int[n];
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<n;i++){
            while (!s.isEmpty() && arr[s.peek()]<=arr[i]) {
                s.pop();
            }
            if(s.isEmpty()) ans[i]=-1;
            else ans[i]=s.peek();
            s.push(i);
        }
        return ans;
    }
    
    // 3.Using the segment summary obtained earlier, determine the earliest segment position from which the system can operate continuously within acceptable limits.
    // A segment is considered acceptable if its summarized value does not exceed the given reference limit T.
    // Report the earliest position from which at least D such acceptable segments occur consecutively.
    // If no such position exists, report -1.
    // Just iterating loop and if in continus segement is less than or equal to accept limit then increaing the count else count become 0.
    // When count become equal to d reutn that index
    // Just like find consecutive ones just one extra condition that we have to return index where count is equal to d.
    public static int acceptableLimit(int[] arr,int n,int t,int d){
        int c=0;
        for(int i=0;i<n;i++){
            if(arr[i]<=t){
                c++;
                if(c==d) return i;
            }
            else c=0;
        }
        return -1;
    }
    
    // 4.
    // In some cases, the acceptable load limit is not known beforehand.
    // Using the same segment summary, determine the smallest possible load limit for which the system can operate acceptably for at least D consecutive segments.
    // Report this minimum required load limit.
    // We can use binary Search in this
    public static int minAcceptableLimit(int[] arr,int n,int d){
        int low=0;
        int high=0;
        for(int i=0;i<n;i++){
            low=Math.min(arr[i],low);
            high=Math.max(arr[i],high);
        }
        int ans=-1;
        while(high>=low){
            int mid=low+(high-low)/2;
            if(acceptableLimit(arr, n, mid, d)!=-1){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=8;
        int[] arr={10,5,2,7,8,7,6,5};
        int k=3;
        int t=8;
        int d=2;

        // 1.
        int[] ans=maxSegment(arr,k,n);
        for(int i=0;i<ans.length;i++){
            System.out.printf("%d ",ans[i]);
        }
        
        System.out.println();
        
        // 2.
        int[] ans2=higherLoad(arr,n);
        for(int i=0;i<ans2.length;i++){
            System.out.printf("%d ",ans2[i]);
        }
        
        System.out.println();

        // 3.
        System.out.println(acceptableLimit(ans, ans.length, t, d));
        
        // 4.
        System.out.println(minAcceptableLimit(ans, ans.length, d));
    }
}
