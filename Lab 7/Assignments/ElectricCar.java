public class ElectricCar extends Vehicle {
    int batteryCap;


    public ElectricCar(String a, int b, int c){
        super(a,b);
        batteryCap=c;
        vehicleId="EV000";
        System.out.println("Vehicle ID: "+vehicleId+" created");
    }

    public void vehicleDetail(){
        super.vehicleDetail();
        System.out.println("Type: Electric Vehicle");
        System.out.println("Battery Capacity: "+batteryCap+" kWh");
    }

    public static void markAsSoldEV(ElectricCar a){
        a.sold=true;
    }

}
