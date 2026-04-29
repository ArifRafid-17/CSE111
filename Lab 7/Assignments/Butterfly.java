public class Butterfly extends Caterpillar{
    public Butterfly(String a, int b){
        super(a,b);
    }

    public void transform(){
        System.out.println("Caterpillar transforms into Butterfly");
    }

    public void eat(int a){
        energy+=(a*5);
        energy-=5;

        System.out.println(food+" lost energy while flying and absorbed nectar");
    }

    public void showDetails() {
    System.out.println("Food: " + food);
    System.out.println("Age: " + age);
    System.out.println("Energy: " + energy+" joules");
  }

}
