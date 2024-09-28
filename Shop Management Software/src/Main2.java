public class Main2 {
    public static void main(String[] args) {
        Product p1 = new Product("book" , 100, 5);
        Product p2 = new Product("book" , 100, 5);

        if (p1.equals(p2))
            System.out.println("product are the same");
        else
            System.out.println("product are not the same");
    }
}
