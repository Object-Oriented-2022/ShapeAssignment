package org.example.Shapes;

public class Circle extends Shape{
    private String radius;

    public Circle(String radius, int ID){
        super("Blue", ID);
        setRadius(radius);
    }

    public String getRadius() {
        return radius;
    }

    public void setRadius(String radius) {
        this.radius = radius;
    }

    @Override
    public String toString(){
        return "Circle, Color: " + getColor() +
                ", Origin: " + getOrigin() + ", Radius: "
                + radius;
    }
}
