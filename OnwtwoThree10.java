import java.util.Scanner;

public class OnwtwoThree10 {
    public static void main(String[] args) {
        int n,n1,sum=0;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the No:");
        n=sc.nextInt();
        while(n>0){
            n1=n%10;
            n=n/10;
            sum=sum*10+n1;
        }
        n=sum;
        while (n>0) {
            n1=n%10;
            n=n/10;
            switch(n1){
                case 0:System.out.println("Zero");
                break;
                case 1:System.out.println("One");
                break;
                case 2:System.out.println("Two");
                break;
                case 3:System.out.println("Three");
                break;
                case 4:System.out.println("Four");
                break;
                case 5:System.out.println("Five");
                break;
                case 6:System.out.println("Six");
                break;
                case 7:System.out.println("Seven");
                break;
                case 8:System.out.println("Eight");
                break;
                case 9:System.out.println("nine");
                break;
                
            }
            
        }

        }
    
}
