class One implements Runnable
  {
       Thread t;
        String na; 
       One(String s)
         {
              this.na=s;
              t=new Thread(this,na);
              System.out.println(t);
              t.start();
         }
       public void run()
          {
               try{
                    for(int i=1;i<=5;i++)
                       {
                               System.out.println("Child Thread    "+na+"  "+i);
                                t.sleep(1000);
                       }             
                    }catch(Exception e)
                         {
                               System.out.println(e);
                         }
                  System.out.println("Chile End   "+na);
          } 
  }
class MultiThread
   {
       public static void main(String as[])throws Exception
            {
                   Thread t=new Thread("Raffic");                   
                    System.out.println(t);
                    System.out.println("Main Thread Start");
                    One a=new One("Sajid");
                    One b=new One("Nishat");
                    One c=new One("Priya");
                    t.sleep(10000);
                    System.out.println("Main Thread End");
            } 
   }