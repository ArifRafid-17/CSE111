public class Triangle {
    int a;
    int b;
    int c;

    public Triangle(int side1, int side2, int side3){
        a=side1;
        b=side2;
        c=side3;
    }    

    public void triangleDetails(){
        int perimeter=a+b+c;
        System.out.println("Three sides of the triagnle are: "+a+", "+b+", "+c);
        System.out.println("Perimeter: "+perimeter);

    }
    public String printTriangleType(){
        String rr=".";
        if(a==b || a==c){
            if(a==c || a==b){
                String A = "This is an Equilateral Triangle";
                return A;
            }

            if(a!=c || a!=b){
                String B = "This is an Isosceles Triangle";
                return B;
            }
        }
        else{
            String C = "This is an Scalene Triangle";
            return C;
        }
        return rr;
    }

    public void compareTriangles(Triangle other) {
        boolean sameAddress = (this == other);
        boolean sameSides = (this.a == other.a && this.b == other.b && this.c == other.c);
        boolean samePerimeter = (this.a + this.b + this.c) == (other.a + other.b + other.c);

        if (sameAddress) {
            System.out.println("These two triangle objects have the same address.");
        } 
        else if (sameSides) {
            System.out.println("Addresses are different but the sides of the triangles are equal.");
        } 
        else if (samePerimeter) {
            System.out.println("Only the perimeter of both triangles is equal.");
        } 
        else {
            System.out.println("Addresses, length of the sides and perimeter all are different.");
        }
    }
}
