package lecture_nr_7.example_1;

public class Company {

    String companyName;
    int employeeCount;
    Employee[] employees;

    public Company(String companyName, Employee[] employees) {
        this.companyName = companyName;
        this.employeeCount = employees.length;
        this.employees = employees;
    }

    public void printAllEmployeeNames(){
        for(int index = 0; index != employees.length; index++){
            System.out.println(employees[index].name);
        }
    }

    public void makeAllEmployeesWork(){
        for(int index = 0; index != employees.length; index++){
            employees[index].work();
        }
    }

    public void callSomethingMethodFromManagers(){
        for(int index = 0; index != employees.length; index++){
//            if(employees[index] instanceof Manager){
//                Manager tempObject = (Manager) employees[index];
//                tempObject.something();
//            }

            if(employees[index] instanceof Manager tempObject){
                tempObject.something();
            }
        }
    }

    public void makeAllDevelopersWork(){
        for(int i = 0; i != employees.length; i++){
            if(employees[i] instanceof Developer){
                employees[i].work();
            }
        }
    }

    public void printEmployeeCount(){
        System.out.println("Employee count is: " + employeeCount);
    }
}
