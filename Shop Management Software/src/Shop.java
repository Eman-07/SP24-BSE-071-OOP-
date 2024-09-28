import java.util.Scanner;
public class Shop {
    private String shopName;
    private String shopAddress;
    private Person shopOwner;
    private static Product products[] = new Product[20];

    public static int productCount = 0 ;
    static {
        products[productCount++] = new Product("Keyboard" , 500 , 10);
        products[productCount++] = new Product("Mouse" , 200 , 15);
        products[productCount++] = new Product("Ram" , 1500 , 20);
        products[productCount++] = new Product("SSD" , 2000 , 25);
        products[productCount++] = new Product("GPU" , 5000 , 30);

    }


    Shop(String shopName, String shopAddress, Person shopOwner) {
        this.shopName = shopName;
        this.shopAddress = shopAddress;
        this.shopOwner = shopOwner;
    }
    Shop(){
        this("no name", "no address", new Person("unknown","null@gmail.com") );
    }





    public void displayAllProducts() {
        for (int i = 0; i < productCount; i++) {
            if (products[i] != null) {
                System.out.println( i+" : "+products[i]);
            }
        }
    }

    public void addProduct() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter product name: ");
        String name = input.nextLine();

        System.out.print("Enter product price: ");
        double price = input.nextDouble();

        System.out.print("Enter product quantity: ");
        int quantity = input.nextInt();

        products[productCount++] = new Product(name, price, quantity);
        System.out.println("Product added successfully");
        input.close();
    }


    public void removeProduct() {
        Scanner input = new Scanner(System.in);

        Product temp[] = new Product[productCount];
        temp = products;

        System.out.println("These are the products in the shop");
        displayAllProducts();

        System.out.print("Enter product name you want to remove: ");
        String name = input.nextLine();
        int i;
        for ( i = 0; i < productCount; i++) {
            if (temp[i].getProductName().equals(name)) {

                System.out.println("Product Found");
                System.out.println(temp[i]);
                productCount = productCount - 1;
                for (int j = 0; j < i; j++) {
                    products[j] = temp[j];
                }
                for(int k = i; k <= productCount; k++) { //k=2 , k<3
                    products[k] = temp[k+1];
                }
                break;
            }
        }


        System.out.println("Product removed successfully");
        temp = null;
    }





    @Override
    public String toString() {
        return String.format("Name : %s Address : %s Owner : %s",shopName, shopAddress, shopOwner);
    }




}
