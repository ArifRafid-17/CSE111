public class Car extends Vehicle {
    int seats;
    static int totalCar=0;
    static Car [] cars = new Car [100];
    static int count =0;
    


    public Car(String a, int b, int c){
        super(a,b);
        seats =c;
        totalCar++;
        vehicleId+="CAR00"+totalCar;
        System.out.println("Vehicle ID: "+vehicleId+" created");
        cars[count++]=this;
    }

    public void vehicleDetail(){
        super.vehicleDetail();
        System.out.println("Type: Regular Car");
        System.out.println("Seats: "+seats);
    }

    public static void showAllCars(){
        System.out.println("Available Cars: "+totalCar);
        for(int i=0; i<count; i++){
            System.out.print(cars[i].vehicleId+" : "+cars[i].model+" - " );
            if(cars[i].sold){
                System.out.print("sold");
            }
            else{
                System.out.print("available");
            }

            System.out.println();
        }
    }

    public static void showAllAvailableCars(){
        System.out.println("Total Car: "+totalCar);
        System.out.println("Available Cars: ");
        for(int i=0; i<count; i++){
            System.out.println(cars[i].vehicleId+" : "+cars[i].model);
        }
    }

    public static void markAsSold(Car a){
        a.sold = true;

    }
}
