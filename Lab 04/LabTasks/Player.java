public class Player {
    private String name;
    private int age;
    private int matches;

    public Player(String a, int b, int c){
        name=a;
        age=b; 
        matches = c;
    }

    public void getInfo(){
        System.out.println("Name: "+name);
        System.out.print("Age: "+age+", "+"Total Matches: "+matches);
    }
}
