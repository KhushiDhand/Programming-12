public class PartTime extends HourlyEmployee{
    public boolean hasBenefits;

    public PartTime(String name, int hireYear, int hoursPerWeek, int hourlyWage) {
        super(name, hireYear, hoursPerWeek, hourlyWage);
        this.hasBenefits = hasBenefits;
    }


    @Override
    public boolean hasBenefits() {
        return false;
    }

    @Override
    public double annualSalary(){
        return monthlySalary()*12;
    }

    @Override
    public double monthlySalary(){
        return hourlyWage * hoursPerWeek * 4;
    }
}
