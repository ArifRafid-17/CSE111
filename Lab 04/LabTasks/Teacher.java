public class Teacher {
    String name;
    String nameCode;
    String [] codes = new String [3];
    int count=0;
    public Teacher(String a, String b){
        name = a;
        nameCode= b;
        System.out.println("A new teacher has been created");
    }
    public void addCourse(Course c1){
        codes[count]=c1.getCourse();
        count++;
    }


    public void printDetail(){
        System.out.println("Name: "+name);
        System.out.println("Initial: "+nameCode);
        System.out.println("List of courses: ");
        for(int i=0; i<count; i++){
            System.out.println(codes[i]);
        }
    }
}
