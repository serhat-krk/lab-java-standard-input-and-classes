import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        // Intern Creation Salary Above Threshold
        Intern intern1 = new Intern("Serhat", "serhat@mail.com", 28, 25_000);
        System.out.println(intern1.toString());


        // Intern setSalary Above Threshold
        intern1.setSalary(25_000);
        System.out.println(intern1.getSalary());


        // Creating 10 Employees
        Employee employee01 = new Employee("employee01", "employee01@mail.com", 30, 20_000);
        Employee employee02 = new Employee("employee02", "employee02@mail.com", 31, 21_000);
        Employee employee03 = new Employee("employee03", "employee03@mail.com", 32, 22_000);
        Employee employee04 = new Employee("employee04", "employee04@mail.com", 33, 23_000);
        Employee employee05 = new Employee("employee05", "employee05@mail.com", 34, 24_000);
        Employee employee06 = new Employee("employee06", "employee06@mail.com", 35, 25_000);
        Employee employee07 = new Employee("employee07", "employee07@mail.com", 36, 26_000);
        Employee employee08 = new Employee("employee08", "employee08@mail.com", 37, 27_000);
        Employee employee09 = new Employee("employee09", "employee09@mail.com", 38, 28_000);
        Employee employee10 = new Employee("employee10", "employee10@mail.com", 39, 29_000);


        // Open File
        FileWriter writer = new FileWriter("employees.txt", true);


        // Write In File
        writer.write(employee01.toString() + "\n");
        writer.write(employee02.toString() + "\n");
        writer.write(employee03.toString() + "\n");
        writer.write(employee04.toString() + "\n");
        writer.write(employee05.toString() + "\n");
        writer.write(employee06.toString() + "\n");
        writer.write(employee07.toString() + "\n");
        writer.write(employee08.toString() + "\n");
        writer.write(employee09.toString() + "\n");
        writer.write(employee10.toString() + "\n");


        // Close Writer
        writer.close();
    }
}
