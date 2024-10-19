// Rectangle class extending Shape2D
class Rectangle extends Shape2d {
    private double length;
    private double width;

    // Constructor for Rectangle
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    // Getter methods for length and width (optional)
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }




    // Overriding getArea() to calculate area for a rectangle
    @Override
    public void area() {
        System.out.println("Area of Rectangle : "+ length*width);
    }

    // Overriding displayShape() to specify that this is a rectangle
    @Override
    public void display() {
        System.out.println("-------------------------------------");
        System.out.println("Shape : Rectangle \nLength : "+length+" \nWidth : "+width );
//        perimeter();
//        area();
//        diagonal();
        System.out.println("-------------------------------------");

    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter of Rectangle : "+ (length+width)*2);
    }
    @Override
    public void diagonal() {
        System.out.println("Diagonal of Rectangle : "+ Math.sqrt((length*length)+(width*width)));
    }

}