package arman;
import java.util.Random;
public class RandomIntegers {
   public static void main(String[] args){
	Random dice = new Random();
	int a;
	for(int i=1;i<=10;i++){
		a = 1+dice.nextInt(6);
		System.out.println(a+" ");
	}
   }
}
