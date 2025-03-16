
import java.util.Scanner;

public class Switchcasecombination2 {
    public static void main(String[] args) {
        int n, ch,u;
        double  UC,ECharge = 0.0,EC,total,rprice=100,dprice;

        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the value of n:");
        n=sc.nextInt();
        do { 

System.out.println(" 1.Divisible by 17");
System.out.println("2.Divisible by 5 and 7");
System.out.println("3.divisible by 5 or 7");
System.out.println("4.Leap year or not");
System.out.println("5.Even or Odd");
System.out.println("6.Positive or negative no");
System.out.println("7.calculate electricity bill");
System.out.println("8.Program for age");
System.out.println("9.Discount ");
System.out.println("10.pin set ");
System.out.println("Enter yours choice:");
ch=sc.nextInt();
switch(ch){

case 1:
if(n%17==0){
    System.out.println("it is divisible by 17");
}
else{
    System.out.println("it is not divisible by 17");
}
break;
case 2:
if((n%5==0) && (n%7==0)){
    System.out.println("it is divisible by 5 and 7");
}
else{
    System.out.println("It is not divisible by 5 and 7");
}
break;
case 3:
if((n%5==0)||(n%7==0)){
    System.out.println("It is divisible by 5 or 7");
}
else{
    System.out.println("It is  not divisible by 5 or 7");
}
break;
case 4:
if(n%4==0){
    System.out.println("it is leap year");
}
else{
    System.out.println("it is not a leap year");
}
break;
case 5:
if(n%2==0){
    System.out.println("it is EVEN no");
}
else{
    System.out.println("It is ODD no");
}
break;
case 6:
if (n>0){
    System.out.println("It is POSITIVE No");
}
else if(n<0){
    System.out.println("It is NEGATIVE No");
}
else{
    System.out.println("It is ZERO");
}
break;
case 7:
System.out.println("Enter Unit : ");
u=sc.nextInt();
if(u<=100)
{
    ECharge =u*4.17;
    System.out.println(ECharge+" For 100 unit ");
}
else if(u>=101 && u<=300 )
{
    ECharge=u*10.29;
    System.out.println(ECharge+" For 101 to 300 unit ");
}
else if(u>=301 && u<=500)
{
    ECharge=u*14.55;
    System.out.println(ECharge+" For 301 to 500 unit ");
}
else if(u>=501 && u<=1000)
{
    ECharge=u*16.64;

    System.out.println(ECharge+" For 501 to 1000 unit ");
}
else if(u > 1000)
{
    ECharge=u*17.16;
    System.out.println(ECharge+" For 1000 unit ");
}
UC=u*1.17;
EC=((102+ECharge+UC)*0.16);
total=102+ECharge+UC+EC;
System.out.println("Unit Charge="+UC);
System.out.println("tax="+EC);
System.out.println("Total bill="+total);
break;
case 8:
System.out.println("Enter your age:");
n=sc.nextInt();
if(n>=18){
    System.out.println("Eligibal for votting");
}
else{
    System.out.println("It is not eligible for votting");
}
break;
case 9:
System.out.println("Enter Your Age : ");
n = sc.nextInt();

if(n<=12 && n>=1)
{
    dprice = 100*0.10;
    System.out.println(dprice+" rs. is Discount...");
}
else if(12 < n && n < 65)
{
    System.out.println(rprice+" Regular price...");
}
else if(n>=65 && n >=100)
{
    dprice = rprice*0.12;
    System.out.println(dprice+ " rs. is Discount...");
}
break;


case 10:
System.out.println("Enter a pin");
n=sc.nextInt();
if(n==5555){
    System.out.println("Take your cash");
}
else{
    System.out.println("Invalid pin ");
}
break;
}            
        } while (ch<=10);
    }
    
}
