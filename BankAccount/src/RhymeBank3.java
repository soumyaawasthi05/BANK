import java.util.Scanner;
public class RhymeBank3 {
	
	public static void main(String[] args) {
		System.out.println("Bank Admin Menu:");
		System.out.println("Please Enter a Menu Option");
		System.out.println("[1]: Add Customer To Bank");
		System.out.println("[2]: Change Customer Name");
		System.out.println("[3]: Check Account Balance");
		System.out.println("[4]: Modify Account Balance");
		System.out.println("[5]: Summary of All Accounts");
		System.out.println("[-1]: Quit");
		
		Scanner input = new Scanner(System.in);
		int userInput = input.nextInt();
	}
}
