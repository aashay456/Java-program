
import java.util.Scanner;

public class AofVehicle {

    int vid;
    String vname;
    String compname;
    String color;
    String ownern;
    double price;

    //function...
    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter vehicle variables:");
        vid = sc.nextInt();
        vname = sc.next();
        compname = sc.next();
        color = sc.next();
        ownern = sc.next();
        price = sc.nextFloat();

    }

    void display() {
        System.out.println("Enter vehicle ID =" + vid);
        System.out.println("Enter vehicle NAME=" + vname);
        System.out.println("Enter vehicle COMPANYNAME =" + compname);
        System.out.println("Enter vehicle COLOR =" + color);
        System.out.println("Enter vehicle OWNER =" + ownern);
        System.out.println("Enter vehicle PRICE =" + price);
    }
    public static void main(String[] args) {
        int i,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array value:");
        n=sc.nextInt();
        AofVehicle s1[]=new AofVehicle[n];
        for(i=0;i<n;i++){
            s1[i]=new AofVehicle();
            s1[i].accept();
            s1[i].display();
        }

        
    }

}
