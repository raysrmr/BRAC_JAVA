import java.util.Scanner;
class SwitchDemo
   {
          public static void main(String as[])
              {
                   Scanner sc=new Scanner(System.in);                  
                   int cont=0;
                   do{
                   System.out.println("Enter your Choice:");
                   String choice=sc.next();
                   switch(choice)                   
                          {
                             case "CSE":
                                   System.out.println("Computer Science Engineering"); 
                                   break;
                             case "ECE":
                                   System.out.println("Electronics and Communication Engg."); 
                                   break;
                             case "EEE":
                                   System.out.println("Electrical and Electronics Engg.");  
                                   break;
                             default:
                                   System.out.println("Wrong Entry"); 
                                   break;  
                           }
                         System.out.println("Do you want to Continue :  1.Yes 2.No"); 
                         cont=sc.nextInt();
                        }while(cont==1);
              }
   }
