import java.io.File;
import java.util.Date;
class FileDemo1
{
    public static void main(String as[])
    {
        File f=new File("F:/apece");
        String fname[]=f.list();
        for(String temp:fname)
        {
            System.out.println(temp);
        }
        System.out.println("*******");
        File fna[]=f.listFiles();
        for(File temp:fna)
        {
            System.out.println(temp.getName()+" size is :"+temp.length());
        }
    }
}