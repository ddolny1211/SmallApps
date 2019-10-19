package Exercises.objects;

public class Rectangle {

    private double width;
    private double height;

    public double getField() {
        return getHeight() * getWidth();
    }

    public double getCircuit() {
        return (2 * getWidth()) + (2 * getHeight());
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
