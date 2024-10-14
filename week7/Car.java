
public class Car extends Vehical {
    private int numberOfSeats;


    
    Car(){
        super("Honda", "Prius");
    }

    @Override
    public void display(){
        System.out.println("Make : " + make + "Model : " + model + "Number of Seats" + numberOfSeats);
    }
}
