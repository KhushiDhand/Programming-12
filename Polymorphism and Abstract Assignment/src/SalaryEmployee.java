public class SalaryEmployee extends Employee{
    public int annualSalary;

    public SalaryEmployee(String name, int hireYear, int annualSalary) {
        super(name, hireYear);
        this.annualSalary = annualSalary;
        this.hasBenefits = hasBenefits;
    }

    public boolean hasBenefits;

    @Override
    public double annualSalary(){
        return monthlySalary()*12;
    }

    @Override
    public double monthlySalary(){
        return annualSalary/12;
    }


}
