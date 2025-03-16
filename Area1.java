import java.util.*;
public class Area1 {
    double r,a;
    Area1(){
        r=2;
        a=3.14*r*r;
    }
    void cal_area(){
        System.out.println("radius is = "+r);
        System.out.println("Area is = "+a);
    
    }
    public static void main(String[] args) {
        Area1 a1=new Area1();
        a1.cal_area();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of records:");
        double n=sc.nextDouble();
        Area1 s1[i]=new Area1();
        for(int i=0;i<n;i++){
        Area1 s1=new Area1();
        s1[i].cal_area();
        }
        
    }
    
}
