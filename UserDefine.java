import java.util.Scanner;
 class InvalidException extends Exception
{
    public String toString(){
        return "Sorry age must gretter than 18";
    }
}

public class UserDefine {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age:");
        a=sc.nextInt();

        try {
            if(a<18){
                throw new InvalidException();
            }
            else{
                System.out.println("Eligibal for voting");
            }
            
        } 
        catch ( InvalidException e) {
            System.out.println(e);
        }
        System.out.println("Rest of the code ");


    }
    
}
