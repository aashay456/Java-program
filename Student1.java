import java.util.Scanner;

public class Student1 {
    int rno;
    String name;
    double per;
     void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rno, name,per");
        rno=sc.nextInt();
        name=sc.next();
        per=sc.nextDouble();
     }
     void display(){
         System.out.println("ROLLNO = "+rno);
         System.out.println("NAME = "+name);
         System.out.println("PERCAENTAGE = "+per);
    }
    public static void main(String[] args) {
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of student:");
        n=sc.nextInt();
        Student1 s1[]=new Student1[n];
        for(i=0;i<n;i++){
            s1[i]=new Student1();
            s1[i].accept();
            s1[i].display();
        }
    }
    
}
