public class Main {
    public static void main(String[] args) throws ClassCastException{
        Phone phone = new SmartPhone();
        phone.display();

        SmartPhone smartPhone = new SmartPhone();
        ((Phone) smartPhone).display();

        Camera c = new SmartPhone();

        c.camera();

        ((Phone) c).display();


        Phone phone2 = new Phone();

        phone2.display();
try {

    Main.divide(4,0);

}catch (Exception e){
    System.out.println(e.getMessage());
    System.out.println("I am in Catch");
    return null;
}

        finally {
    System.out.println("I am in finally");
        }


        System.out.println("HAHAHAHA");
    }

    public static int divide(int a , int b){
        return a/b;
    }
}
