public class MoneyTracker {
    String name;
    double balance;
    double added;
    double spent;

    public MoneyTracker(){
        System.out.println("A new money tracker has been launched. ");
        name= "null";
        balance = 0.0;

    }
    public double info(){
        System.out.println("Name: "+name);
        System.out.print("Current Balance: ");
        return balance;
    }

    public void createTracker(String a){
        name = a;
        balance =1.0;

    }

    public void income(int a){
        balance+=a;
        added =a;
        System.out.println("Balance Updated!");
    }

    public void expense(int a){

        if(balance<=0){
            System.out.println("Not enough balance. ");
        }
        else{
            balance-=a;
            spent =a;

            if(balance==0){
                System.out.println("You're broke! ");
            }
            else{
                System.out.println("Balance Updated. ");
            }
            
        }

    }

    public void showHistory(){
        System.out.println("Last added: "+added);
        System.out.println("Last spent: "+spent);
    }
}
