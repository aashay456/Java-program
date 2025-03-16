import java.util.Scanner;

public class Student {
    int rollno;
    String name;
    float marks;
  
    void accept(){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the variables:");
        rollno =sc.nextInt();
        name =sc.next();
        marks =sc.nextFloat();
}
void display(){
    System.out.println("Enter the rool no = " + rollno);
     System.out.println("Enter the name = " + name);
     System.out.println("Enter the name = "+ marks);


}
    public static void main(String[] args) {
        Student s1=new Student();
        s1.accept();
        s1.display();
        Student s2=new Student();
        s2.accept();
        s2.display();
    }
    
}
