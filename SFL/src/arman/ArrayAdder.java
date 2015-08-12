package arman;
import java.util.Scanner;
public class ArrayAdder {
	
	public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
  	  System.out.println("Please enter the size: ");
	  int size = input.nextInt();
  	  int array[] = new int[size];
  	  System.out.println("Please enter the array: ");
  	  for(int i=0;i<size;i++){
  		  array[i] = input.nextInt();
  	  }
  	  System.out.println("You inserted: ");
  	  for(int i=0;i<size;i++){
  		  System.out.print(array[i]+" ");
  	  }
      System.out.println();
  	  System.out.println("Please enter the new member: ");
  	  int x = input.nextInt();

	    array = addInt(array, x);
	    print(array);

	    
	}
	
	public static int[] addInt(int [] array, int newInt){
	    int[] newArray = new int[array.length + 1];
	    for (int i = 0; i < array.length; i++){
	        newArray[i] = array[i];
	    }
	    newArray[newArray.length - 1] = newInt;
	    return newArray;
	}
	
	public static void print(int newArray[]){
		 System.out.println("Your new array is: ");
		 for(int i=0;i<newArray.length;i++){
			 System.out.print(newArray[i]+" ");
		 }
	}
}
