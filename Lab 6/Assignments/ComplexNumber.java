public class ComplexNumber extends RealNumber{
    double impart;

    public ComplexNumber(){
       super(1.0); 
       impart = 1.0;
    }

    public ComplexNumber(double a, double b){
        super(a);
        impart =b;
    }

    public String details(){
        return getReal()+"\nImaginaryPart: "+impart;
    }

}
