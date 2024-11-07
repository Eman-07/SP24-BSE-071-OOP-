public class SmartPhone extends Phone implements Camera,Gps{
    public void screenReso(){
        System.out.println("1080p");
    }

    public void display(){
        System.out.println("I am SmartPhone");
    }
    @Override
    public void camera() {
        System.out.println("Camera is 48mp");
    }

    @Override
    public void location() {
        System.out.println("GPS is on");


    }



}
