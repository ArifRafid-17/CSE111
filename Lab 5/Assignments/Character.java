public class Character {
    static int id=1;
    int ID;
    String name;
    String grp; 
    int health;
    static Character [] arr = new Character[100];
    static int count=0;
    
    public Character(String a, String b, int c){
        name =a;
        grp =b;
        health= c;
        ID=id++;

        arr[count]=this;
        count++;
    }

    public Character(String a, int c){
        name =a;
        grp ="Teen";
        health= c;
        ID=id++;

        arr[count]=this;
        count++;       
    }

    public void printDetails(){
        System.out.println("ID: "+ID+ ", " +"Name: "+ name);
        System.out.println("Group: "+grp);
        System.out.println("Health: "+health);
    }


    public static void printStats(){
        int kidCount=0;
        int teenCount=0;
        int adultCount=0; 
        int strongestChar=0;

        int index=-1;
        int totalHealth=0;
        

        for(int i=0; i<count; i++){
            String temp = arr[i].grp;
            if(temp.equals("Kid")){
                kidCount++;
            }

            if(temp.equals("Teen")){
                teenCount++; 
            }

            if(temp.equals("Adult")){
                adultCount++; 
            }


            if(strongestChar<arr[i].health){
                strongestChar=arr[i].health;
                index = i;
            }

            totalHealth+=arr[i].health;


        }


        System.out.println("Total Characters: "+count);
        System.out.println("Kids: "+kidCount);
        System.out.println("Teens: "+teenCount);
        System.out.println("Adults: "+adultCount);

        if(count==0){
            System.out.println("Average Health: 0");
            System.out.println("Strongest Character: None");
        }
        else{
            double avgHealth = (double) totalHealth/count ;
            System.out.println("Average Health: "+avgHealth);
            System.out.println("Strongest Character: ");
            System.out.println(arr[index].name+" (Health "+arr[index].health+")");
        }
    }
}
