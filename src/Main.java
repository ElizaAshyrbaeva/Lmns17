public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(3.4,45);
        System.out.println(rectangle.getPerimeter());
        Shape triangle = new Triangle(4.5,6.8,8);
        System.out.println(triangle.getPerimeter());
        Shape square = new Square(7.8);
        System.out.println(square.getPerimeter());
        Shape rhombus=new Rhombus(4.5);
        System.out.println(rhombus.getPerimeter());
        Shape circle = new Circle(3.5);
        System.out.println(circle.getPerimeter());


    }
}