package arman;
public class TimeMain {
       public static void main(String[] args){
    	   Time TimeObject = new Time();
    	   System.out.println(TimeObject.time());
    	   TimeObject.setTime(15, 16, 57);
    	   System.out.println(TimeObject.time());
       }
}
