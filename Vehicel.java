import java.util.*;
public class Vehicel {
    int vid;
    String vname;
    String compname;
    String color;
    String ownern;
    double price;

    //function...
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter vehicle variables:");
        vid=sc.nextInt();
        vname=sc.next();
        compname=sc.next();
        color=sc.next();
        ownern=sc.next();
        price=sc.nextFloat();

    }
    void display(){
        System.out.println("Enter vehicle ID =" + vid);
        System.out.println("Enter vehicle NAME=" + vname);
        System.out.println("Enter vehicle COMPANYNAME =" + compname);
        System.out.println("Enter vehicle COLOR =" + color);
        System.out.println("Enter vehicle OWNER =" + ownern);
        System.out.println("Enter vehicle PRICE =" + price);
    }
    public static void main(String[] args) {
        Vehicel s1=new Vehicel();
        s1.accept();
        s1.display();
        Vehicel s2=new Vehicel();
        s2.accept();
        s2.display();
        Vehicel s3=new Vehicel();
        s3.accept();
        s3.display();
    }

}

    

