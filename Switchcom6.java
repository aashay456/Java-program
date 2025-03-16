
import java.util.Scanner;

public class Switchcom6 {
    public static void main(String[] args) {
//         1:first no is between Secod no and third no
// 2:min from 3 numbers
// 3:max from 3 numbers
// 4:ATKT
// 5:traingle
// 6:Blood donation
// 7:Aptitude exam
int a,b,c,ch;
double l,br,tri;
Scanner sc=new Scanner (System.in);
System.out.println("Enter three values :");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();

do { 


    System.out.println("1.First no is between second and third no");
    System.out.println("2.MInimum form 3 no");
    System.out.println("3.Max form 3 no");
    System.out.println("4.Atkt");
    System.out.println("5.Triangle");
    System.out.println("6.blood donation");
    System.out.println("7.Apptitude exam");
    System.out.println("ENter your choice:");
    ch=sc.nextInt();
    switch(ch){
        case 1:

     
		if((a>b)&&(c>a)){
			System.out.println(a+ " is between " + b + " and " + c);
		}
		else {
			System.out.println(a+ " is not between" + b + "and" + c);

        }
      
        break;
        case 2:
        if(a<b){
            if(a<c){
                System.out.println("a is minimum");

            }
            else{
                System.out.println("c is minimum");
            }

        }
        else{
            if (b<c) {
                System.out.println("b is minimum");
                
            }
            else{
                System.out.println("c is minimum");
            }
        }

        break;
        case 3:
        if(a>b){
            if(a>c){
                System.out.println("a is max");
            }
            else{
                System.out.println("c is max");
            }
        
        }
        else{
            if(b>c){
                System.out.println("b is max");
            }
            else{
                System.out.println("c is max");
            }
        }
        break;
        case 4:
    break;
       
   
        case 5:
       
        System.out.println("Enter the value of length and bregth");
         l=sc.nextDouble();
         br=sc.nextDouble();
         tri=0.5*l*b;
         System.out.println("the triangle is "+tri);
        break;
        case 6:
        System.out.println("Enter hb & weight & age ");
        double hb,weight,age;
        hb=sc.nextDouble();
        weight=sc.nextDouble();
        age=sc.nextDouble();
        if(age>=18){
            if (weight>=60) {
                if(hb>=12){
                    System.out.println("Eligible for blood donation");
                }
                else{
                    System.out.println("age & weight is valid but hb is not a valid");
                }
                
            }
            else{
                System.out.println("age is valid but weight is not a valid ");

            }
            
        }
        else{
            System.out.println("age is not valid");

        }
        break;
        case 7:
        System.out.println("Enter hb & weight & age ");
        double ten ,tw,gd;
        ten=sc.nextDouble();
        tw=sc.nextDouble();
        gd=sc.nextDouble();
        if(ten>=60){
            if (tw>=60) {
                if(gd>=65){
                    System.out.println("Eligible for apptitude");
                }
                else{
                    System.out.println("tenth & twelth marks is valid but gradution marks is not a valid");
                }
                
            }
            else{
                System.out.println("tenth marks is valid but twelth marks is not a valid ");

            }
            
        }
        else{
            System.out.println("theth marks is not valid");

        }
        break;




    }
    
} while (ch<=7);

    }
    
}
