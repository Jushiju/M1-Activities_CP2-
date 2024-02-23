import java.util.Date;

public class Attendance {
    private String attendanceId;
    private Employee employee;
    private Date date;
    private AttendanceStatus status;

    public Attendance(String attendanceId, Employee employee, Date date, AttendanceStatus status) {
        this.attendanceId = attendanceId;
        this.employee = employee;
        this.date = date;
        this.status = status;
    }

    public String getAttendanceId() {
        return attendanceId;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Date getDate() {
        return date;
    }

    public AttendanceStatus getStatus() {
        return status;
    }
}
