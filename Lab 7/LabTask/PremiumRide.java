public class PremiumRide extends Ride{
    static int count=0;
    boolean flag;
    boolean discount;
    private String id="";

    public PremiumRide(int a, boolean b){
        super(a);
        flag =b;
        count++;
        id = count+"-"+a;
        
    }

    public String toString(){
        return super.toString()+"\nID: "+id+"\nService Charge: 50 TK"+"\nSurge: "+flag+"\nDiscount: "+discount;
    }

    public String getId(){
        return id;
    }

    public double calculateFare(){
        double finalValue = super.calculateFare()+50;
        if(flag){
            double extra = finalValue * 0.2;
            finalValue+=extra;
        }
        return finalValue;
    }

    public double calculateFare(int a){
        double temp=this.calculateFare();
        temp-=a;
        discount = true;
        return temp;

    }

}
