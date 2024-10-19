public class Sphere extends Shape3d{
    private double radius;
    public Sphere(double radius) {
        this.radius = radius;
    }
    @Override
    public void display() {
        System.out.println("-------------------------------------");
        System.out.println("Name : Sphere\nRadius : "+radius);
        System.out.println("-------------------------------------");
    }

    @Override
    public void area(){
        System.out.println("Surface Area : " + 4*Math.PI*Math.pow(radius, 2));
    }

    @Override
    public void volume(){
        System.out.println("Volume : " + (4/3)*Math.PI*Math.pow(radius, 3));
    }


}
