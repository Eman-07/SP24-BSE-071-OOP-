package equalsMethod;

public class Laptop {
    private String brand;
    private String model;
    private int ReleasedYear;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getReleasedYear() {
        return ReleasedYear;
    }

    public void setReleasedYear(int releasedYear) {
        ReleasedYear = releasedYear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Laptop(String brand, String model, int releasedYear) {
        this.brand = brand;
        this.model = model;
        ReleasedYear = releasedYear;
    }

    Laptop(){

    }


    @Override
    public boolean equals(Object o){
        Laptop temp = (Laptop)o;
        return brand.equals(temp.brand);
    }

    @Override
    public Laptop clone(){
//        Laptop temp = (Laptop)o;
            return new Laptop(brand,model,ReleasedYear);
    }

    @Override
    public String toString(){
        return "Brand : " + brand +"\nModel : " + model + "\nYear : " + ReleasedYear;
    }
}
