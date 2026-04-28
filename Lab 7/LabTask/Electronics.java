public class Electronics extends Product {
    int warranty;

    public Electronics(String a, double b, int c){
        super(a,b);
        warranty=c;
    }

    public void displayInfo(){
        System.out.println("Electronics: " + productName + ", Price: $" + price);
        System.out.println("Warranty: "+warranty+" months");
    }

    public void displayInfo(Boolean flag){
        if(flag){
           System.out.println("Electronics: " + productName + ", Price: $" + price);
           System.out.println("Warranty: "+warranty+" months");
        }
        else{
            System.out.println("Electronics: " + productName + ", Warranty: "+warranty+" months");
        }
    }


}
