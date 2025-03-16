import java.util.*;
 class Employee{
    int eid;
	String name;
	double salary;
	Employee()//defualt constructor
	{
		eid=101;
		name="Sam";
		salary=9876.90;		
	}
	Employee(int eid,String name,double salary)//parameterized constuctor
	{
		this.eid=eid;
		this.name=name;
		this.salary=salary;
	}	
	void display()
	{
		/*System.out.println("Emp id="+eid);
		System.out.println("Name="+name);
		System.out.println("Salary="+salary);*/
System.out.println(eid+"\t"+name+"\t"+salary);
		
	}	

}
public class Emp_Demo {

	public static void main(String[] args) 
	{
		int eid,i;
		String name;
		double salary;
	 Employee e=new Employee();
		e.display();
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter no of records");
		int n=sc.nextInt();

      	 Employee e1[ ]=new Employee[n];//array creation
      	for(i=0;i<n;i++)
      	{	
		System.out.println("Enter id ,name & salary");
		eid=sc.nextInt();
		name=sc.next();
		salary=sc.nextDouble();
		e1[i]=new Employee(eid,name,salary);//object creation


		
      	}
	System.out.println("Eid\tEname\tSalary");	
	System.out.println("____________________________\n");
      	for(i=0;i<n;i++)
      	{
      		e1[i].display();
      	}
      	
	}

    
}
