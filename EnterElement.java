import java.util.Scanner;

public class EnterElement {
    public static void main(String[] args) {
        int n =5;
        int[] arr = new int[n];
        Scanner sc = new Scanner(System.in);
        for( int i=0;i<n;i++){
            System.out.println("Enter element");
            arr[i]=sc.nextInt();

        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        
    }
    
}
