public class PrimeNo {
    public static void main(String[] args) {
        int[] nums={21,19,12,81,83,37};
        int[] pprime = new int[3];
        int[] nprime = new int[3];
        int ncount=0;
        int pcount=0;


        for( int i=0;i<nums.length;i++){
            int flag=1;
            for(int j=2;j<=nums[i]/2;j++){
                if(nums[i]%j==0){
                    flag=0;
                    nprime[ncount]=nums[i];
                    ncount ++;
                    break;
                }

            }
        
            if(flag==1){
                pprime[pcount]=nums[i];
                pcount ++;
            }
        }
            System.out.println("Prime no");
            for(int i=0;i<pprime.length;i++){
                System.out.println(pprime[i]);
            }
            System.out.println("Prime no");
            for(int i=0;i<nprime.length;i++){
                System.out.println(nprime[i]);
            }
        
        
    }
    
}

