class StringDemo
{
    public static void main(String as[])
    {
        String name1=new String("BRAC");
        String name2=new String("BRAC");
        String name3="BRAC";
        String name4="BRAC";
        if(name1==name2)
            System.out.println("Hi");
        
        if(name3==name4)
            System.out.println("Hello");
        
        char ch[]={'M','o','h','a','m','e','d',' ','R','a','f','f','i','c'};
        String name5=new String(ch,5,7);
        System.out.println(ch);
        System.out.println(name5);
        
    }
}