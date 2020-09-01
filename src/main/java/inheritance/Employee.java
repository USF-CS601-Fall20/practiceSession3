package inheritance;

public class Employee implements Payable {
    private String name;
    private String jobTitle;
    private double salary;

    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle  = jobTitle;
        this.salary = salary;
    }
    @Override
    public double pay() {
        return salary;

    }

}
