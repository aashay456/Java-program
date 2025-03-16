import java.util.Scanner;
class InvalidException extends Exception
{
    public String toString(){
        return "Not Eligible for votting";
    }
}

public class Main1 {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age:");
        a=sc.nextInt();
        try{
            if(a<18 || a>125){
                throw new InvalidException();

            }
            else{
                System.out.println("valid age for voting");
            }
            
        }
        catch(InvalidException e){
            System.out.println(e);

        }


    }
    
}
