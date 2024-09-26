public class Product {
    private String productName;
    private double price;
    private String id;
    private int quantity;

    private static int idCounter = 1;




    public Product(String productName, double price , int quantity) {
        this.setProductName(productName);
        this.setPrice(price);
        this.id = String.format("%03d", idCounter++);
        this.setQuantity(quantity);
    }


    public String getId() {
        return id;
    }
//SETTERS
    public void setProductName(String productName) {
        if (productName != null && productName.length() > 2)
                this.productName = productName;
    }

    public void setPrice(double price) {
        if (price >= 0)
             this.price = price;
    }

    public void setQuantity(int quantity) {

        if (quantity >= 0)
             this.quantity = quantity;
    }

//GETTERS
    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }



    @Override
    public String toString() {
        return String.format("id : %s  Name : %-13s  Price : %.2f$  Quantity : %d", id, productName, price , quantity);
    }

}
