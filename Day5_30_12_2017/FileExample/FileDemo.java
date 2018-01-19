import java.io.File;
import java.util.Date;
class FileDemo
{
    public static void main(String as[])
    {
        File f=new File("\\src\\java\\applet\\Applet.java");
        System.out.println(f.getName());
        System.out.println(f.length());
        System.out.println(f.getPath());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.canRead());
        System.out.println(f.canWrite());
        System.out.println(f.isFile());
        System.out.println(f.isDirectory());
        System.out.println(new Date());
        System.out.println(f.lastModified());
        System.out.println(new Date(f.lastModified()));
    }
}