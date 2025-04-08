public class StrQues {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(str.length());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        StringBuilder s= new StringBuilder(str);
        // System.out.println(s.reverse());
        s.deleteCharAt(5);
        System.out.println(s);
    }
}
