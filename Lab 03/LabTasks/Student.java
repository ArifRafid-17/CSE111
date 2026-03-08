public class Student {
    String name;
    String prog;
    public Student(String a, String b){
        name=a;
        prog=b;
    }
    public void updateName(String a){
        this.name=a;
    }
    public void updateProgram(String a){
        this.prog=a;
    }

    public String accessProgram(){
        return prog;
    }
}
