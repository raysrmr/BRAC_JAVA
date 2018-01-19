import java.util.*;
public class MapA{
 public static void main(String [] args){
 TreeMap<String,String> mt=new TreeMap<String,String>();
 System.out.println("Please enter how many data you want to give");
 
 Scanner sc1=new Scanner(System.in);
 Scanner sc=new Scanner(System.in);
 int sz=sc1.nextInt();
 String s,s2;
 while(sz!=0){
  s=sc.nextLine();
  s2=sc.nextLine();
  mt.put(s,s2);
  sz--;
 }
 //Iterator it=mt.iterator();
 //while(it.hasNext()){
 //
 //}
 Set<String> set = mt.keySet();
 Iterator it=set.iterator();
List keys =new ArrayList();
int o=0;
 while( it.hasNext() ) {
  String key=(String)it.next();
    String s1="";
 for(int i=0 ;i<key.length();i++){
 if(key.charAt(i)>=48 && key.charAt(i)<=57){
  s1+=key.charAt(i);
 }
 
 }
 //System.out.println(s1);
 int k=Integer.parseInt(s1);
 if(k%3==0){
keys.add(key);
 //System.out.println(mt.size());
 }
 }
 Iterator it1=keys.iterator();
 while(it1.hasNext())mt.remove(it1.next());
 System.out.println(mt.size());
 }
}
 