import java.util.Scanner;

public class secconvertHMS {
    public static void main(String[] args) {
        int h,m,s,seconds;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        seconds = scanner.nextInt();

         h = seconds / 3600;
         m= (seconds % 3600) / 60;
         s = seconds % 60;

        System.out.println("Hours: " + h);
        System.out.println("Minutes: " + m);
        System.out.println("Seconds: " + s);

    }
}
