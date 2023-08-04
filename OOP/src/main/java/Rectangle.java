//package Rectangle;

public class Rectangle {
    float width, height;
    public Rectangle() {
    }
    public Rectangle(float width, float height){
        this.width = width;
        this.height = height;
    }
    public float getArea(){
        return width * this.height;
    }
    public float getPerimeter(){
        return (width + height) * 2;
    }
    public String display(){
        return "Rectangle: width = " + width + "height = " + height;
    }
}

