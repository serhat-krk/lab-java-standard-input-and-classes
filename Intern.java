public class Intern extends Employee {


    // Constructor
    public Intern(String name, String email, int age, float salary) {
        super(name, email, age, salary);
        if (salary > 20_000) {
            setSalary(20_000);
            System.err.println("Intern salary cannot be set above 20,000 - Salary is set to 20,000");
        }
    }


    // setSalary Override
    @Override
    public void setSalary(float salary) {
        if (salary > 20_000) {
            System.err.println("Intern salary cannot be set above 20,000 - Salary is set to 20,000");
            super.setSalary(20_000);
        } else {
            super.setSalary(salary);
        }
    }


    // toString
    @Override
    public String toString() {
        return super.toString();
    }
}
