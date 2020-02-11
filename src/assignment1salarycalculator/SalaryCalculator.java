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
    private int hoursPerYear = (52*40);
    
    public double calcHourlyWage(double salary){
        double hourWage = salary / hoursPerYear;
        System.out.println("Your Hourly Wage is " + hourWage);
        return hourWage;
    }
    public double calcSalary(double hourlyRate){
        double salary = hourlyRate * hoursPerYear;
        System.out.println("Your Salary is " + salary);
        return salary;
    }
    public double calcTaxes(double salary, double perc){
        double taxes = (perc/100) * salary;
        System.out.println("Your Taxes Are " + taxes);
        return taxes;
    }
    public double calcAfterTax(double salary, double perc){
        double cashOut = salary - ((perc/100)*salary);
        System.out.println("Your Cash Out Is " + cashOut);
        return cashOut;
    }
    
}
