// Task 5
public class Triangle {
    public int a;
    public int b;
    public int c;
    public int perimeter;
    public void updateSides(int x,int y,int z)
    {
        a=x;
        b=y;
        c=z;
        perimeter=a+b+c;
    }
    public void triangleDetails()
    {
        System.out.println("Three sides of the triangle are: "+a+", "+b+", "+c+"\nPerimeter: "+perimeter);
    }
    public String printTriangleType()
    {
        if(a==b&& a==c)
        {
            return "This is an Equilateral Triangle";
        }
        else if(a!=b && a!=c && b!=c)
        {
            return "This is a Scalene Triangle";
        }
        else
        {
            return "This is an Isosceles Triangle";
        }
    }
    public void compareTrinagles(Triangle a)
    {
        if(this==a)
        {
            System.out.println("These two triangle objects have the same address.");
        }
        else if(a.a==this.a && a.b==this.b && a.c==this.c)
        {
            System.out.println("Addresses are different but the sides of the triangles are equal.");
        }
        else if(a.perimeter==this.perimeter)
        {
            System.out.println("Only the perimeter of both triangles is equal.");
        }
        else
        {
            System.out.println("Addresses, length of the sides and perimeter all are different.");
        }

    }
}
