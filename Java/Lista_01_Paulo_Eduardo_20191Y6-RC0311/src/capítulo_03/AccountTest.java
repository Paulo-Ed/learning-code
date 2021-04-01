package capítulo_03;
import java.util.Scanner;
public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		/*Account MyAccount = new Account();
		
		System.out.printf("Nome inicial é: %s%n%n", MyAccount.getName());
		
		System.out.println("Por favor insira um nome: ");
		String theName = input.nextLine();
		MyAccount.setName(theName);
		System.out.println();
		
		System.out.printf("o Nome do objeto MyAccount é: %s%n%n", MyAccount.getName());
	*/
		Account account1 = new Account("Jane Green", 50.00);
		Account account2 = new Account("John Blue", -7.53);
		
		System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f %n", account2.getName(), account2.getBalance());
	
		System.out.print("Enter deposit amount for account1: ");
		double depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
		account1.deposit(depositAmount);
	
		System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f %n", account2.getName(), account2.getBalance());
		
		System.out.print("Enter deposit amount for account2: ");
		depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
		account2.deposit(depositAmount);
		
		System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f %n", account2.getName(), account2.getBalance());
	}
	
}
