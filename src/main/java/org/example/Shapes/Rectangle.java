package org.example.Shapes;

public class Rectangle extends Shape{
    private String width;
    private String height;

    public Rectangle(String width, String height, int ID){
        super("Red", ID);
        setWidth(width);
        setHeight(height);
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

}
