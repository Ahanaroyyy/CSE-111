// Task 5
public class ComplexNumber extends RealNumber{
   public double Imaginary=1.0;
    public ComplexNumber()
    {
        super(1.0);
    }
    public ComplexNumber(double a,double b)
    {
        super(a);
        Imaginary=b;
    }

    public String toString() {
        return super.toString()+"\nImaginaryPart: "+Imaginary;
    }
}
