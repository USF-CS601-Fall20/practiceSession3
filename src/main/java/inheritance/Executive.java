package inheritance;

// Add code to class Executive so that it is a subclass of Employee.
// An executive should have a bonus in addition to regular salary.
// Provide a constructor that takes name, title, salary and bonus
// It should override the pay method to return salary + bonus

// This example was modified from the example in Java Software Solutions book.
public class Executive extends Employee  {
    private double bonus;

    public Executive(String name, String title, double salary, String bonus) {
        super(name, title, salary);
    }

    @Override
    public double pay() {
        return super.pay() + bonus;
    }
    // FILL IN CODE
}
