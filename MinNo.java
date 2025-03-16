public class MinNo {
    public static void main(String[] args) {
        int[] arr={45,52,22,10,5};
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
