public class TestFinally {
    public static void main(String[] args) {
        try{
            int data=25/5;
            System.out.println(data);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Finally block is always Execute:");
        }
        System.out.println("Rest of the code ");
    }


}
