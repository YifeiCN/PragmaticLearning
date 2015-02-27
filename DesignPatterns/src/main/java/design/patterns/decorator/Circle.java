package design.patterns.decorator;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle drawn");
    }

    @Override
    public String toString() {
        return "Circle";
    }

}
