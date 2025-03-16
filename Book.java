
class Book {

    int bid;
    String bname;
    String authore;
    float price;

    Book() {
        bid = 101;
        bname = " the aditya";
        authore = "adii";
        price = 1434;

    }

    void display() {
        System.out.println("id =" + bid);
        System.out.println("id =" + bname);
        System.out.println("id =" + authore);
        System.out.println("id =" + price);

    }

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.display();
     

    }

}
