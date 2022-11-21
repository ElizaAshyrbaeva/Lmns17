public class Rhombus extends Shape{
    private  double a;

    public Rhombus(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double getPerimeter() {
        return 4*a;
    }
}
