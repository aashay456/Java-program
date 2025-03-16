
import java.util.Scanner;

public class Maxof4NO {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c, d;
        System.out.println("enter the num:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        if(a>b){
            if(a>c){
                if(a>d){
                    System.out.println(" a max");
                }
                else{
                    System.out.println("d max");
                }

            }
            else{
                if(c>d){
                    System.out.println("c max");
                }
                else{
                    System.out.println(" d max");
                }
            }
        }
            else{
                if(b>c){
                    if(b>d){
                        System.out.println("b max");
                    }
                    else{
                        System.out.println("d max");
                    }

                }
                else{
                    if(c>d){
                        System.out.println("c max");
                    }
                    else{
                        System.out.println("d amx");
                    }
                }
            }


        }

     

    }


