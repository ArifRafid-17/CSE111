public class Reader {
    String name = "New user";
    int capacity= 2;
    int count=0;
    String books [] ;



    public Reader(String a){
        name=a;
        books = new String [capacity]; 
        System.out.println("A new reader is created!");
    }

    public Reader(String a, int b){
        name =a;
        capacity =b;
        books = new String [capacity]; 
        System.out.println("A new reader is created!");

    }


    public void readerInfo(){
        System.out.println("Name: "+name);
        System.out.println("Capacity: "+capacity);
        System.out.println("Books: ");
        if (count>0){
            for(int i=0; i<count; i++){
                System.out.println("Book "+(i+1)+" : "+books[i]);
            }
        }
        else{
            System.out.println("No books added yet");
        }
    }

    public void addBook(String a){
        
        if(capacity>2){
            String updatedBooks []  = new String [capacity];
            for(int i=0; i<count; i++){
                updatedBooks[i] = books[i];
            }

            books = new String [capacity];
            books = updatedBooks;
        }

        if(count<capacity){
            books[count]=a;
            count++;
        }
        else{
            System.out.println("No more capacity");
        }
    }

    public void updateCapacity(int a){
        capacity = a;
        System.out.println("Capacity has changed to "+a);

    }

}
