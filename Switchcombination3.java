import java.util.Scanner;

public class Switchcombination3 {
    public static void main(String[] args) {
        int a,b,ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a&b");
        a=sc.nextInt();
        b=sc.nextInt();
        do { 
System.out.println("1:addtion of 2 No\n 2:Swap of 2 No \n 3:Max form 2 No \n 4:min form 2 No");
System.out.println("5:Exit");
System.out.println("Enter your choice");
ch=sc.nextInt();
switch(ch){
    case 1:System.out.println("add="+(a+b));
    break;
    case 2:
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("a = "+a+"  b = "+b);
    break;
    case 3:
    if(a>b)
    {
     System.out.println(a+" is max");
    }
    else if(b>a)
    {
         System.out.println(b+" is max");
    }
    else 
    {
        System.out.println("euquals");
    }			
    break;
    case 4:
    if(a<b){
        System.out.println(b+"is Minimum");
    }
    else if(b<a){
        System.out.println(a+"is Minimum");
    }
    else{
        System.out.println("Equal");
    }
    
            case 5: 
            
                System.out.println("Exit");
            break;
            default:System.out.println("invalid choice");
  
            }           
        } while (ch<=5);


    }
    
}
