package arman;
import java.util.Scanner;
public class ArrayInputter {
      public static void main(String[] args){
    	  int size;
    	  Scanner input = new Scanner(System.in);
    	  size = input.nextInt();
    	  int array[] = new int[size];
    	  for(int i=0;i<size;i++){
    		  array[i] = input.nextInt();
    	  }
    	  System.out.print("You inserted: ");
    	  for(int i=0;i<size;i++){
    		  System.out.print(array[i]+" ");
    	  }
    	  
      }
}