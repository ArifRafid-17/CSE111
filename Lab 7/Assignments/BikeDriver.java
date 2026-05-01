public class BikeDriver extends GenericDriver {
    String premium;
    static String [] restrictedAreas = new String [3];
    static int count=0;


    public BikeDriver(String a, String b){
        super(a);
        premium=b;
    }

    public String toString(){
        return super.getName()+"'s driver profile is "+premium;
    }

    public static void restrictedAreas(String a){
        restrictedAreas[count++]=a;
    }

    public String acceptRide(boolean b){
        return super.acceptRide(b)+"\n"+toString();
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


