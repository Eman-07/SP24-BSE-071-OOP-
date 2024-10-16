public class Vehical{
    private String make;


    Vehical(){
        System.out.println("Default vehical constructor");
    }
    Vehical(String make){
        this.make = make;
        System.out.println("Parametrized Vehical constructor");
    }



    public void display(){
        System.out.println("Make : "+make);
    }
}