public class Employee {
    String name;
    double salary;
    String designation;

    public void newEmployee(String a){
        name=a;
        salary=30000.00;
        designation="junior";
    }

    

    public void displayInfo(){
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Salary: "+salary+ " Tk");
        System.out.println("Employee Designation: "+designation);
    }



    public void calculateTax(){
        if(salary>50000){
            double tax = salary * 0.30;
            System.out.println(name+ " Tax Amount: "+tax+ " Tk");

            
        }
        else if(salary>30000){
            double tax = salary * 0.10;
            System.out.println(name+ " Tax Amount: "+tax+ " Tk");

        }

        else{
            System.out.println("No need to pay tax");

        }
    }


    public void promoteEmployee(String a){
        if(a.equals("senior")){
            designation="senior";
            salary+=25000.00;
        }
        if(a.equals("lead")){
            designation="lead";
            salary+=50000.00;
        }
        if(a.equals("manager")){
            designation="manager";
            salary+=75000.00;
        }
        System.out.println(name+ " has been promoted to "+designation);
        System.out.println("New Salary: "+salary +" Tk");
    }


}
