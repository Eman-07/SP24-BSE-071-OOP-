public class Car extends Vehical{
    private int seats;


    Car(){
        System.out.println("Default Car constructor");
    }  

    Car(String make,int seats){ 
        super(make);
        this.seats = seats;
        System.out.println("Parametrized Car constructor");
    }

    Car(int seats){
        this.seats = seats;
    }

    public void display(){
        System.out.println("Number of seats " + seats);
    }
}