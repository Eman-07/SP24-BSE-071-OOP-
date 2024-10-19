public class Circle extends Shape2d{
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void circumference() {
        System.out.println("Circle circumference : " + 2*Math.PI*radius);
    }
}
