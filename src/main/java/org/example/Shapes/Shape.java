package org.example.Shapes;

public abstract class Shape {
    private int ID;
    private String color;
    private String origin;

    public Shape(String color, int ID){
        setID(ID);
        setColor(color);
        setOrigin("(0,0)");
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

}
