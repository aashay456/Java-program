
import java.util.Scanner;

public class Aofbook {
    int bid;
    String name;
    float price;
     void accept(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter variables name : ");
        bid=sc.nextInt();
        name=sc.next();
        price=sc.nextFloat();
     }
     void display(){
        System.out.println("Enter Book ID = " + bid);
        System.out.println("Enter Book NAME = " + name);
        System.out.println("Enter Book PRICE = " + price);

     }
     public static void main(String[] args) {
        int i,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value:");
         n=sc.nextInt();
        Aofbook s1[]=new Aofbook[n];
        for(  i=0;i<n;i++){
            s1[i]= new Aofbook();
            s1[i].accept();
            s1[i].display();
            
        }

        


     }
       
}
