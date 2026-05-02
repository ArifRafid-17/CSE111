public class Manager extends Employee{
    double bonus;
    double totalSalary;

    public Manager (String a, int b, int c, int d){
        super(a,b,c);
        bonus = d;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Bonus: "+bonus+" %");
        System.out.println("Final Salary: "+totalSalary);
    }

    public void calculateSalary(){
        totalSalary=getBaseSalary();
        if(getHoursWorked()>40){
            totalSalary+=(getBaseSalary()*(bonus/100));
        }
    }

    public void requestIncrement(int a){

        if(getHoursWorked()>100){
            setBaseSalary(getBaseSalary()+a);
            System.out.println(a+"$ Increment approved.");
        }

        if(getHoursWorked()>80){
            setBaseSalary(getBaseSalary()+(a/2));
            System.out.println((a/2)+"$ Increment approved.");
        }

        else{
            System.out.println("Increment denied.");
        }



    } 

}