public class Shape {
    String shapeName;
    double area;
    public void setParameters(String a, int b){
        shapeName=a;
        double area =3.1416*b*b;
        this.area= area;
    }

    public void setParameters(String a, int b, int c){
        shapeName=a;
        double area = 0.5*b*c;
        this.area= area;
    }
    public void setParameters(String a, double b, double c){
        shapeName=a;
        double area = b*c;
        this.area= area;
    }

    public double details(){
         System.out.println("Shape Name:"+shapeName);
         System.out.print("Area = ");
         return area;
    }
}
