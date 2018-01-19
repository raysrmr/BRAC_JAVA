class One extends Thread
  {
       One()
         {
             Thread t=new Thread("Priya");
              System.out.println(t);
              start();
         }
       public void run()
          { 
               try{
                    for(int i=1;i<=5;i++)
                       {
                               System.out.println("Child Thread    "+i);
                               sleep(500);  
                       }             
                    }catch(Exception e)
                         {
                               System.out.println(e);
                         }
          } 
  }
class SingleThread
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