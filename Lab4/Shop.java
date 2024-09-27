import java.util.Scanner;
public class Shop {


    static {
            

    }
    private String shopName;
    private String shopAddress;
    private Person owner;
    private Product[] productlist = new Product[100];

    private static int productCounter = 0;


    public Shop(String shopName, String shopAddress,Person owner) {
        this.shopName = shopName;
        this.shopAddress = shopAddress;
        this.setOwner(owner);
        this.productlist = new Product[100];
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Product[] getProductlist() {
        return productlist;
    }

    public void setProductlist(Product[] productlist) {
        this.productlist = productlist;
    }



//Method to add product
    public void addProduct() {
        productCounter++;
        Scanner ip = new Scanner(System.in);

        System.out.println("Enter product details...");

        System.out.print("Enter product name: ");
        String productName = ip.nextLine();

        System.out.print("Enter product price: ");
        double productPrice = ip.nextDouble();

        System.out.print("Enter product quantity: ");
        int productQuantity = ip.nextInt();

        productlist[productCounter] = new Product(productName, productPrice, productQuantity);
        System.out.println("Product added to shop successfully.");

    }


//method to view product
    public void viewProduct(int productID) {
        for (int i = 0; i < productlist.length; i++) {
            if (productlist[i] == productlist[productID]) {
                System.out.println(productlist[i]);
                break;
            }
        }

//method to Delete book


    }


}
