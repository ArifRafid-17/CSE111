public class BracuStudent {
    String name;
    private String location;
    boolean pass = false;

    public BracuStudent(String a, String b){
        name = a;
        location =b;
    }

    public void showDetails(){
        System.out.println("Student Name: "+name);
        System.out.println("Lives in "+location);
        System.out.println("Have Bus Pass? "+pass);
    }

    public void collectPass(){
        pass = true;
    }
    public String getLocation(){
        return location;
    }

    public void setLocation(String a){
        location =a;
    }
}
