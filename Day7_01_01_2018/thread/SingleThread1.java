class One implements Runnable
  {     
       Thread t; 
       One()
         {
              t=new Thread(this,"Kavitha");
              System.out.println(t);
              t.start();
         }
       public void run()
          {
               try{
                    for(int i=1;i<=5;i++)
                       {
                               System.out.println("Child Thread    "+i);
                                t.sleep(500);
                       }             
                    }catch(Exception e)
                         {
                               System.out.println(e);
                         }
          } 
  }
class SingleThread1
   {
       public static void main(String as[])throws Exception
            {
                   Thread t=new Thread("Raffic");                   
                    System.out.println(t);
                     new One();
                    for(int i=1;i<=5;i++)
                       {
                               System.out.println("Main Thread    "+i);
                               t.sleep(1000);
                       }
            } 
   }