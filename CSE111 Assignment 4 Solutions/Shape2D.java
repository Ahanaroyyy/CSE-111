// Task 3
public class Shape2D {
    public String shape="Square";
    public int length=5;
    public double area;
    public Shape2D()
    {
        System.out.println("A "+shape+" has been created with length: "+length);
        area=(double)length*length;
    }
    public Shape2D(int a,int b)
    {
        shape ="Rectangle";
        System.out.println("A "+shape+" has been created with length: "+a+" and breadth: "+b);
        area=(double)a*b;

    }
    public Shape2D(int a,int b,String c)
    {
        shape =c;
        System.out.println("A "+shape+" has been created with height: "+a+" and base: "+b);
        area=(double)0.5*a*b;
    }
    public Shape2D(int a,int b,int c)
    {
        shape ="Triangle";
        int s=(a+b+c)/2;
        System.out.println("A "+shape+" has been created with the following sides: "+a+", "+b+", "+c);
        area=(double)Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    public void area()
    {
        System.out.printf("The area of the "+shape+" is: %.2f",area);
        System.out.println();
    }

}
