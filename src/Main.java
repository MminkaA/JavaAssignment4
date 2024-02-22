interface Shape {
    void draw();
}

// Concrete products
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("drawing Circle");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("drawing Square");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("drawing Rectangle");
    }
}

class ShapeFactory {
    public Shape createShape(String type) {
        switch (type.toLowerCase()) {
            case "circle":
                return new Circle();
            case "square":
                return new Square();
            case "rectangle":
                return new Rectangle();
            default:
                throw new IllegalArgumentException("invalid shape type: " + type);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        // Creating different shapes using the factory
        Shape circle = factory.createShape("circle");
        circle.draw();

        Shape square = factory.createShape("square");
        square.draw();

        Shape rectangle = factory.createShape("rectangle");
        rectangle.draw();
    }
}