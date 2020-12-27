package exerciseFourPointTwoZero;

import javax.swing.*;

public class SalaryCalculatorMain {
    public static void main(String[] args) {
        SalaryCalculator salaryCalculator = new SalaryCalculator();
        salaryCalculator.setCompanyHourlyPay();

        for(int counter = 1; counter <= 3; counter++){
            salaryCalculator.setEmployeeName();
            salaryCalculator.setNumberOfHoursWorked();
            salaryCalculator.setGrossPayCalculation();

            JOptionPane.showMessageDialog(null,"for "+ salaryCalculator.getEmployeeName() + " gross pay is " +salaryCalculator.getGrossPayCalculation());
        }


    }
}
