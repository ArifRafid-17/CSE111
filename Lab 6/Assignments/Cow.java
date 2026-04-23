public class Cow extends Animal {
    String name;

    public Cow(){
        super();
        System.out.println("The cow says hello!");
    }

    public void updateSound(String a){
        sound =a;
    }

    public String getName(){
        return name;
    }

}
