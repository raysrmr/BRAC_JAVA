import java.util.Scanner;
class IfDemo
   {
          public static void main(String as[])
              {
                   Scanner sc=new Scanner(System.in);
                   System.out.println("Enter your Age:");
                   int age=sc.nextInt();
                   if(age>=18)                   
                      {
                             System.out.println("Eligible to Vote");                            
                      }
                   else
                      {
                             System.out.println("Not Eligible to Vote");                            
                      }
              }
   }
