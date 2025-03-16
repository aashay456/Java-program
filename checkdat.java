import java.util.*;


public class checkdat {
    public static void main(String args[]) {
        int day,month,year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day:");
        day = sc.nextInt();
        System.out.println("Enter the month:");
         month = sc.nextInt();
        System.out.println("Enter the year:");
         year = sc.nextInt();

        if (day >= 1 && day <= 31) {
            if (month >= 1 && month <= 12) {
                if (year >= 1000 && year <= 9999) {

                    switch (month) {
                        case 1:
                        case 3:
                        case 5:
                        case 7:
                        case 8:
                        case 10:
                        case 12:
                            System.out.println(day + "-" + month + "-" + year + " :valid day ");
                            System.out.println("1:increase \n 2: Decrease");
                            System.out.println("Enter your choice:");
                            int choice = sc.nextInt();
                            switch (choice) {
                                case 1:
                                    if (day == 31 && month == 12) {
                                        day = 1;
                                        month = 1;
                                        year++;
                                    } else if (day == 31) {
                                        month++;
                                        day = 1;
                                    } else {
                                        day++;
                                    }
                                    System.out.println("Next day:" + day + "-" + month + "-" + year);
                                    break;
                                case 2:
                                    if (day == 1 && month == 1) {
                                        day = 31;
                                        month = 12;
                                        year--;
                                    } 
                                    else if (day==1 && month==8) {
                                        day=31;
                                        month--;
                                        
                                    }
                                    else if (day == 1) {
                                       
                                        month--;
                                        day = 1;
                                       
                                    } else {
                                        day--;
                                    }
                                    System.out.println("previous day:" + day + "-" + month + "-" + year);

                            }
                            break;

                        case 4:
                        case 6:
                        case 9:
                        case 11:
                            System.out.println("1:increase \n 2: Decrease");
                            System.out.println("Enter your choice:");
                            int ch = sc.nextInt();
                            switch (ch) {
                                case 1:
                                    if (day <= 30) {
                                        System.out.println(day + "-" + month + "-" + year + " :valid day ");
                                    } else {
                                        System.out.println("not valid");
                                    }
                                    if (day == 30 && month == 11) {
                                        day = 1;
                                        month = 1;
                                        year++;
                                    } else if (day == 30) {
                                        month++;
                                        day = 1;
                                    } else {
                                        day++;
                                    }
                                    break;
                                case 2:
                                    if (day == 1 && month == 1) {
                                        day = 30;
                                        month = 12;
                                        year--;
                                    } else if (day == 1) {
                                        month--;
                                        day = 1;
                                    } else {
                                        day--;
                                    }
                                    System.out.println("previous day:" + day + "-" + month + "-" + year);

                            }
                            break;

                        case 2:
                            System.out.println("1:increase \n 2: Decrease");
                            System.out.println("Enter your choice:");
                            int choic = sc.nextInt();
                            if (month % 4 == 0 && day <= 29) {
                                System.out.println(day + "-" + month + "-" + year + ":valid day ");

                            } else if (day <= 28) {
                                System.out.println(day + "-" + month + "-" + year + ":valid day ");

                            } else {
                                System.out.println("invalid day ");
                            }
                            switch (choic) {
                            
                                   

                                    case 1:
                                    if(day==29)
                                    {
                                        day=1;
                                        month++;
                                    }
                                    else if(day==28)
                                    {
                                        day=1;
                                        month++;
                                    }
                                    else
                                    {
                                        day++;
                                    }
                                    System.out.println(d+"-"+m+"-"+y+"  Next Date");
                                    break;
                                     case 2:
                                    if(day==1)
                                    {
                                        day=31;
                                        month--;
                                    }
                                    else
                                    {
                                        day--;
                                    }
                                    
                        System.out.println("previous day:" + day + "-" + month + "-" + year);
                 

                            }
                            break;
                    }
                } else {
                    System.out.println("year is invalid");
                }
            } else {
                System.out.println("month is invalid");
            }
        } else {
            System.out.println("day is invalid");
        }
    }
}

