import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class HomePage extends JFrame {
    private String username;

    public HomePage(String username) {
        this.username = username;
        setTitle("MotorPH - Home");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1152, 864);
        setLocationRelativeTo(null);

        // Set fonts
        Font Serif = new Font("Serif", Font.PLAIN, 16);

        // Dark mode background color
        Color darkBackground = new Color(40, 40, 40);
        Color navBarColor = new Color(60, 60, 60); // Lightened navigation bar color
        Color buttonBorderColor = navBarColor; // Border color same as navigation bar

        // Main panel
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(darkBackground);

        // Navigation panel
        JPanel navPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 20, 10)); // Adjust spacing between components
        navPanel.setBackground(navBarColor);
        navPanel.setPreferredSize(new Dimension(getWidth(), 80)); // Increase navigation bar height

        // Logo panel
        JPanel logoPanel = new JPanel();
        logoPanel.setBackground(navBarColor);
        JLabel logoLabel = new JLabel("MOTORPH");
        logoLabel.setFont(new Font("Serif", Font.BOLD, 30)); // Increase logo font size
        logoLabel.setForeground(Color.WHITE);
        logoPanel.add(logoLabel);

        // Buttons
        JButton leaveRequestButton = createButton("Leave Request");
        JButton viewEmployeesButton = createButton("View Employees");
        JButton accountButton = createButton("Account");
        JButton logoutButton = createButton("Logout");

        // Set button borders to match navigation bar color
        leaveRequestButton.setBorder(BorderFactory.createLineBorder(buttonBorderColor));
        viewEmployeesButton.setBorder(BorderFactory.createLineBorder(buttonBorderColor));
        accountButton.setBorder(BorderFactory.createLineBorder(buttonBorderColor));
        logoutButton.setBorder(BorderFactory.createLineBorder(buttonBorderColor));

        // Add action listeners
        leaveRequestButton.addActionListener(e -> openPage(new LeaveRequestPage()));
        viewEmployeesButton.addActionListener(e -> openPage(new ViewEmployeePage()));
        accountButton.addActionListener(e -> openAccountSettings());
        logoutButton.addActionListener(e -> openPage(new LoginPage()));

        // Set button colors
        leaveRequestButton.setBackground(navBarColor);
        leaveRequestButton.setForeground(Color.WHITE);
        viewEmployeesButton.setBackground(navBarColor);
        viewEmployeesButton.setForeground(Color.WHITE);
        accountButton.setBackground(navBarColor);
        accountButton.setForeground(Color.WHITE);
        logoutButton.setBackground(navBarColor);
        logoutButton.setForeground(Color.WHITE);

        // Add components to navigation panel
        navPanel.add(logoPanel);
        navPanel.add(leaveRequestButton);
        navPanel.add(viewEmployeesButton);
        navPanel.add(accountButton);

        // Create a Box container for the logout button
        Box buttonBox = Box.createHorizontalBox();
        buttonBox.add(Box.createHorizontalGlue()); // Pushes the logout button to the right
        buttonBox.add(logoutButton);

        // Add the Box container to the navigation panel
        navPanel.add(buttonBox);

        // Add navigation panel to main panel
        panel.add(navPanel, BorderLayout.NORTH);

        // Welcome message
        JPanel welcomeMessagePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        welcomeMessagePanel.setBackground(darkBackground);
        JLabel welcomeMessageLabel = new JLabel("Welcome, " + username + "!");
        welcomeMessageLabel.setFont(new Font("Monospaced", Font.BOLD, 15));
        welcomeMessageLabel.setForeground(Color.WHITE);
        welcomeMessagePanel.add(welcomeMessageLabel);

        // The Dashboard section
        JPanel dashboardPanel = new JPanel(new BorderLayout());
        dashboardPanel.setBackground(darkBackground);

        // The Tabbed pane
        JTabbedPane tabbedPane = new JTabbedPane();
        JPanel calendarPanel = new JPanel(new BorderLayout()); // Calendar panel with border layout
        CalendarPage calendarPage = new CalendarPage();
        calendarPanel.add(calendarPage);
        tabbedPane.addTab("Calendar", calendarPanel); // Add calendar panel to the tabbed pane

        // Added tabbed pane to the dashboard panel
        dashboardPanel.add(tabbedPane, BorderLayout.CENTER);

        // Added The welcome message and dashboard panel to main panel
        panel.add(welcomeMessagePanel, BorderLayout.CENTER);
        panel.add(dashboardPanel, BorderLayout.SOUTH);

        // Content Pane here
        getContentPane().setBackground(darkBackground);
        add(panel);
    }

    private JButton createButton(String text) {
        JButton button = new JButton(text);
        button.setFont(new Font("Helvetica", Font.PLAIN, 16));
        button.setFocusPainted(false); // Remove focus border
        button.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Change cursor to hand on hover
        return button;
    }

    private void openPage(JFrame page) {
        page.setVisible(true);
        dispose(); // Close the home page
    }

    private void openAccountSettings() {
        // Open account settings page
        JOptionPane.showMessageDialog(this, "Account settings is W.I.P :p (Might not contine)");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            HomePage homePage = new HomePage("Username");
            homePage.setVisible(true);
        });
    }
}
