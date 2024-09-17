public class Driver{
	public static void main(String args[]){

	Rectangle r = new Rectangle();
	r.setLength(-5);
	r.setWidth(4);
	double area = r.calArea();
	double perimeter = r.calPerimeter();

	System.out.printf("The area is %.4f",area);
	System.out.printf("\nThe Perimeter is %.4f\n",perimeter);		
	
	Circle c = new Circle();
	c.setRadius(1.5);
	double carea = c.area();
	double circumference = c.circumference();

	System.out.println("Area of circle is : "+carea);
	System.out.println("Circumference of circle is : "+circumference);
	
		

	}
}