public class Concert{
    String venue;
    String time;
    String [] artist = new String [5];
    int count =0;
    int soldTicket=0;
    static int totalSoldTicket=0;
    int totalPrice;
    boolean flag =false;

    public Concert(String a, String b){
        venue =a;
        time =b;
    }

    public void showDetails(){
        System.out.println("Venue: "+venue+"\nShowtime: "+time);
        System.out.println("Artist: ");
        if(count<5){
            for(int i=0; i<count; i++){
                System.out.println("-"+artist[i]);
            }
        }
        System.out.println("Tickets sold in this concert: "+soldTicket);
    }

    public void addArtist(String a){
        if(count<5){
            artist[count++]=a;
        }
    }

    public void buyTicket(String a){
        if(a.equals("A")){
            totalPrice=500;
        }

        if(a.equals("B")){
            totalPrice=1000;
        }

        if(a.equals("VIP")){
            totalPrice=2000;
        }

        if(!flag){
            printPrice();
            counter(1);
        }

        
    }

    public void buyTicket(String a, int b){
        flag =true;
        buyTicket(a);
        totalPrice*=b;
        printPrice();
        counter(b);
        flag =false;

    }

    public void counter(int a){
        soldTicket+=a;
        totalSoldTicket+=a;
    }

    public void printPrice(){
        System.out.println("Total Price: "+totalPrice);
    }

    public static void showTotalTicketsSold(){
        System.out.println("Total tickets sold (all venues): "+totalSoldTicket);
    }




}