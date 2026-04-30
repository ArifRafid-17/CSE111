public class CarDriver extends GenericDriver {
    String premium = "Premium";

    public CarDriver(String a){
        super(a);
    }

    public String toString(){
        return super.getName()+"'s driver profile is "+premium;
    }

    public void hasSafetyTraining(){
        super.hasSafetyTraining();
        if(premium.equals("Premium")){
            System.out.println("Premium drivers receive extra safety briefings.");
        }
    }

    



}
