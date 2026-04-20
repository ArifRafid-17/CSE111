public class Event {
    private String eventName;
    String date;
    static Event [] arr = new Event[5];
    static int count =0;



    public Event(String a, String b){
        eventName=a;
        date =b;
        arr[count]=this;
        count++;

    }

    public String details(){
        String s="";
        System.out.println("Name: "+eventName);
        System.out.print("Date: "+date);
        return s;
    }

    public static void allEventInfo(){
        System.out.println("Total Events: "+count);
        System.out.println("Event Details: ");
        if(count<5){
            int temp=1;
            for(int i=0; i<count; i++){
                System.out.println("Event "+temp+":");
                System.out.println(arr[i].details()); 
                temp++;           
            }
        }
    }

    public String getName(){
        return eventName;
    }


}
