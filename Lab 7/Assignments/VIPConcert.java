public class VIPConcert extends Concert{
    public VIPConcert(String a, String b){
        super(a,b);
    }

    public void buyTicket(){
        super.buyTicket("VIP");
    }
    
}