import java.io.*;
public class ReaderDemo
{
    public static void main(String as[])throws Exception
    {
        
        try(FileReader fr=new FileReader("C:\\Users\\HP\\Pictures\\Screenshots\\ss.png");
            BufferedReader br=new BufferedReader(fr);
            System.out.println("Hai");
            FileWriter fw=new FileWriter("d:\\ss.png",true);)
        {
            String a;
            while((a=br.readLine())!=null)
                fw.write(a);
            //System.out.println(a);
        } 
        
        //fw.close();
        
    }
}