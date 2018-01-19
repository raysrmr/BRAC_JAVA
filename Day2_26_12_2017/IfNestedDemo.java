import java.util.Scanner;
class IfNestedDemo
   {
          public static void main(String as[])
              {
                   Scanner sc=new Scanner(System.in);
                   System.out.println("Enter your Age:");
                   int age=sc.nextInt();
                   if(age>=18)                   
                      {
                             System.out.println("Enter your Gender=> 1.Male\t 2.Female");                                                         
                             int gender=sc.nextInt();
                             if(gender==2)
                                  System.out.println("Voting Time 7AM to 12PM");
                             else                            
                                  System.out.println("Voting Time 12PM to 5PM");
                      }
                   else
                      {
                             System.out.println("Not Eligible to Vote");                            
                      }
              }
   }
