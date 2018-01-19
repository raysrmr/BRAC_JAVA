class StringBufferDemo
{
    public static void main(String as[])
    {  
        StringBuffer name1=new StringBuffer();
        StringBuffer name2=new StringBuffer("brac University located in Banani Dhaka.");  
        System.out.println(name1);
        System.out.println(name2);  
        System.out.println(name1.length());
        System.out.println(name2.length());
        System.out.println(name1.capacity());
        System.out.println(name2.capacity());
        System.out.println(name2.append(" CSE"));
        System.out.println(name2);
        System.out.println(name2.length());
        System.out.println(name2.capacity());
        System.out.println(name2.append("Java World Welcomes You"));
        System.out.println(name2);
        System.out.println(name2.length());
        System.out.println(name2.capacity());
        System.out.println(name2.delete(4,10));
        System.out.println(name2.length());
        System.out.println(name2.capacity());
    }
}
