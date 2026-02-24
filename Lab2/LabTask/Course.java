public class Course {
    String CourseName;
    String CourseCode;
    int Credit;

    public void updateDetails(String a, String b, int c){
        CourseName=a;
        CourseCode=b;
        Credit = c;

    }
    public void displayCourse(){
        System.out.println("Course Name: ");
        System.out.println(CourseName);
        System.out.println("Course Code: "+CourseCode);
        System.out.println("Course Credit: "+Credit);

    }
}
