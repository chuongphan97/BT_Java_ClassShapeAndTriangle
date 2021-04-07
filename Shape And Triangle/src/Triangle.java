public class Triangle extends  Shape{
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean isFilled, double side1, double side2, double side3) {
        super(color, isFilled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getPerimeter(){
        return this.getSide1() + this.getSide2() + this.getSide3();
    }
    public double getArea(){
        return Math.sqrt(this.getPerimeter() * (this.getPerimeter() - this.side1) * (this.getPerimeter() - this.side2) * (this.getPerimeter() - this.side3));
    }
    public String toString(){
        return "A Triangle have 3 side: " + this.side1 + " " + this.side2 + " " + this.side3 + ". " + super.toString();
    }
}
