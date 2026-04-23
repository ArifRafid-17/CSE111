public class CSEStudent extends Student {
    static int count;
    static String [] labcourse = {"CSE110", "CSE111", "CSE220", "CSE221"};

    public CSEStudent(String a, int b){
        super(a,b);
        count++;
    }

    public static void details(){
        System.out.println("Total CSE Students: "+count);
        System.out.println("Available Lab Based Courses: ");
        for(int i=0; i<4; i++){
            System.out.print(labcourse[i]+" ");
        }
        System.out.println();
    }

    public void addLabBasedCourse(String a){
        boolean flag=false;
        for(int i=0; i<4; i++){
            if(a.equals(labcourse[i])){
                courses+=a+" ";
                flag=true;
            }
        }

        if(!flag){
            System.out.println("It is not a lab based course!");
        }
    }
}
