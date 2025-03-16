 class Vehicle {
    int vid;
    String vname;
    String color;
    float price;

Vehicle() {
    vid=101;
    vname="aashay";
    color="black";
    price=45;
    }
    void display(){
        System.out.println("vid ="+vid);
        System.out.println("vid ="+vname);
        System.out.println("color ="+color);
        System.out.println("price = ="+price);
    }
    public static void main(String[] args) {
        
        Vehicle v1=new Vehicle();
        v1.display();

        

    }
    
}
