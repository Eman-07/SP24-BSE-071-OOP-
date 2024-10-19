public class Shape3d extends Shape {

    public Shape3d() {
    }
    @Override
    public void display(){
        System.out.println("3D Shape");
    }

    @Override
    public void perimeter(){
        System.out.println("3D Shapes has no perimeter");
    }
    @Override
    public void diagonal(){
        System.out.println("3D Shapes has no diagonal");
    }
}
