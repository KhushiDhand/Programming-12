public abstract class Employee {
    public String name;
    public int hireYear;

    public Employee(String name, int hireYear) {
        this.name = name;
        this.hireYear = hireYear;
    }

    public Employee(){
        this.name = name;
        this.hireYear = hireYear;
    }

    public String getName() {
        return name;
    }

    public int getHireYear() {
        return hireYear;
    }

    @Override
    public String toString(){
        return "Name: " + name + "  Hire Year: " + hireYear;
    }

    public double annualSalary(){
        return this.monthlySalary()*12;
    }

    public double monthlySalary(){
        return annualSalary()/12;
    }





}
