public class CellPhone{

    String model="unknown";
    int count=0;
    String [] arr = new String [3];


    public void printDetails(){
        System.out.println("Phone Model "+model);
        System.out.println("Contacts Stored "+count);
        
        if(count>0){
            System.out.println("Stored Contacts: ");
            for(int i =0; i<count; i++){
                System.out.println(arr[i]);
            }
        }
    }

    public void storeContact(String a){
        if(count<3){
            arr[count]=a;
            count++;
            System.out.println("Contact Stored");
        }
        else{
            System.out.println("Memory full. New contact can't be stored.");
        }
    }
}