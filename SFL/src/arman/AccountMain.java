package arman;
import java.util.Scanner;
public class AccountMain {
         public static void main(String[] args){
        	 Account account1 = new Account("Jane Green", 62.0f);
        	 Account account2 = new Account("John Blue", 78.0f); 
        	 
        	 System.out.printf("%s balance: %f%n",account1.getName(),account1.getBalance());
        	 System.out.printf("%s balance: %f%n",account2.getName(),account2.getBalance());
        	 
        	 Scanner input = new Scanner(System.in);
        	 
        	 System.out.print("Enter deposit for account1: ");
        	 double depositAmount = input.nextDouble();
        	 System.out.printf("%nadding %f to account1 balance%n%n", depositAmount);
        	 account1.deposit(depositAmount);
        	 
        	 System.out.printf("%s balance: %f%n",account1.getName(),account1.getBalance());
        	 System.out.printf("%s balance: %f%n%n",account2.getName(),account2.getBalance());
        	 
        	 System.out.print("Enter deposit for account2: ");
        	 depositAmount = input.nextDouble();
        	 System.out.printf("%nadding %f to account2 balance%n%n", depositAmount);
        	 account2.deposit(depositAmount);
        	 
        	 System.out.printf("%s balance: %f%n",account1.getName(),account1.getBalance());
        	 System.out.printf("%s balance: %f%n%n",account2.getName(),account2.getBalance());

         }
         
         public static void displayAccount(Account accountToDisplay) 
         {
              
         }
}
