package HomeWork.Day2;

public class Office {

    String employeeFirstName;
    String employeeLastName;
    private double employeeSalary;
    private int employeeVacation;
    static String departmentName;


    public String getEmployeeFirstName(){
        return employeeFirstName;
    }

    public void updateEmployeeFirstName(String inputEmployeeFirstName){
        employeeFirstName=inputEmployeeFirstName;
    }

    public String getEmployeeLastName(){
        return employeeLastName;
    }

    public void updateEmployeeLastName(String inputEmployeeLastName){
        employeeLastName=inputEmployeeLastName;
    }
    public double getEmployeeSalary(){
        return employeeSalary;
    }

    public void updateEmployeeSalary(double inputEmployeeSalary){
        employeeSalary=inputEmployeeSalary;
    }
    public int getEmployeeVacation(){
        return employeeVacation;
    }

    public void updateEmployeeVacation(int inputEmployeeVacation){
        employeeVacation=inputEmployeeVacation;
    }

    public static String getDepartmentName(){
        return departmentName;
    }

    public void updateDepartmentName(String inputDepartmentName){
        departmentName=inputDepartmentName;
    }




}


