public class Cart{
    int cartNo=-1;
    String names[]= new String [3];
    double prices[]=new double[3];
    double discount=0.00;
    int count=0;
    double totalPrice=0;

   



    public void create_cart(int a){
        cartNo=a;


    }

    public void addItem(String a, double b){
        if(count<3){
            names[count]= a;
            prices[count]=b;
            count++;
            System.out.println(a+" added to cart "+cartNo);
            System.out.println("You have "+count+" item(s) in your cart now.");
            


        }

        else{
            System.out.println("You already have 3 items in your cart");
        }
    }

    public void addItem(double b, String a){
        addItem(a,b);
    }

    public void cartDetails(){
        System.out.println("Your cart(c"+cartNo+") :");
        if(count>0){
            for(int i=0; i<count; i++){
                System.out.println(names[i]+" - "+prices[i]);
            }
        }
        System.out.println("Discount Applied: "+discount+"%");
        if(totalPrice==0){
            for(int i=0; i<count; i++){
                totalPrice+=prices[i];
            }
        }
        System.out.println("Total Price: "+totalPrice);
    }


    public void giveDiscount(int a){
        discount = a;
        double appliedDis= (totalPrice *(discount/100));
        totalPrice= totalPrice-appliedDis;
    }



}
