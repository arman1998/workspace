package arman;
import java.util.Scanner;
public class AccountTest {
         public static void main(String[] args){
        	 Account account1 = new Account("Jane Green", 62.0f);
        	 Account account2 = new Account("John Blue", 78.0f); 
        	         	         	 
        	 
        	 
        	 displayAccount(account1);
        	 displayAccount(account2);

         }
         
         public static void displayAccount(Account accountToDisplay) 
         {
        	 Scanner input = new Scanner(System.in);
        	 System.out.printf("%s balance: %f%n",accountToDisplay.getName(),accountToDisplay.getBalance());
        	 System.out.printf("Enter deposit for %s: ", accountToDisplay.getName());
        	 double depositAmount = input.nextDouble();
        	 System.out.printf("adding %f to %s balance%n", depositAmount, accountToDisplay.getName());
        	 accountToDisplay.deposit(depositAmount);
        	 System.out.printf("%s balance: %f%n%n",accountToDisplay.getName(),accountToDisplay.getBalance());
         }
}