public class Vehical{
    String make;
    String model;

    Vehical(String make , String model){
        this.make = make;
        this.model = model;
    }


    public void display(){
        System.out.printf("Make : %s\nModel : %s",make ,model);
    }

}