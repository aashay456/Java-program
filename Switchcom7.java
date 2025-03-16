import java.util.Scanner;

public class Switchcom7 {
    public static void main(String[] args) {
        int a,b,ch;
        Scanner sc=new Scanner (System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        do { 
            System.out.println("1.Max of 2 No");
            System.out.println("2.profit or loss");
            System.out.println("3.qudrant");


            System.out.println("Enter your choice:");
            ch=sc.nextInt();
            switch(ch){
                case 1:
                if(a>b){
                    System.out.println(" a is max");
                }
                else{
                    System.out.println("b is max");
                }
                break;
                case 2:
                double cp,sp;
                System.out.println("Enter the cost price:");
                cp = sc.nextDouble();
        
                System.out.println("Enter the selling price:");
             sp = sc.nextDouble();
        
                if (sp > cp) {
                    double profit = sp - cp;
                    System.out.println("Profit: " + profit);
                } else if (sp < cp) {
                    double loss = cp - sp;
                    System.out.println("Loss: " + loss);
                } else {
                    System.out.println("No profit or loss");
                }
                break;
                case 3:
                double x, y;
                System.out.println("Enter the x-coordinate:");
                x = sc.nextDouble();
            
                System.out.println("Enter the y-coordinate:");
                y = sc.nextDouble();
            
                if (x > 0 && y > 0) {
                    System.out.println("Quadrant: I");
                } else if (x < 0 && y > 0) {
                    System.out.println("Quadrant: II");
                } else if (x < 0 && y < 0) {
                    System.out.println("Quadrant: III");
                } else if (x > 0 && y < 0) {
                    System.out.println("Quadrant: IV");
                } else if (x == 0 && y == 0) {
                    System.out.println("Origin");
                } else if (x == 0) {
                    System.out.println("Y-axis");
                } else if (y == 0) {
                    System.out.println("X-axis");
                }
                

                break;

            }

            
        } while (ch<=4);
    }
    
}
