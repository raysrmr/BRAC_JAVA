import java.io.*;
class FileOut
{
    public static void main(String as[])throws FileNotFoundException,IOException
    {
        FileInputStream fis=new FileInputStream("C:\\Users\\HP\\Pictures\\Screenshots\\ss.png");
        FileOutputStream fos=new FileOutputStream("d:/new.txt");
        int i=0;
        while((i=fis.read())!=-1)
        {
            //System.out.print((char)i);
            fos.write(i);
        }
        System.out.print("Done");
    }
} 
