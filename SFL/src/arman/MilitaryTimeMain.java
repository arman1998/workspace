package arman;
public class MilitaryTimeMain {
      public static void main(String[] args){
    	  MilitaryTime Object = new MilitaryTime();
    	  System.out.println(Object.military());
    	  Object.setTime(13, 14, 50);
    	  System.out.println(Object.military());
      }
}
