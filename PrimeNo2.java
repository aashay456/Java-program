import java.util.Scanner;

public class PrimeNo2 {
    public static void main(String[] args) {
        int i=2,div=0;
        Scanner input=new Scanner (System.in);
        System.out.println("Enter the No:");
        int n=input.nextInt();
        while(i<=n/2){
            if(n%i==0){
                div=1;
                break;
            }
            i++;
        }
       
        if(div==0){
            System.out.println(n+" is a prime No");
                   }
          else{
            System.out.println(n+" is not a prime No");
            }
      
        }
    }  
    
    
    

