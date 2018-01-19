public class WhileDemo
    {
            public static void main(String as[])
                {                     
                     short a=0; 
                             while(a<10)
                                 {
                                         System.out.println("IN While"+a);
                                         a++;
                                 } 
     
                                do
                                 {
                                         System.out.println("IN do While"+a);
                                         a++;
                                 }while(a<20);
                }
    }