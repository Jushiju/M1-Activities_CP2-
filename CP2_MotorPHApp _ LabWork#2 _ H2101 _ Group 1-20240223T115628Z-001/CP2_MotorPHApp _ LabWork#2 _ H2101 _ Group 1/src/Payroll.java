public class Payroll {
    private String payrollId;
    private Employee employee;
    private double salary;
    private double deductions;
    private double bonuses;
    private double netSalary;

    public Payroll(String payrollId, Employee employee, double salary, double deductions, double bonuses) {
        this.payrollId = payrollId;
        this.employee = employee;
        this.salary = salary;
        this.deductions = deductions;
        this.bonuses = bonuses;
        this.netSalary = calculateNetSalary();
    }

    public String getPayrollId() {
        return payrollId;
    }

    public Employee getEmployee() {
        return employee;
    }

    public double getSalary() {
        return salary;
    }

    public double getDeductions() {
        return deductions;
    }

    public double getBonuses() {
        return bonuses;
    }

    public double getNetSalary() {
        return netSalary;
    }

    private double calculateNetSalary() {
        // Implement the calculation logic
        return salary - deductions + bonuses;
    }
}
