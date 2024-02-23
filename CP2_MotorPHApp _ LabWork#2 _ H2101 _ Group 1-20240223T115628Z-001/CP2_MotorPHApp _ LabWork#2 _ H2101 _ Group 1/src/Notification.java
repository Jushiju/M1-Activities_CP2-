import java.util.Date;

public class Notification {
    private String notificationId;
    private String message;
    private Date timestamp;
    private boolean isRead;
    private Employee recipient;

    public Notification(String notificationId, String message, Employee recipient) {
        this.notificationId = notificationId;
        this.message = message;
        this.timestamp = new Date();
        this.isRead = false;
        this.recipient = recipient;
    }

    public String getNotificationId() {
        return notificationId;
    }

    public String getMessage() {
        return message;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public boolean isRead() {
        return isRead;
    }

    public void markAsRead() {
        this.isRead = true;
    }

    public Employee getRecipient() {
        return recipient;
    }
}
