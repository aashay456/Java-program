public class MaxNo {
    public static void main(String[] args) {
        int[] array={1000,20,6,52,456,78,100};
        int max=array[0];
           for(int i=0;i<array.length;i++){
                 if(max<array[i]){
                    max=array[i];
                 }
           }
           System.out.println(max);
    }
    
}
