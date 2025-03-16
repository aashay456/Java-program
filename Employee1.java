
import java.util.Scanner;

class Employee1 {

    int id;
    String name;
    float salary;

    Employee1(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;

    }

    void display() {
        System.out.println("Id =" + id);
        System.out.println("NAME =" + name);
        System.out.println("SALARY=" + salary);
    }

    public static void main(String[] args) {
        int id;
        String name;
        float salary;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of id,name,salary:");
        id=sc.nextInt();
        name=sc.next();
        salary=sc.nextFloat();
        Employee1 e1 = new Employee1(id, name, salary);
        e1.display();

    }

}
