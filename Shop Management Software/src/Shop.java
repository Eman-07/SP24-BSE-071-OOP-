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
                System.out.println( i+":  "+products[i]);
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
        input.close();
    }


    public void modifyProduct(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Products in Shop");
        displayAllProducts();

        System.out.println("Enter the id of product you want to modify: ");
        int id = sc.nextInt();

        // product id is equal to sr of product which is managed by productCount
        if (products[id] != null) {
            System.out.println("Product found");

            int choice = 1;

            do {
                System.out.println(products[id]);

                System.out.printf("Which attribute would you like to edit?\n1)Name\n2)Price\n3)Quantity\n Selection : ");
                int selection = sc.nextInt();

                switch (selection) {

                    case 1:
                        sc.nextLine(); //it takes the last line
                        System.out.print("Enter New Name for the product: ");
                        String name = sc.nextLine();
                        products[id].setProductName(name);
                        System.out.println("Product updated successfully");
                        break;

                    case 2:
                            System.out.print("Enter New Price for the product: ");
                            double price = sc.nextDouble();
                            products[id].setPrice(price);
                            System.out.println("Product updated successfully");
                            break;
                    case 3:
                        System.out.print("Enter New Quantity for the product: ");
                        int quantity = sc.nextInt();
                        products[id].setQuantity(quantity);
                        System.out.println("Product updated successfully");
                        break;
                }

                System.out.printf("Do you want to change something again\n1 for yes\n0 for no");
                choice = sc.nextInt();
            }while(choice == 1);

        }
        sc.close();
    }


    public void searchProduct() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter product name: ");
        String name = input.nextLine();

        int i ;
        for ( i = 0; i < productCount; i++) {
            if (products[i].getProductName().equals(name)) {

                System.out.println("Product found");
                System.out.println(products[i]);
                break;
            }
        }
    }





    @Override
    public String toString() {
        return String.format("Name : %s Address : %s Owner : %s",shopName, shopAddress, shopOwner);
    }




}
