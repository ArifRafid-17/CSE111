public class CheckingAccount extends Account {
    static int count=0;

    public CheckingAccount(double a){
        super(a);
        count++;
    }

    public CheckingAccount(){
        super(0.0);
        count++;
    }


}
