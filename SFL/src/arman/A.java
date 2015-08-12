package arman;
import java.util.Scanner;
public class A {
     public static void main(String[] args){
    	 Scanner bucky = new Scanner(System.in);
    	 int total=0;
    	 int grade;
    	 int average;
    	 int counter=0;
    	 
    	 while(counter<10){
    		 grade = bucky.nextInt();
    		 total = total+grade;
    		 counter++;
    	 }
    	 average=total/10;
    	 System.err.println("Your average is "+average);
    }
  }

