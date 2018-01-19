class ThreadDemo
   {
      public static void main(String as[])throws Exception
          {
               Thread t=new Thread();
                System.out.println(t.currentThread());
                t.setPriority(Thread.MAX_PRIORITY-2);
                t.setName("Rifat");
                System.out.println(t);
                t.sleep(5000);
                
	System.out.println("Raffic");
          }
                
   }