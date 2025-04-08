import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		int roll = s.nextInt();
		char group = s.next().charAt(0);
		System.out.println("Name: " + name);
		System.out.println("Roll no: " + roll);
		System.out.println("Group: " + group);
		System.out.println("My First Java Program.");
		s.close();
	}
}
