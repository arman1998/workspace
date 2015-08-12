package arman;
public class C {
       public static void main(String[] args){
    	   B BObject1 = new B();
    	   B BObject2 = new B(6);
    	   B BObject3 = new B(2,56);
    	   B BObject4 = new B(7,45,49);
    	   
    	   System.out.printf("%s\n", BObject1.military());
    	   System.out.printf("%s\n", BObject2.military());
    	   System.out.printf("%s\n", BObject3.military());
    	   System.out.printf("%s\n", BObject4.military());
       }
}
