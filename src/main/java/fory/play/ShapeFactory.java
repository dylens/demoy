package fory.play;

public class ShapeFactory {

    public static Shape create(String shape){
        if(shape.equals("Circle")){
            return new Circle();
        }
        if(shape.equals("Rectangle")){
            return new Rectangle();
        }
        return null;
    }
}