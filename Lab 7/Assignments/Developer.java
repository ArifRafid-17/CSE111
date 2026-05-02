public class Developer extends Employee {
    String language;
    double totalSalary;

    public Developer(String a, int b, int c, String d){
        super(a,b,c);
        language=d;
    }

    public void calculateSalary(){
        totalSalary = getBaseSalary();
        if(language.equals("Java")){
            totalSalary+=700;
        }
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Language: "+language);
        System.out.println("Final Salary: "+totalSalary);
    }


}
