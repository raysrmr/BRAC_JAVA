import java.util.*;
import java.text.*;

public class DateDemo {

   public static void main(String args[]) {
      Date dNow = new Date( );
      SimpleDateFormat ft = new SimpleDateFormat ("E yyyy.MM.dd 'at' HH:mm:ss a zzz");

      System.out.println("Current Date with Default Format : "+dNow);
      System.out.println("Current Date: " + ft.format(dNow));
   }
}