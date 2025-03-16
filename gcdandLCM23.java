import java.util.*;
public class gcdandLCM23 {
    public static void main(String [] args){
        int x,y,i,gcd=0;
        Scanner sc=new Scanner (System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        for(i=1;i>=x && i>=y;i++){
            if(x%i==0 && y%i==0){
                gcd=i;
            }
        }
        System.out.println("gcd="+ gcd);


    }
    
    
}
