// import java.util.Scanner;

// public class Multiplication_table1{
//     public static void main(String[] args) {
//         int mul=1;
//         Scanner input =new Scanner(System.in);
//         int n=input.nextInt();
//         for(int i=1;i<=10;i++){
//             mul=n*i;
//             System.out.println(n+"*"+i+"="+mul);
//         }
//     }
// }
import java.util.Scanner;

public class Multiplication_table1{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int n=input.nextInt();
        int i=1,mul=1;
        while(i<=10){
            mul=n*i;
            System.out.println(n+"*"+i+"="+mul);
            i++;
        }
        
    }
}
//output
// n=10
// 10*1=10
// 10*2=20
// 10*3=30
// 10*4=40
// 10*5=50
// 10*6=60
// 10*7=70
// 10*8=80
// 10*9=90
// 10*10=100