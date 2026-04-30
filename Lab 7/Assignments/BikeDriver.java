public class BikeDriver extends GenericDriver {
    String premium;

    public BikeDriver(String a, String b){
        super(a);
        premium=b;
    }

    public String toString(){
        return super.getName()+"'s driver profile is "+premium;
    }
}


