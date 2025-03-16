import java.util.*;
public class ContainString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="independentindiatyg";
        System.out.println("Enter second String:");
        String str1=sc.nextLine();
        if(str.contains(str1)){
            System.out.println(str+ "  it is present  "+str1);

        }
        else{
            System.out.println(str+"  it is not between in that city  "+str1);
        }


    }
    
}
