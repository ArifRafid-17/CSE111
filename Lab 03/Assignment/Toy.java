public class Toy {
    String name;
    int price;

    public Toy(String a, int b){
        name=a;
        price=b;

        System.out.println("A new toy has been made!");
    }

    public void updatePrice(int a){
        price=a;

    }

    public void showPrice(){
        System.out.println("price: "+price+ " Taka");
    }

    public void updateName(String a){
        System.out.println("Changing old name: "+name);
        name = a;
        System.out.println("new name: "+a);
    }
}
