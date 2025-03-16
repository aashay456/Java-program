import java.util.Scanner;

class Student {
    int id;
    String name;
    double per;

    Student(){
        id=101;
        name="aashay";
        per=99.99;
    }
    Student(int id,String name,double per){
        this.id=id;
        this.name=name;
        this.per=per;


    }
    void display(){
        System.out.println("Roll no:"+id);
        System.out.println("NAME :"+name);
        System.out.println("PERCENTAGE:"+per);

    }
    public static void main(String[] args) {
        Student s1=new Student();
        s1.display();
        Scanner sc=new Scanner(System.in);
        System.out.println(" id,name,per");
        int id=sc.nextInt();
        String name=sc.next();
        Double per=sc.nextDouble();
        Student s2=new Student(id,name,per);
        s2.display();


    }
    
}
