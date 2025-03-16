import java.util.Scanner;

public class SwitchDay2 {
    public static void main(String[] args) {
        int day;
        String d="",daytype="";
      
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a day");
        day=sc.nextInt();
        switch(day)
        {
            case 1:
            d="monday";
            daytype="Weekday";
            break;

            case 2:
            d="tueday";
            daytype="Weekday";
            break;
            case 3:
            d="wednesday";
            daytype="Weekday";
            break;
            case 4:
            d="thursday";
            daytype="Weekday";
            break;
            case 5:
            d="friday";
            daytype="Weekday";
            break;
            case 6:
            d="saturday";
            daytype="Weekday";
            break;
            case 7:
            d="sunday";
            daytype="Weekday";
            break;
            default:
            daytype="Invalid day";
            
        }
        System.out.println(d + " is a " + daytype);

    }
    
}
