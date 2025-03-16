import java.util.Scanner;

public class Area{
    double r,A;
    void accept(double r){
        this.r=r;
    }
    double area1(){
        A=3.14*r*r;
        return (A);
    }
    public static void main(String[] args) {
        double A,r;
        Scanner sc= new Scanner(System.in);
        Area s1=new Area();
        r=sc.nextDouble();
        s1.accept(r);
        A=s1.area1();

        System.out.println("Area"+A);

        
    }
}

 

    

