import java.util.Scanner;
	
public class Info {
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Your Name: ");
		String nameInput = scanner.nextLine();
		System.out.print("Enter Your Address: ");
		String addressInput = scanner.nextLine();
		System.out.print("Enter Your Email: ");
		String emailInput = scanner.nextLine();
		
		System.out.print("You Enter The Following Information: \n");
		System.out.print(nameInput + "\n");
		System.out.print(addressInput + "\n" );
		System.out.print(emailInput + "\n");
		scanner.close();
	}
}