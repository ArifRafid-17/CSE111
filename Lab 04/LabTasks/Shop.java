public class Shop{
    String shopName ="Mega";
    String [] items ;
    int [] prices;
    int count=0;
    int size;
    public Shop(String name , int str){
        shopName = name;
        size = str;
        prices = new int [str];
        items = new String [str];
        System.out.println(shopName+ " shop created! ");
    }
    public Shop(int str){
        size = str;
        prices = new int [str];
        items = new String [str];
        System.out.println(shopName+ " shop created! ");
    }

    public void info(){
        System.out.println("Shop Name: "+shopName);
        System.out.println("Item Details: ");
        if(count>0){
            System.out.println(count+" / "+size);
            for(int i =0; i<count; i++){
                System.out.println(items[i]+" - "+prices[i]+" Tk");
            }
        }
        else{
            System.out.println("No items in shop");
        }
    }

    public void addItem(String a, int b){
        if(count<size){
            items[count]=a;
            prices[count]=b;
            count++;
             
        }
        else{
            System.out.println(a+ ", could not be added ");
        }
    }

    public void purchase(String a){
        boolean flag = false;
        for(int i=0; i<count; i++){
            if(items[i].equals(a)){
                System.out.println("Purchase Complete!");
                flag = true;
            }
        }
        if(!flag){
            System.out.println(a+ ", is not available in this shop");
        }
        
    }
    public void addItem(Shop s1, String a){
        boolean flag = false;
        for(int i=0; i<s1.count; i++){
            if(s1.items[i].equals(a)){
                this.items[count]=a;
                this.prices[count]=s1.prices[i];
                count++;
                flag = true;
            }
        }
        if(!flag){
            System.out.println(a+ ", not found in "+s1.shopName+"!");
        }
        
    }

}