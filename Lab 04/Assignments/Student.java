public class Student {
    String name;
    int id;
    String dept;
    String email = "null";
    private String pass= "null";
    private boolean loginStatus=false;
    String [] courses = new String[4];
    int courseCount=0;

    public Student(String a, int b, String c){
        name=a;
        id = b;
        dept = c;
        System.out.println("Student object is created");
    }

    public void setPassword(String a){
        pass = a;
    }

    public String getPass(){
        return pass;
    }

    public void updateLog(Boolean a){
        loginStatus=a;
    }

    public Student getStudent(){
        return this;
    }






}
