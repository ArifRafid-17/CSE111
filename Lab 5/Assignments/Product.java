public class Product {
    String name;
    int quantity;
    static String [] nameStorage = new String [3];
    static int [] quantityStorage = new int [3];
    static int count=0;

    public Product(String a, int b){
        name = a;
        quantity = b;
 
        if(count<3){
            nameStorage[count]=a;
            quantityStorage[count]=b;
            count++;
            System.out.println("Stored: "+a);
        }
        else{
            System.out.println("Storage is full! Cannot add "+a);
        }
    }

    public static void displayProducts(){
        System.out.println("=== Stored Products ===");
        for(int i=0; i<count; i++){
            System.out.println(nameStorage[i]+" - "+ quantityStorage[i]);

        }
    }

    public static void buy( String a, int b){
        int index=-1;
        boolean flag = false;

        for(int i=0; i<count; i++){
            String temp = nameStorage[i];
            if(a.equals(temp)){
                index =i;
                flag = true;
                break;
            }
        }

        if(flag){
            int quan = quantityStorage[index];
            if(b<quan){
                quantityStorage[index]-=b;
                System.out.println("Product Sold");
            }
            else{
                System.out.println("Quantity low");
            }
        }

        else{
            System.out.println("Product not found");
        }

    }


}
