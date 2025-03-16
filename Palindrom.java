public class Palindrom {
    public static void main(String[] args) {
        int[] num={1,2,3,2,1};
        int i=0;
        int j=num.length-1;
        int flag=1;
        int check=1;
        while(check<=num.length /2){
            if(num[i]!=num[j]){
                flag=0;
                System.out.println("not palindrom");
        }
        i++;
        j--;
        check++;
    }
    if(flag==1){
        System.out.println("It is palindrom No");
    }
    
}
}
