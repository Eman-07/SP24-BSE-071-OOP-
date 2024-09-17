public class Rectangle{
	
	private double length;
	private double width;
	
	void setLength(double length1){
		if(length1>0)
			length=length1;
	}
	double getLength(){
		return length;
	}

	void setWidth(double width1){
		if(width1>0)
			width=width1;
	}
	double getWidth(){
		return width;
	}
	
	double calArea(){
		return (length*width);
	}
	
	double calPerimeter(){
		return (length+width)*2;
	}

}
