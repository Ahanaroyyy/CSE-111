//Task 2
public class Shape {
    double area;
    String shape;
    public void setParameters(String str,int n)
    {
        shape=str;
        area=3.1416*n*n;
    }
    public void setParameters(String str,int n,int m)
    {
        shape=str;
        area=0.5*n*m;
    }
    public void setParameters(String str,double x, double y)
    {
        shape=str;
        area=x*y;
    }
    public String details()
    {
        return "Shape Name: "+shape+"\n"+"Area: "+area;
    }
}
