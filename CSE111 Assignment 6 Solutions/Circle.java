// Task 4
public class Circle {
    public static int count;
    private double radius;
    public Circle(double a)
    {
        count++;
        radius=a;
    }
    public void setRadius(double a)
    {
        radius=a;
    }
    public double getRadius()
    {
        return radius;
    }
    public double area()
    {
        return Math.PI*Math.pow(radius,2);
    }
}
