public class Circle extends Shape {
    int radius;
    double area;

    public void area(){
        area = 3.1416 * radius* radius;
        System.out.println("Area of "+name+" Circle: "+area);
    }
}
