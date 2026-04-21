public class Dog extends Animal {
    String type;

    public Dog(String a, int b, String c, String d){
        super(a, b, c);
        type =d;
    }

    public String dogInfo(){
        System.out.print(info());
        return "Breed: "+type;

    }

    public void makeSound(){
        System.out.println(color+" color "+name+" is barking");
    }
}
