/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1salarycalculator;

/**
 *
 * @author Nikoly
 */
public class SalaryCalculator {
    
    public int calcHourlyWage(int salary){
        int hourWage = salary/(52*40);
        System.out.println("Your Hourly Wage is " + hourWage);
        return hourWage;
    }
    public int calcSalary(int hourlyRate){
        int salary = hourlyRate * (52*40);
        System.out.println("Your Salary is " + salary);
        return salary;
    }
    public double calcTaxes(double salary, double perc){
        double taxes = (perc/100) * salary;
        System.out.println("Your Taxes Are " + taxes);
        return taxes;
    }
    public double afterTax(double salary, double perc){
        double cashOut = salary - ((perc/100)*salary);
        System.out.println("Your Cash Out Is " + cashOut);
        return cashOut;
    }
    
}
