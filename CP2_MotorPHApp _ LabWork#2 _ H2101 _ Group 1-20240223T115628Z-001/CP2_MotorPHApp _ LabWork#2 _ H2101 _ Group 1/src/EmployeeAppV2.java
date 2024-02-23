// ***********************************************************
// *                                                         *
// *     Welcome to the Fantastical Employee Authentication  *
// *            Extravaganza of the Century! 🎉🎩🕺         *
// *                                                         *
// ***********************************************************

import com.motorph.parody.employeeapp.EmployeeApp;
import com.motorph.parody.employeeapp.models.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.String.format;

public class EmployeeAppV2 {

    public static final String delimeter = ",";

    public static void print(String str) {
        System.out.println(str);
    }

    public static void println(String str) {
        System.out.println(str + "\n");
    }

    public static void main(String[] args) throws IOException, InterruptedException {

        int LOGIN_ATTEMPT = 5;

        do {
            Scanner scanner = new Scanner(System.in);

// Login Console Process
            print("MOTORPH Login Console");

// Display username field😁
            print("Username: ");
// store username input
            String input_username = scanner.nextLine();
// Display password field🔑
            System.out.print("Password: ");
// store password input
            String input_password = scanner.nextLine();

// Open CSV Path (❁´◡`❁)
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\jomar\\IdeaProjects\\MO-IT101-Group4\\csv_files\\MotorPH Employee Data - Credentials.csv"));

// ☆*: .｡. o(≧▽≦)o .｡.:*☆
            String csvRow;

// (～￣▽￣)～
            String[] csvColumn;

// Csv is like a forgetful human – it's got a head,
// but by the time it reaches the end, it's just a
// bunch of mixed-up tales from different timelines! 🧠💃🕺

            boolean isCredentialCsvHeader = true;

// Reading a CSV file is like a delicate dance of data,
// where every comma is a flirtatious twirl and each newline
// is a gentle whisper of sweet nothings.
// Oh, the romance of turning rows into a symphony of information,
// where even the headers can't help but fall in love! 💃🌹🕺

            while ((csvRow = br.readLine()) != null) {

                if (isCredentialCsvHeader) {
// Oh, the majestic beginning of the CSV ballet – where headers waltz and pirouette!
                    isCredentialCsvHeader = false;
                } else {
// Time for the dramatic twist – introducing the lead character: csvUsername! 🎭🕵️‍♂️
// Will they authenticate successfully or stumble on the dance floor of credentials?
// Let's hope csvUsername has got its two-factor tango shoes on!

// Store csv row values(1st column for username and 2nd column for password)

                    csvColumn = csvRow.split(delimeter);

// And now, presenting the enchanting tale of csvUsername – the daring dancer of credentials! 🎭💃🕺
// Will they waltz their way into authentication glory or tango their troubles on the floor of denial?
// Fingers crossed, for csvUsername has donned its fanciest authentication attire!

                    if (csvColumn[0].equals(input_username) && csvColumn[1].equals(input_password)) {
                        System.out.println("Success! csvUsername dances gracefully into authentication.");


/**
 * Welcome to the magical world of coding, where lines of text come to life and dance
 * to the rhythm of logic! And guess what? We've got a sprinkle of AI magic in our comments 🎩✨🤖
 * Who knew coding could be this fun? Let's embark on a whimsical journey through the land
 * of algorithms and syntax – where even comments wear a smile! 😄🚀🌈
 *
 * Now, the curtain rises, and the stage is set – the next line is where dreams transform
 * into reality as we bring to life the enchanting diagrams we've crafted! 🎨✨🔮
 */


// Drumroll, please! 🥁🎉 It's showtime, folks! Get ready to witness the magic unfold as we take
// those captivating diagrams from the realm of imagination and turn them into living, breathing reality! 💫🎨🚀

                        boolean is_homepage = true;

// Behold, the grand stage of our program! 🎭 As we enter this magical loop, the world of MotorPH's
// digital wonders is at your fingertips. Choose your adventure wisely as you navigate through the
// captivating acts of information – from the mystique of About MotorPH to the rhythmic beats of Salary Calculator!

                        int choice = 0; // The choice made by our adventurous programmer🙌🙌🙌

                        do {
                            System.out.println("Display Operations\n" +
                                    "[0] About MotorPH\n" +
                                    "[1] Employees\n" +
                                    "[2] Attendances\n" +
                                    "[3] Leaves\n" +
                                    "[4] Salary Calculator\n" +
                                    "[5] Quit");

                            try {

                                // It's time to choose your adventure!

                                System.out.print("Enter your choice: ");
                                choice = scanner.nextInt()/* Some magical code to get the choice from the user */;

                                switch (choice) {

                                    /**
                                     * Displaying About Terminal Start
                                     */

                                    case 0: {

                                        boolean isDisplayingAboutTerminal = true;

                                        do {
                                            print("Welcome to the mystical realm of MotorPH!");
                                            print("Here, the engines purr and the pixels dance.");
                                            print("But beware, for behind every line of code lies a hidden bug, waiting to strike!\n\n\n");
                                            print("---MOTORPH---");
                                            print("[0] Who are we");
                                            print("[1] What we offer");
                                            print("[2] Our goal");
                                            print("[3] Exit");
                                            try {
                                                scanner = new Scanner(System.in);
                                                System.out.println("Enter number between 0 to 3: ");
                                                int choice_about_terminal = scanner.nextInt();

                                                switch (choice_about_terminal) {
                                                    case 0: {
                                                        print("MotorPH was established in 2020 to provide private transportation options to Filipinos. Our goal is to be the first choice for Filipinos searching for competitive and affordable motorcycles.");
                                                        break;
                                                    }
                                                    case 1: {
                                                        print("We offer motorcycles from different brands (Honda, Yamaha, Suzuki, and Kawasaki) at a discounted cash rate and flexible installment terms (from 3 months to 3 years).");
                                                        break;
                                                    }
                                                    case 2: {
                                                        print("From a purely online presence, MotorPH is planning to open physical stores. In the next 18 months, we're planning to open branches in different parts of the Philippines. ");
                                                        break;
                                                    }
                                                    case 3: {
                                                        isDisplayingAboutTerminal = false;
                                                        break;
                                                    }
                                                    default: {
                                                        System.out.println("Please choose a number between 0 and 3.");
                                                    }
                                                }
                                            } catch (InputMismatchException inputMismatchException) {
                                                System.out.println("Invalid input");
                                            }
                                        }
                                        while (isDisplayingAboutTerminal);
                                        break;

                                        /**
                                         * Display About End Terminal
                                         */

                                    }

                                    case 1:

                                        /**
                                         * Display Employees Start Terminal
                                         */

                                        System.out.println("Ah, the heart and soul of MotorPH - its employees!");
                                        System.out.println("They work tirelessly to make the magic happen.");
                                        System.out.println("You can view their details and maybe even award them virtual donuts!");


                                        boolean isDisplayingEmployeeTerminal = true;

                                        do {

                                            ArrayList<Employee> employees = new ArrayList<>();

                                            System.out.println("----------MotorPH Employee View-----------\n" +
                                                    "---THE FILIPINO'S CHOICE!---\n" +
                                                    "[0] View employees\n" +
                                                    "[1] View employee by employee number\n" +
                                                    "[2] Exit");

                                            try {
                                                scanner = new Scanner(System.in);
                                                System.out.print("Enter number kasi special ka😻: ");

                                                int choice_employee_terminal = scanner.nextInt();


                                                switch (choice_employee_terminal) {
                                                    case 0: {
                                                        System.out.println("View Employees");

                                                        employees = AllEmployeesJutsu();
                                                        // check employees size
                                                        // System.out.println(employees.size);

                                                        // employee csv header
                                                        System.out.printf("%10s", "Employee #");
                                                        System.out.printf("%20s", "Last Name");
                                                        System.out.printf("%20s", "First Name" + "\t\t");
                                                        System.out.printf("%-30s", "Birthday");
                                                        System.out.print(format("-%30s", "Address") + "\n");
                                                        // employee values
                                                        employees.forEach(x -> {
                                                            System.out.printf("%10s", x.getId());
                                                            System.out.printf("%20s", x.getLastName());
                                                            System.out.printf("%20s", x.getFirstName() + "\t\t");
                                                            System.out.printf("%-30s", x.getBirthday());
                                                            System.out.print(format("-%30s", x.getAddress()) + "\n");
                                                        });
                                                        employees.clear();
                                                        System.out.println("Done");
                                                        break;
                                                    }
                                                    case 1: {
                                                        System.out.println("Tingnan ang impormasyon ng empleyado gamit ang numero ng empleyado");
                                                        employees = AllEmployeesJutsu();

                                                        boolean isDisplayingFindEmployeeTerminal = true;
                                                        int inputFindEmployee = 0;
                                                        do {

                                                            scanner = new Scanner(System.in);
                                                            System.out.print("Ilagay ang numero ng empleyado: ");

                                                            try {
                                                                inputFindEmployee = scanner.nextInt();

                                                                Employee isFoundEmployee = getIsFoundEmployee(employees, inputFindEmployee);

                                                                String findEmployeeResult = isFoundEmployee == null

                                                                        // Kapag hindi natagpuan ang empleyado!
                                                                        ?

                                                                        "Account " + (inputFindEmployee) + " ay hindi natagpuan. "

                                                                        //  Kapag nasa katwiran ang input Ipaglaban mo!, este ipakita !😆
                                                                        :
                                                                        String.format("%10s", "Employee #") +
                                                                                String.format("%20s", "Last Name") +
                                                                                String.format("%20s", "First Name" + "\t\t") +
                                                                                String.format("%-30s", "Birthday") +
                                                                                String.format("%-30s", "Address") + "\n" +

                                                                                String.format("%10s", isFoundEmployee.getId()) +
                                                                                String.format("%20s", isFoundEmployee.getLastName()) +
                                                                                String.format("%20s", isFoundEmployee.getFirstName() + "\t\t") +
                                                                                String.format("%-30s", isFoundEmployee.getBirthday()) +
                                                                                String.format("%-30s", isFoundEmployee.getAddress()) + "\n\n\n" +
                                                                                "Account FOUND!!!!";
                                                                System.out.println(findEmployeeResult);
                                                                break;
                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Hindi tamang input...");
                                                                break;
                                                            }
                                                        }
                                                        while (isDisplayingFindEmployeeTerminal);

                                                        employees.clear();
                                                        break;
                                                    }

                                                    case 2: {
                                                        System.out.println("Exit");
                                                        isDisplayingEmployeeTerminal = false;
                                                        break;
                                                    }
                                                    // bug1
                                                    default:

                                                        System.out.println("Input " + " [" + choice_employee_terminal + "] " + "not found...");
                                                        break;

                                                }
                                            } catch (InputMismatchException inputMismatchException) {
                                                System.out.println("Invalid input...");
                                            }

                                        } while (isDisplayingEmployeeTerminal);
                                        break;

                                    case 2:
                                        System.out.println("Keep track of the digital footprints of our adventurers!");
                                        System.out.println("Attendance logs await your perusal, revealing who's been navigating these lines of code.");


                                        boolean isDiplayingAttendances = true;

                                        do {

                                            System.out.println("----------MotorPH Attendances View-----------\n" +
                                                    "---THE FILIPINO'S CHOICE!---\n" +
                                                    "[0] View attendances\n" +
                                                    "[1] View attendance by employee number\n" +
                                                    "[2] Exit");
                                            try {
                                                scanner = new Scanner(System.in);
                                                System.out.print("Enter number between 0 & 2 : ");

                                                BufferedReader brAttendances = new BufferedReader(new FileReader("C:\\Users\\jomar\\IdeaProjects\\MO-IT101-Group4\\csv_files\\MotorPH Employee Data - Attendance Record.csv"));

                                                int choice_attendance_terminal = scanner.nextInt();

                                                switch (choice_attendance_terminal) {
                                                    case 0: {
                                                        System.out.println("View attendances");

                                                        printAttendancesHeaders();

                                                        String row;
                                                        String[] col;
                                                        boolean isHeader = true;

                                                        while ((row = brAttendances.readLine()) != null) {

                                                            if (isHeader) isHeader = false;
                                                            else {
                                                                String knife = ","; // knife kasi hihiwain ko si row apat na beses yummy!!!😋
                                                                col = row.split(knife);
                                                                printAttendancesValues(col);
                                                            }
                                                        }
                                                        break;
                                                    }
                                                    case 1: {
                                                        System.out.println("View attendances by employee number");
                                                        System.out.print("Enter employee # : ");
                                                        scanner = new Scanner(System.in);

                                                        int inputFindEmployeeAttendances = scanner.nextInt();

                                                        printAttendancesHeaders();

                                                        String row;
                                                        String[] col;

                                                        boolean isHeader = true;
                                                        while ((row = brAttendances.readLine()) != null) {
                                                            col = row.split(",");
                                                            if (isHeader) isHeader = false;
                                                            else {
                                                                if (Integer.parseInt(col[0]) == inputFindEmployeeAttendances) {
                                                                    printAttendancesValues(col);
                                                                }
                                                            }
                                                        }
                                                        break;
                                                    }
                                                    case 2: {
                                                        System.out.println("Exit");
                                                        isDiplayingAttendances = false;
                                                        break;
                                                    }

                                                }
                                            } catch (InputMismatchException e) {
                                                System.out.println("Invalid input...");
                                            }
                                        }
                                        while (isDiplayingAttendances);

                                        break;

                                    case 3:
                                        System.out.println("Even programmers need a break from time to time.");
                                        System.out.println("Explore the mystical world of leaves and discover the tales of absences.");
                                        break;

                                    case 4:
                                        System.out.println("Time to unveil the secret behind the magic coins!");
                                        System.out.println("The Salary Calculator will reveal the enchanting algorithms that determine rewards.");
                                        break;

                                    case 5:
                                        System.out.println("Farewell, brave adventurer!");
                                        System.out.println("You've danced through the digital wonders of MotorPH, but now it's time to exit the stage.");
                                        is_homepage = false;
                                        break;

                                    default:
                                        System.out.println("Ah, an adventurous spirit! But I'm afraid that's not a valid choice.");
                                        System.out.println("Please choose a number between 0 and 5.");
                                        break;
                                }
                            } catch (InputMismatchException inputMismatchException) {
                                System.out.println("Invalid input...");
                            }
                        } while (choice != 5);
                        while (is_homepage) ;
                    }
                }
            }
            // May delay kasi filipino time😆
            StringBuilder stringBuilder = new StringBuilder();

            for (int i = 0; i < 3; i++) {
                stringBuilder.append(".");
                Thread.sleep(1000);
                System.out.println("Verifying" + stringBuilder);
            }
            ;

            System.out.println("You have " + LOGIN_ATTEMPT + " left...");

            LOGIN_ATTEMPT--;

        } while (LOGIN_ATTEMPT > 0);

        String message = (LOGIN_ATTEMPT == 0)
                ? "Access denied due to incorrect credentials."
                : """
                Office Hours: 8:30am–5:30pm, Monday through Saturday\s
                Office Address: 7 Jupiter Avenue cor. F. Sandoval Jr., Bagong Nayon, Quezon City\s
                Phone: (028) 911-5071 / (028) 911-5072 / (028) 911-5073\s
                Email: corporate@motorph.com""";

        System.out.println(message);
    }

    private static void printAttendancesValues(String[] col) {

        String employeeNumber = col[0],
                firstName = col[1],
                lastName = col[2],
                date = col[3],
                timeIn = col[4],
                timeOut = col[5];

        System.out.printf("%10s", employeeNumber);
        System.out.printf("%20s", firstName.replace(" ", ""));
        System.out.printf("%20s", lastName.replace(" ", ""));
        System.out.printf("%15s", date + "\t");
        System.out.printf("%-10s", timeIn);
        System.out.printf("%-10s", timeOut);
        System.out.println();

    }

    private static void printAttendancesHeaders() {
        String[] headers = {
                "Employee #",
                "Last Name",
                "First Name",
                "Date",
                "Time-in",
                "Time-out"
        };

        System.out.printf("%10s", headers[0]);
        System.out.printf("%20s", headers[1]);
        System.out.printf("%20s", headers[2]);
        System.out.printf("%15s", headers[3] + "\t");
        System.out.printf("%-10s", headers[4]);
        System.out.printf("%-10s", headers[5] + "\n");
    }

    private static Employee getIsFoundEmployee(ArrayList<Employee> employees, int inputFindEmployee) {
        Employee isFoundEmployee = null;

        for (Employee employee : employees) {
            if (employee.getId().equals(String.valueOf(inputFindEmployee))) {
                isFoundEmployee = employee;
            }
        }
        return isFoundEmployee;
    }


    /**
     * Created my own csv reader🤪
     */
    // Play this music while reading the body of the method to maximize the experience of my GENJUTSU
    // https://www.youtube.com/watch?v=3Q45lWWuc2w
    // I wrote this via debugging tool😁, Para may laban ng katawan, mag bonakid Pre-school
    public static ArrayList<Employee> AllEmployeesJutsu() {

        ArrayList<Employee> employeeList = new ArrayList<>();
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader("C:\\Users\\jomar\\IdeaProjects\\MO-IT101-Group4\\csv_files\\MotorPH Employee Data - Employee Details.csv"));
            String line;
            boolean is_header = true;
            while ((line = br.readLine()) != null) {
                if (is_header) {
                    is_header = false;
                    continue;
                }
                String[] splitted_data = line.split(",");
                ArrayList<String> processedColumn = new ArrayList<>();
                StringBuilder concatStr = new StringBuilder();
                for (int i = 0; i < splitted_data.length; i++) {
                    int lastIndex = splitted_data[i].length() - 1;
                    if (splitted_data[i].charAt(0) == '\"') {
                        if (concatStr.length() > 0) {
                            if (concatStr.toString().contains("  ")) {
                                concatStr = new StringBuilder(concatStr.toString().replace("  ", ", "));
                                String recipe_str = concatStr.toString();
                                String cooked_str = concatStr.toString().trim();
                                int leadingSpaces = recipe_str.length() - cooked_str.length();
                                String finalString = recipe_str.substring(leadingSpaces);
                                processedColumn.add(finalString);
                                concatStr = new StringBuilder(splitted_data[i]);
                            }
                        } else {
                            concatStr.append(" ").append(splitted_data[i]);
                        }
                    } else if (splitted_data[i].charAt(0) == ' ') {
                        concatStr.append(" ").append(splitted_data[i]);
                    } else if (splitted_data[i].charAt(lastIndex) == '\"') {
                        concatStr.append(" ").append(splitted_data[i].trim());
                        if (concatStr.charAt(concatStr.length() - 1) == '\"') {
                            String removeWhiteSpace = concatStr.toString().replace(" ", "");
                            processedColumn.add(removeWhiteSpace);
                            concatStr = new StringBuilder();
                        }
                    } else {
                        if (splitted_data[i].charAt(0) == '\"' && splitted_data[i].charAt(lastIndex) == '\"') {
                            String convertTwoWhiteSpaceIntoCommaWithWhitespace = concatStr.toString().replace("  ", ", ");
                            processedColumn.add(convertTwoWhiteSpaceIntoCommaWithWhitespace);
                            concatStr = new StringBuilder();
                        } else if (!concatStr.isEmpty()) {
                            lastIndex = concatStr.length() - 1;
                            if (concatStr.charAt(0) == '\"' && (concatStr.charAt(lastIndex) == '\"')) {
                                String convertTwoWhiteSpaceIntoCommaWithWhiteSpace = concatStr.toString().replace("  ", ", ");
                                processedColumn.add(convertTwoWhiteSpaceIntoCommaWithWhiteSpace.replace("\"\"", ""));
                                concatStr = new StringBuilder();
                                i--; // If it works don't touch it:
                                // ⚠️I won't rewriting this completely from scratch. It will take several months less than even trying to understand what I wrote.
                                // ➕I can use csv libraries(opencsv) but it isn't allowed for the term.
                                // Possibly they allow to use libraries after they read my code🤣.
                                // I inquire with AI about optimizing my code, but unfortunately, it struggles to comprehend my request.
                                // I recognize the need to refine my prompts in order to clearly convey the desired outcome.
                            } else if (concatStr.charAt(0) == '\"' && (concatStr.charAt(lastIndex) == ' ')) {
                                String convertTwoWhiteSpaceIntoComma = concatStr.toString().replace("  ", ", ");
                                processedColumn.add(convertTwoWhiteSpaceIntoComma.replace("\"\"", ""));
                                concatStr = new StringBuilder();
                            }
                        } else {
                            concatStr = new StringBuilder(splitted_data[i]);
                            processedColumn.add(concatStr.toString());
                            concatStr = new StringBuilder();
                        }
                    }
                }

                // remove double quotes
                String BasicSalary = (String.valueOf(processedColumn.get(13)).replaceAll("\"", ""));
                String RiceSubsidy = (String.valueOf(processedColumn.get(14)).replaceAll("\"", ""));
                String PhoneAllowance = (String.valueOf(processedColumn.get(15)).replaceAll("\"", ""));
                String ClothingAllowance = (String.valueOf(processedColumn.get(16)).replaceAll("\"", ""));
                String GrossSemimonthlyRate = (String.valueOf(processedColumn.get(17)).replaceAll("\"", ""));
                String HourlyRate = (String.valueOf(processedColumn.get(18)).replaceAll("\"", ""));

                Employee employee = new Employee(
                        String.valueOf(processedColumn.get(0)).replaceAll("\"", ""),
                        String.valueOf(processedColumn.get(1)).replaceAll("\"", ""),
                        String.valueOf(processedColumn.get(2)).replaceAll("\"", ""),
                        String.valueOf(processedColumn.get(3)).replaceAll("\"", ""),
                        String.valueOf(processedColumn.get(4)).replaceAll("\"", ""),
                        String.valueOf(processedColumn.get(5)).replaceAll("\"", ""),
                        String.valueOf(processedColumn.get(6)).replaceAll("\"", ""),
                        String.valueOf(processedColumn.get(7)).replaceAll("\"", ""),
                        String.valueOf(processedColumn.get(8)).replaceAll("\"", ""),
                        String.valueOf(processedColumn.get(9)).replaceAll("\"", ""),
                        String.valueOf(processedColumn.get(10)).replaceAll("\"", ""),
                        String.valueOf(processedColumn.get(11)).replaceAll("\"", ""),
                        String.valueOf(processedColumn.get(12)).replaceAll("\"", ""),
                        Integer.parseInt((BasicSalary).replace(",", "")), // remove comma
                        Integer.parseInt((RiceSubsidy).replace(",", "")), // remove comma
                        Integer.parseInt((PhoneAllowance).replace(",", "")), // remove comma
                        Integer.parseInt((ClothingAllowance).replace(",", "")), // remove comma
                        Integer.parseInt((GrossSemimonthlyRate).replace(",", "")), // remove comma
                        Float.parseFloat((HourlyRate).replace(",", ""))); // remove comma
                employeeList.add(employee);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return employeeList;
    }
}
