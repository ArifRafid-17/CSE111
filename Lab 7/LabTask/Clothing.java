public class Clothing extends Product {
    String size;

    public Clothing(String a, double b, String c){
        super(a,b);
        size =c;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Size: "+size);
    }


}
