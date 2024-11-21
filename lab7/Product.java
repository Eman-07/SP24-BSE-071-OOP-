import java.util.Comparator;

public class Product implements Comparable, Comparator {



    String name;
    double price;
    int id;
    double rating;


    public Product(String name, double price, int id, double rating) {
        this.name = name;
        this.price = price;
        this.id = id;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public int compareTo(Object o) {
        Product p = (Product) o;

        int status = 0;
        if (this.id>((Product) o).id){
            status = -1;
            return status;
        }
        return status;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", id=" + id +
                ", rating=" + rating +
                '}';
    }

    @Override
    public int compare(Object o1, Object o2) {
        Product p1 = (Product) o1;
        Product p2 = (Product) o2;
        int status = 0;

        if (((Product) o2).price > ((Product) o1).price){
            status = -1;
        }

        return status;
    }


    @Override
    public boolean equals(Object obj) {
        Product p1 = (Product) obj;

        if (this.id == p1.id){
            return true;
        }

        return false;
    }
}
