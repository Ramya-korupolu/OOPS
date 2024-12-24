public class Cylinder {
    private Circle base; 
    private double height;

    public Cylinder() {
        base = new Circle(); 
        height = 1.0;
    }

    public Cylinder(double height) {
        base = new Circle();
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        base = new Circle(radius);
        this.height = height;
    }

    public double getRadius() {
        return base.getRadius();
    }

    public void setRadius(double radius) {
        base.setRadius(radius);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return base.getColor();
    }

    public void setColor(String color) {
        base.setColor(color);
    }

    public double getBaseArea() {
        return base.getArea();
    }

    public double getArea(){
        return 2 * Math.PI * getRadius() * height + 2 * getBaseArea();
    }

    public double getVolume() {
        return base.getArea() * height;
    }

    public String toString() {
        return "Cylinder[base=" + base.toString() + ",height=" + height + "]";
    }
}

