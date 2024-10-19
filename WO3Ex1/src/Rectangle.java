public class Rectangle {
    //Properties
    private float height;
    private float width;

    public Rectangle(float height, float width) {
        this.height = height;
        this.width = width;
    }

    public void setLength(float height) {
        this.height = Rectangle.this.height;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getLength() {
        return height;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getArea(){
        return this.width * this.height;
    }

    public float getPerimeter(){
        return (this.height + this.width) * 2;
    }

    public String toString()
}
