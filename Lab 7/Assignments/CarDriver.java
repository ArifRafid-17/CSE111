public class CarDriver extends GenericDriver {
    String premium = "Premium";
    static String [] restrictedAreas = new String [2];
    static int count=0;



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

    public String acceptRide(boolean b){
        return super.acceptRide(b)+"\n"+toString();
    }
    

    public static void restrictedAreas(String a){
        restrictedAreas[count++]=a;
    }


     public void fightRestriction(String [] a){
        boolean flag = false;

        for(int i=0; i<a.length; i++){
            String temp = a[i];

            for(int j=0; j<count; j++){
                if(temp.equals(restrictedAreas[j])){
                    flag= true;
                    break;
                }
            }

            if(flag){
                System.out.println(getName()+" can not enter "+temp);
                flag = false;
            }
            else{
                System.out.println(getName()+" can enter "+temp);
            }

        }
    }


}
