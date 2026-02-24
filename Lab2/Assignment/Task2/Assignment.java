public class Assignment{
    int tasks = 0;
    String difficulty;
    boolean submission= false;

    public void printDetails(){
        System.out.println("Number of tasks: "+tasks);
        System.out.println("Difficulty level: "+difficulty);
        System.out.println("Submission required: "+submission);

    }

    public String makeOptional(){
        if(submission){
            submission=false;
            String a = "Assignment will not require submission ";
            return a;
        }
        else{
            String a = "Submission is already not required";
            return a;
        }

    }

}
