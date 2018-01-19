import java.io.*;
class ExceDemo1
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
        catch(Exception e)
        {
            System.out.println("In Second Catch Block:"+e);
        }
        System.out.println("End");
    }
}