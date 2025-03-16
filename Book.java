
import java.util.Scanner;

 class Book {
    int bid;
    String name;
    float price;
     void a(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter variables name : ");
        bid=sc.nextInt();
        name=sc.next();
        price=sc.nextFloat();
     }
     void B(){
        System.out.println("Enter Book ID = " + bid);
        System.out.println("Enter Book NAME = " + name);
        System.out.println("Enter Book PRICE = " + price);

     }

     public static void main(String[] args) {
        Book s1=new Book();
        s1.a();
        s1.B();
        Book s2=new Book();
        s2.a();
        s2.B();
        
     }
    
}
