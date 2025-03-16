import java.util.*;
class Area {
//     double r;
//     double a;
//     Area(){
//         r=2;
//         a=3.14*r*r;
//     }
//     void display(){
//         System.out.println("Area of circle is ="+ a);

//     }
//    public static void main(String[] args) {
//     Area s1=new Area();
//     s1.display();
//    }
//In using retrun type of an constructor
double r;
double a;
Area(double r){
    this.r=r;

}

 double area1(){
    a=3.14*r*r;
    return (a);
}

public static void main(String[] args) {
double r,a;
Scanner sc=new Scanner (System.in);
r=sc.nextDouble();

    Area a1=new Area(r);
    a=a1.area1();
    System.out.println(a);
}

    
}
