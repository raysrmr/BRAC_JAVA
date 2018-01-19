import java.util.Scanner;
class IfLadderDemo
   {
          public static void main(String as[])
              {
                   Scanner sc=new Scanner(System.in);
                   System.out.println("Enter your CGPA:");
                   double cgpa=sc.nextDouble();
                   if(cgpa>=4.5)                   
                      {
                            System.out.println("Excellent"); 
                      }
                   else if(cgpa<4.5 && cgpa>=3.5)                   
                      {
                            System.out.println("Good"); 
                      }
                   else if(cgpa<3.5 && cgpa>=2.5)                   
                      {
                            System.out.println("Average"); 
                      }
                   else if(cgpa<2.5 && cgpa>=1.5)                   
                      {
                            System.out.println("Bad"); 
                      }
                   else if(cgpa<1.5)                   
                      {
                            System.out.println("Go to Hell"); 
                      }
              }
   }
