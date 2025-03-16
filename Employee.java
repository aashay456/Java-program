import java.util.Scanner;

public class Employee {
   
 int eid;
 String ename;
 float salary;
 String designation;
 void a(){
    Scanner sc =new Scanner(System.in);
    eid=sc.nextInt();
    ename=sc.next();
    salary=sc.nextFloat();
    designation=sc.next();
 }
 void b(){
    System.out.println("Enter ID of Vehicel = "+ eid);
    System.out.println("Enter NAME of Vehicel = "+ ename);
    System.out.println("Enter SALARY of Vehicel = "+ salary);
    System.out.println("Enter DESIGNATION of Vehicel = "+ designation);


 }
 public static void main(String[] args) {
    Employee s1=new Employee();
    s1.a();
    s1.b();
    Employee s2=new Employee();
    s2.a();
    s2.b();
    Employee s3=new Employee();
    s3.a();
    s3.b();

 }
    
}
