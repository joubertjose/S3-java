package experiments.io;
import java.util.Scanner;
public class userinput {
	public static void main(String [] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your Age:");
		int number= sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your Name:");
		String name = sc.nextLine(); 
		
		System.out.println("Your age is: "+number);
		System.out.println("Your name is: "+name);
	}

}
