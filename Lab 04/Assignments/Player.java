public class Player {
    String name; 
    int hp;
    String [] defeatedPlayers = new String[5];
    int count=0;

    public Player(String a){
        name = a;
        hp = 100;
        System.out.println(name+ " joined the game");
        System.out.println("HP: "+hp);
    }

    public Player(String a, int b){
        name=a;
        hp =b;
        System.out.println(name+ " joined the game");
        System.out.println("HP: "+hp);

    }

    public void viewInfo(){
        System.out.println("Player Name: "+name);
        System.out.println("HP: "+hp);
        if(count>0){
            System.out.println("Defeated: ");
            for(int i=0; i<count; i++){
                System.out.print(defeatedPlayers[i] +", ");
            }
            System.out.println();
        }
        
    }

    public void defeatVillain(String a, int b){
        if(hp>=b){
            defeatedPlayers[count]=a;
            count++;
            System.out.println("defeated "+a);
            hp+=b;
        }
        else{
            System.out.println("failed to defeat "+a);
        }
    }

    public void defeatVillain(char c, String a, int b){
        int boost = (char)c-48;

        hp = hp * boost;
        System.out.println("HP with "+boost+"x boost: "+hp);
        defeatVillain(a,b);
    }

    public void defeatVillain(Player p){
        defeatVillain(p.name, p.hp);
    }
}
