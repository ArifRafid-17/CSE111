public class Connect {
    boolean loginflag = false;
    Student [] advisedSt = new Student[5];
    int adviseCount=0;

    public Connect(){
        System.out.println("Connect is ready to use!");
    }

    public void login(Student n){
        String a = n.email;
        String b = n.getPass();
        if(a.equals("null") && b.equals("null")){
            System.out.println("Email and password need to be set. ");
        }
        else{
            System.out.println("Login Successful");
            loginflag = true;
            n.updateLog(loginflag);
        }
    }

    public void advising(Student n){
        if(!loginflag){
             System.out.println("Please login to advise courses!");
        }
        else{
           if(n.courseCount==0){
            System.out.println("You haven't selected any courses.");
           }
           else{
            advisedSt[adviseCount]=n;
            adviseCount++;
            System.out.println("Advising Successful!");
           }
        }
    }

    public void advising(Student n, String a, String b, String c, String d){
        System.out.println("You need special approval to take more than 3 courses.");

    }

    public void addCourse(String a , Student n){
       n.courses[n.courseCount]=a;
       n.courseCount++;
    }

    public void advising(Student n, String a, String b, String c){
        addCourse(a, n);
        addCourse(b, n);
        addCourse(c, n);
        advising(n);
    }


    public void allAdviseeInfo(){
        System.out.println("Total Advisee: "+adviseCount);
        for(int i=0; i<adviseCount; i++){
            System.out.println("Name: "+advisedSt[i].name+" "+ "ID: "+advisedSt[i].id);
            System.out.println("Department: "+advisedSt[i].dept);
            System.out.println("Advised Courses: ");
            for(int k=0; k<advisedSt[i].courseCount; k++){
                System.out.print(advisedSt[i].courses[k]+" ");
            }
            System.out.println();
            System.out.println("==============");
        }
    }


}
