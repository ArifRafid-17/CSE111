public class BracuBus {
    int size;
    String location;
    String [] passengers ;
    int count =0;

    public BracuBus(String a){
        size =2;
        passengers = new String [size]; 
        location = a;
    }

    public BracuBus(String a, int b){
        size =b;
        passengers = new String [size]; 
        location =a;
    }

    public void showDetails(){
        System.out.println("Bus Route: "+location);
        System.out.println("Passenger Count: "+count+" (Max: "+size+")");
        System.out.println("Passenger on Board: ");
        if(count>0){
            for(int i=0; i<count ; i++){
                System.out.print(passengers[i]+ " ");
            }
        }
    }

    public void board(){
        System.out.println("No passengers");
    }

    public void board(BracuStudent a){
        String stLocation =a.getLocation();
        

        if(stLocation.equals(location)){
            if(a.pass){
                if(count<size){
                    passengers[count]=a.name;
                    count++;
                    System.out.println(a.name+" boarded the bus.");
                }
                else{
                    System.out.println("Bus is full!");
                }
            }
            else{
                System.out.println("You don't have a bus pass!");
            }
        }
        else{
            System.out.println("You got on the wrong bus!");
        }
    }

    public void board(BracuStudent c, BracuStudent d){
        this.board(c);
        this.board(d);
    }

}
