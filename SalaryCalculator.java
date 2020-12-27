package exerciseFourPointTwoZero;

//4.20 (Salary Calculator) Develop a Java application that determines the gross pay for each of
//        three employees. The company pays straight time for the first 40 hours worked by each employee
//        and time and a half for all hours worked in excess of 40. You’re given a list of the employees, their
//        number of hours worked last week and their hourly rates. Your program should input this information for each employee,
//        then determine and display the employee’s gross pay. Use class Scanner to
//        input the data.

import javax.swing.*;

public class SalaryCalculator {
    private double companyHourlyPay;
    private String employeeName;
    private int numberOfHoursWorked;
    private  int regularHour = 40;
    private double grossPay;

    public void setCompanyHourlyPay() {
       double companyHourlyPay = Double.parseDouble(JOptionPane.showInputDialog("Enter company's hourly pay rate:"));
      this.companyHourlyPay  = companyHourlyPay;
    }

    public double getCompanyHourlyPay() {
        return companyHourlyPay;
    }

    public void setEmployeeName() {
        String employeeName = JOptionPane.showInputDialog("Enter name of employee: ");
        this.employeeName = employeeName.toUpperCase();
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setNumberOfHoursWorked() {
        int numberOfHoursWorked = Integer.parseInt(JOptionPane.showInputDialog("Enter number of hours worked: "));
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    public int getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    public void setGrossPayCalculation() {
        setEmployeeName();
        setCompanyHourlyPay();
        setNumberOfHoursWorked();
        if(numberOfHoursWorked <= regularHour){
            grossPay = numberOfHoursWorked * companyHourlyPay;
        } else {
            JOptionPane.showMessageDialog(null,"Overtime noticed");
            double overTime = numberOfHoursWorked - regularHour;
            double extraPay = overTime * (companyHourlyPay * 1.5);
            double salary = regularHour * companyHourlyPay;
            double grossPay = salary + extraPay;
            this.grossPay = grossPay;
        }
    }

    public double getGrossPayCalculation() {
        return grossPay;
    }

}
