
import java.util.Scanner;

public class Area1 {
double r,A;
void accept(double r){
    this.r=r;
}
double area(){
    A=3.14*r*r;
    return (A);
}
public static void main(String[] args) {
    double r;
    int n,i,A;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter value of array ");
    n=sc.nextInt();
    Area1 s1[]=new Area1[n];
    for(i=0;i<n;i++){
        s1[i]=new Area1();
        System.out.println("Enter value of r:");
        r=sc.nextInt();
        s1[i].accept(r);
    System.out.println("Area = "+s1[i].area());
        
       
    }

}
    
}
