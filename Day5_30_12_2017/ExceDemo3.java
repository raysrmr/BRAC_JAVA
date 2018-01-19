import java.io.*;
class ExceDemo3
{
    public static void main(String as[])throws IOException,MyOwnExce
    {
        System.out.println("Begin");
        DataInputStream dis=new DataInputStream(System.in);
        try{
            System.out.println("Enter NUmbers:");
            int a=Integer.parseInt(dis.readLine());
            int b=Integer.parseInt(dis.readLine());
            int c=divMet(a,b);
            System.out.println("Answer c="+c);
        }catch(Exception e)
        {
            System.out.println("In First Catch Block:"+e);   
        }
        finally
        {
            System.out.println("In Second finally Block:");
        }
        System.out.println("End");
    }
    static int divMet(int a,int b)throws MyOwnExce
    {
        int c;
        if(b!=0)
            c=a/b;
        else
            throw new MyOwnExce("Second Value Should not be Zero...");
        
        return c;
    }
}