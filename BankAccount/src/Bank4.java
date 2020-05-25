import java.util.Scanner;
public class Bank4 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sentinal = 0;
		int size = 0;
		double[] accountBalances = new double[250];
		String[] accountNames = new String[250];
		while(sentinal != -1){
		System.out.println("Bank Admin Menu:");
		System.out.println("Please Enter a Menu Option");
		System.out.println("[1]: Add Customer To Bank");
		System.out.println("[2]: Change Customer Name");
		System.out.println("[3]: Check Account Balance");
		System.out.println("[4]: Modify Account Balance");
		System.out.println("[5]: Summary of All Accounts");
		System.out.println("[-1]: Quit");
		
		
		int userInput = input.nextInt();
		if(userInput == 1){
			System.out.println("Bank Add Customer Menu");
			System.out.println("Please Enter an account balance");
			double balance = input.nextDouble();
			accountBalances[size] = balance;
			System.out.println("Please Enter an account holder name");
			input.nextLine();
			String name = input.nextLine();
			accountNames[size] = name;
			System.out.println("Customer's ID is :" +size);
			size = size +1;
			
		}
		else if(userInput == 2){
			System.out.println("Bank Change Name Menu");
			System.out.println("Please Enter a customer ID to change their names");
			int index = input.nextInt();
			System.out.println("What is the customer's new name?");
			input.nextLine();
			accountNames[index] = input.nextLine();
		}
		else if(userInput == 3){
			System.out.println("Bank Check Balance Menu");
			System.out.println("Please Enter a customer ID to check their balance");
			int index = input.nextInt();
			double balance = accountBalances[index];
			System.out.println("This Customer has $" + balance +"in their Account");
			
		}
		else if(userInput == 4){
			System.out.println("Bank Modify Balance Menu");
			System.out.println("Please Enter a customer ID to check their balances");
			int index = input.nextInt();
			System.out.println("What is the customer's new account balance");
			accountBalances[index] = input.nextDouble();
			
		}
		else if(userInput == 5){
			System.out.println("Bank All Customer Summary Menu");
			double total = 0;
			for(int i =0; i< size; i++){
				total = total + accountBalances[i];
				System.out.println(accountNames[i] + " has $ " + accountBalances[i] + "in their account");
			
		}
		System.out.println("In Total, there is $" + total +"in the bank"  );
		}
		else if(userInput == -1){
			System.exit(-1);
		}
		else{
			System.out.println("Error: Invalid Input Entered");
			
		}
		
		}
	}
	
}

