import java.util.List;

public class EmployeeApp {
    private static EmployeeApp instance;
    private List<Employee> employees;
    private List<Department> departments;
    private List<Attendance> attendances;
    private List<Payroll> payrolls;

    private EmployeeApp() {
    }

    public static EmployeeApp getInstance() {
        if (instance == null) {
            instance = new EmployeeApp();
        }
        return instance;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(String employeeId) {
    }

    public Employee getEmployee(String employeeId) {
        return null;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void removeDepartment(String departmentId) {
    }

    public Department getDepartment(String departmentId) {
        return null;
    }

    public void addAttendance(Attendance attendance) {
        attendances.add(attendance);
    }

    public void removeAttendance(String attendanceId) {
    }

    public Attendance getAttendance(String attendanceId) {
        return null;
    }

    public void addPayroll(Payroll payroll) {
        payrolls.add(payroll);
    }

    public void removePayroll(String payrollId) {
    }

    public Payroll getPayroll(String payrollId) {
        return null;
    }

    public List<Notification> sendNotification(Notification notification) {
        return null;
    }

    public List<Notification> viewNotifications(String employeeId) {
        return null;
    }
}
