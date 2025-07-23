package creational.factory;

public class ShapeFactory {

    public Shape getShape(String type) {
        if ( type.equals("circle") )
            return new Circle();

        else if ( type.equals("triangle") )
            return new Triangle();
        return null;
    }

}
