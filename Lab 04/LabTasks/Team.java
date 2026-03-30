public class Team {
    String teamName;
    Player [] players = new Player [11];
    int count=0;

    public Team(){

    }

    public void updateName(String a){
        teamName = a;
    }

    public Team(String a){
        teamName=a;
    }

    public void addPlayer(Player a){
        if(count<11){
            players[count]=a;
            count++;
        }
    }

    public void printDetail(){
        System.out.println("Team: "+teamName);
        System.out.println("List of players: ");
        for(int i=0; i<count; i++){
            players[i].getInfo();
            System.out.println();
        }
           
    }
}
