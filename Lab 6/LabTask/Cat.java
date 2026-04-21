public class Cat extends Animal {
    String type;

    public Cat(String a, int b, String c, String d){
        super(a,b,c);
        type =d;
    }

    public String catInfo(){
        System.out.print(info());
        return "Breed: "+type;
    }

    public void makeSound(){
        System.out.println(color+" color "+name+" is meowing");
    }
}
