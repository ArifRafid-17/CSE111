public class Organizer {
    String uni;
    Event [] events = new Event [4];
    int count;

    public Organizer(String a){
        uni =a;
    }
    public Organizer(){
        System.out.println("Please provide the organizer's name");
    }

    public void organizeEvent(Event ev){
        if(count<4){
            events[count]=ev;
            count++;
            System.out.println(uni+" successfully organized "+ev.getName());
        }
    }

    public void searchEventByDate(String a){
        boolean flag =false;
        int index = -1;
        for(int i=0; i<count; i++){
            if(a.equals(events[i].date)){
                flag=true;
                index=i;
            }
        }

        if(flag){
            System.out.println(events[index].getName());
        }
        else{
            System.out.println("No event is scheduled for "+a);
        }
    }
}
