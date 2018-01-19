class StringMethodsDemo
{
    public static void main(String as[])
    {  
        String name1="brac University located in Banani Dhaka.";
        String name2="BRAC";  
        String name3="       BRAc";
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name1.length()); 
        System.out.println(name1.charAt(7));
        System.out.println(name3.equalsIgnoreCase(name2));
        System.out.println(name1.toUpperCase());
        System.out.println(name1.toLowerCase());
        System.out.println(name1.indexOf('a'));
        System.out.println(name1.lastIndexOf('a'));
        System.out.println(name1.indexOf('a',5));
        System.out.println(name1.lastIndexOf('a',35));
        System.out.println(name3);
        System.out.println(name3.trim());
        System.out.println(name1.substring(5));
        System.out.println(name1.substring(5,10));
    }
}
