public class TriangleTest extends Shape{
    public static void main(String[] args) {
        Triangle triangle = new Triangle("red",true,3,6,4);
        System.out.println(triangle.toString());
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getArea());
    }
}
