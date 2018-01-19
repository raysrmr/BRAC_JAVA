import java.io.*;
class FileIn
{
    public static void main(String as[])throws FileNotFoundException,IOException
    {
        FileInputStream fis=new FileInputStream("F://apece//contact.html");
        int i=0;
        while((i=fis.read())!=-1)
        {
            System.out.print((char)i);
        }
    }
} 
