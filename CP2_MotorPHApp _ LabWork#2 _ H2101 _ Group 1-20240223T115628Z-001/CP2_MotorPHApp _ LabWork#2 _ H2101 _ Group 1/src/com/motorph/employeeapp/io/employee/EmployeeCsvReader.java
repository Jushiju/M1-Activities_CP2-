package com.motorph.employeeapp.io.employee;

import com.motorph.employeeapp.EmployeeApp;
import com.motorph.employeeapp.models.Employee;
import com.motorph.employeeapp.models.records.Employees;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class EmployeeCsvReader {
    public static void addAllEmployee() {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(EmployeeApp.EMPLOYEE_DETAILS_CSV));
            String line;
            boolean is_header = true;
            while ((line = br.readLine()) != null) {
                if (is_header) {
                    is_header = false;
                    continue;
                }
                String[] splitted_data = line.split(",");
                ArrayList<String> processedColumn = new ArrayList<String>();
                String concatStr = "";
                for (int i = 0; i < splitted_data.length; i++) {
                    int lastIndex = splitted_data[i].length() - 1;
                    if (splitted_data[i].charAt(0) == '\"') {
                        if (!concatStr.isEmpty()) {
                            if (concatStr.contains("  ")) {
                                concatStr = concatStr.replace("  ", ", ");
                                String recipe_str = concatStr;
                                String cooked_str = concatStr.trim();
                                int leadingSpaces = recipe_str.length() - cooked_str.length();
                                String finalString = recipe_str.substring(leadingSpaces);
                                processedColumn.add(finalString);
                                concatStr = splitted_data[i];
                            }
                        } else {
                            concatStr += (" " + splitted_data[i]);
                        }
                    } else if (splitted_data[i].charAt(0) == ' ') {
                        concatStr += (" " + splitted_data[i]);
                    } else if (splitted_data[i].charAt(lastIndex) == '\"') {
                        concatStr += (" " + splitted_data[i].trim());
                        if (concatStr.charAt(concatStr.length() - 1) == '\"') {
                            String removeWhiteSpace = concatStr.replace(" ", "");
                            processedColumn.add(removeWhiteSpace);
                            concatStr = "";
                        }
                    } else {
                        if (splitted_data[i].charAt(0) == '\"' && splitted_data[i].charAt(lastIndex) == '\"') {
                            String convertTwoWhiteSpaceIntoCommaWithWhitespace = concatStr.replace("  ", ", ");
                            processedColumn.add(convertTwoWhiteSpaceIntoCommaWithWhitespace);
                            concatStr = "";
                        } else if (!concatStr.isEmpty()) {
                            lastIndex = concatStr.length() - 1;
                            if (concatStr.charAt(0) == '\"' && (concatStr.charAt(lastIndex) == '\"')) {
                                String convertTwoWhiteSpaceIntoCommaWithWhiteSpace = concatStr.replace("  ", ", ");
                                processedColumn.add(convertTwoWhiteSpaceIntoCommaWithWhiteSpace.replace("\"\"", ""));
                                concatStr = "";
                                i--; // helloworld
                            } else if (concatStr.charAt(0) == '\"' && (concatStr.charAt(lastIndex) == ' ')) {
                                String convertTwoWhiteSpaceIntoComma = concatStr.replace("  ", ", ");
                                processedColumn.add(convertTwoWhiteSpaceIntoComma.replace("\"\"", ""));
                                concatStr = "";
                            }
                        } else {
                            concatStr = splitted_data[i];
                            processedColumn.add(concatStr);
                            concatStr = "";
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
                        String.valueOf(processedColumn.get(0)).replaceAll("\"",""),
                        String.valueOf(processedColumn.get(1)).replaceAll("\"",""),
                        String.valueOf(processedColumn.get(2)).replaceAll("\"",""),
                        String.valueOf(processedColumn.get(3)).replaceAll("\"",""),
                        String.valueOf(processedColumn.get(4)).replaceAll("\"",""),
                        String.valueOf(processedColumn.get(5)).replaceAll("\"",""),
                        String.valueOf(processedColumn.get(6)).replaceAll("\"",""),
                        String.valueOf(processedColumn.get(7)).replaceAll("\"",""),
                        String.valueOf(processedColumn.get(8)).replaceAll("\"",""),
                        String.valueOf(processedColumn.get(9)).replaceAll("\"",""),
                        String.valueOf(processedColumn.get(10)).replaceAll("\"",""),
                        String.valueOf(processedColumn.get(11)).replaceAll("\"",""),
                        String.valueOf(processedColumn.get(12)).replaceAll("\"",""),
                        Integer.parseInt((BasicSalary).replace(",", "")), // remove comma
                        Integer.parseInt((RiceSubsidy).replace(",", "")), // remove comma
                        Integer.parseInt((PhoneAllowance).replace(",", "")), // remove comma
                        Integer.parseInt((ClothingAllowance).replace(",", "")), // remove comma
                        Integer.parseInt((GrossSemimonthlyRate).replace(",", "")), // remove comma
                        Float.parseFloat((HourlyRate).replace(",", ""))); // remove comma
                Employees.addEmployee(employee);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
