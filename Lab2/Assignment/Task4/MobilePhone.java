public class MobilePhone {
    int N;
    int count;
    int [] numbers;
    String [] names;


    public void setContactCapacity(int a){
       this.N=a;
       this.numbers = new int[N];
       this.names = new String[N];
    }
    
    public void details(){
        System.out.println("Total Contacts: "+count);
        System.out.println("Contact List: ");

        if(count>0){
            for(int i=0; i<count; i++){
                System.out.println(names[i]+":"+numbers[i]);
            }
        }
    }


    public void addContact(String a, int b){
        if(count<N){
            numbers[count]=b;
            names[count]=a;
            count++;
            System.out.println("The contact of "+a+" is added");

        }
        else{
            System.out.println("Storage Full!!");

        }
    }
    

    public void makeCall(int a){
        boolean flag = false;

        for(int i =0; i<count; i++){
            if(numbers[i]==a){
                System.out.println("Calling "+names[i]+". . .");
                flag=true;
                break;
            }
        }

        if(!flag){
            System.out.println("Calling "+a+ ". . . ");
        }
        

    }


}
