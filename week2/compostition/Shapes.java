public class Shapes {
    private double circleRadius;

    public void setCRadius(double radius1){
        if (radius1>0) {
            circleRadius = radius1;
        }
    }

    Area ac = new Area();
    
    
    public double cirlceArea(){
        return ac.setCircleRadius(circleRadius);
    }
}