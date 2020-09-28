import java.util.ArrayList;
import java.util.List;

public class Main {

    static ArrayList<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {

        //Salary Employee
        employees.add(new SalaryEmployee("Jack", 20200909, 500));
        employees.add(new SalaryEmployee("Sophia", 20200909, 500));
        System.out.println(GetSalaryEmployeeList());

        employees.add(new HourlyEmployee("Emily", 20200808, 70, 30.00) {
            @Override
            public boolean hasBenefits() {
                return false;
            }
        });
        employees.add(new HourlyEmployee("Anne", 20200808, 90, 30.00) {
            @Override
            public boolean hasBenefits() {
                return false;
            }
        });
        System.out.println(GetHourlyEmployeeList());

        employees.add(new PartTime("Carmen", 20200707, 40, 20));
        employees.add(new PartTime("Sarah", 20200707, 45, 21));
        System.out.println(GetPartTimeList());

        employees.add(new FullTime("Elsa", 20200606, 80, 40));
        employees.add(new FullTime("Kate", 20200606, 86, 43));
        System.out.println(GetFullTimeList());
    }

    public static ArrayList<SalaryEmployee> GetSalaryEmployeeList(){
        ArrayList<SalaryEmployee> salaryEmployees = new ArrayList<SalaryEmployee>();
        for (Employee e: employees){
            if(e instanceof SalaryEmployee) {
                salaryEmployees.add((SalaryEmployee) e);
            }
        }
        return salaryEmployees;
    }

    public static ArrayList<HourlyEmployee> GetHourlyEmployeeList(){
        ArrayList<HourlyEmployee> hourlyEmployees = new ArrayList<HourlyEmployee>();
        for (Employee e: employees){
            if(e instanceof HourlyEmployee) {
                hourlyEmployees.add((HourlyEmployee) e);
            }
        }
        return hourlyEmployees;
    }

    public static ArrayList<PartTime> GetPartTimeList(){
        ArrayList<PartTime> partTime = new ArrayList<PartTime>();
        for (Employee e: employees){
            if(e instanceof PartTime) {
                partTime.add((PartTime) e);
            }
        }
        return partTime;
    }

    public static ArrayList<FullTime> GetFullTimeList(){
        ArrayList<FullTime> fullTime = new ArrayList<FullTime>();
        for (Employee e: employees){
            if(e instanceof FullTime) {
                fullTime.add((FullTime) e);
            }
        }
        return fullTime;
    }






}
