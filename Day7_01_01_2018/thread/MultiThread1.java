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
              System.out.println(na+"  Thread is now  "+t.getState());
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
class MultiThread1
   {
       public static void main(String as[])throws Exception
            {
                   Thread t=new Thread("dindigul");                   
                    System.out.println(t);
                    System.out.println("Main Thread Start");
                    One a=new One("Rifat");
                    One b=new One("Hero");
                    One c=new One("Parvin");
                     System.out.println("Rifat Thread is now  "+a.t.getState());
                     System.out.println("Hero Thread is now  "+b.t.getState());
                     System.out.println("Parvin Thread is now  "+c.t.getState());
                     System.out.println("Rifat Thread is now  "+a.t.isAlive());
                     System.out.println("Hero Thread is now  "+b.t.isAlive());
                     System.out.println("Parvin Thread is now  "+c.t.isAlive());
                     try{
                              a.t.join();               
                              System.out.println("Rifat Exited");  
                              b.t.join();               
                              System.out.println("Hero Exited");  
                              c.t.join();               
                              System.out.println("Parvin Exited");  
                          }catch(Exception e)
                                {
                                       System.out.println(e);
                                }
                     System.out.println("Rifat Thread is now  "+a.t.getState());
                     System.out.println("Hero Thread is now  "+b.t.getState());
                     System.out.println("Parvin Thread is now  "+c.t.getState());
                     System.out.println("Rifat Thread is now  "+a.t.isAlive());
                     System.out.println("Hero Thread is now  "+b.t.isAlive());
                     System.out.println("Parvin Thread is now  "+c.t.isAlive());
                     System.out.println("Main Thread End");
            } 
   }