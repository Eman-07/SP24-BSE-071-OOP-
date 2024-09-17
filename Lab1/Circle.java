public class Circle{
		
	private double radius;
	
	void setRadius(double radius1){
		if(radius1>0)
			radius=radius1;
	}
	double getRadius(){
		return radius;
	}


	
	double area(){
		return (3.14*radius*radius);
	 }
	double circumference(){
		return (2*3.14*radius);
	}
}