import java.io.*;
class ExceDemo2
{
    public static void main(String as[])throws IOException
    {
        System.out.println("Begin");
        DataInputStream dis=new DataInputStream(System.in);
        try{
            System.out.println("Enter NUmbers:");
            int a=Integer.parseInt(dis.readLine());
            int b=Integer.parseInt(dis.readLine());
            int c=a/b;
            System.out.println("Answer c="+c);
        }catch(NumberFormatException e)
        {
            System.out.println("In First Catch Block:"+e);   
        }
        finally
        {
            System.out.println("In Second finally Block:");
        }
        System.out.println("End");
    }
}