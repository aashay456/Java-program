public class EvenOdd {
    public static void main(String[] args) {
        int[] arr={25,26,31,34,18,17};
        int[] even=new int[3];
        int[] odd=new int[3];
       int ecount=0;
       int ocount=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even[ecount]=arr[i];
                ecount++;
            }
            else{
                odd[ocount]=arr[i];
                ocount++;
            }
        }
        System.out.println("Even No:");
        for(int num:even){
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println("Odd No:");
        for(int num:odd){
            System.out.print(num+" ");
        }

    }
    
}
