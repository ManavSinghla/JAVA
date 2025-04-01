public class Sum {
    public static void main(String[] args) {
        int a=50;
        int sum=0;
        for(int i=1;i<a;i++){
            sum+=i;
            if(sum>=100){
                break;
            }
        }
        System.out.println(sum);
    }
}

