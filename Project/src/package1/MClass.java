package package1;

public class MClass {
	private static int counter = 0;
	public MClass(){
		MClass.counter++;
	}
	
	public static void printCount(){
		System.out.println(counter);
	}
}
