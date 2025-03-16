import java.util.*;
public class Stringexdemo
{  
public static void main(String args[])
{  
    String s1="java";
    char ch[]={'s','t','r','i','n','g','s'};
    String s2=new String(ch);
    String s3=new String("patil");

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter name");
   String name=sc.next();

// String s1="java";  //1
// char ch[]={'s','t','r','i','n','g','s'};  //2
// String s2=new String(ch);  
// String s3=new String("example"); //3 
// String name;
// Scanner sc =new Scanner(System.in);
// System.out.println("Enter name");  
// name=sc.next();//4 nextLine()
System.out.println(s1);  
System.out.println(s2);  
System.out.println(s3);  
System.out.println(name);  
}
} 