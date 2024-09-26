public class Shop {

    private String shopName;
    private String shopAddress;
    private Product[] products;

    public Shop(String shopName, String shopAddress, Product[] products) {
        this.shopName = shopName;
        this.shopAddress = shopAddress;
        this.products = products;
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

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
}
