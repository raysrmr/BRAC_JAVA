import java.io.*;
import java.util.*;
class FilesCopy
{
    public static void main(String as[])throws Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter SRC folder:");
        String ss=sc.nextLine();
        System.out.print("Enter TGT folder:");
        String tgt=sc.nextLine();
        File src=new File(ss);
        File dist=new File(tgt);
        dist.mkdir();
        File ff[]=src.listFiles();
        
        for(File pp:ff)
        {
            if(pp.isFile()&& pp.getName().endsWith(".java"))
            { 
                FileInputStream fis=new FileInputStream(pp.getAbsolutePath());//source
                FileOutputStream fos=new FileOutputStream(dist.getAbsolutePath()+"\\"+pp.getName());//target
                int i;
                while((i=fis.read())!=-1){
                    fos.write(i);
                }
            }
        }
        
        System.out.println("Successfully Copied!!!");
    }
}