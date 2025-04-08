import java.util.*;

public class ForEachLoop {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        s.close();
        for (int x : arr) {
            System.out.println(x);
        }
    }
}
