package package1;

public class A {
	public static void main(String a[]){
		MClass []array = new MClass[100];
		for(MClass obj:array){
			obj = new MClass();
		}
		
		array[0].printCount();
	}
}
