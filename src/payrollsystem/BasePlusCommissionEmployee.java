/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrollsystem;

import java.text.DecimalFormat;

/**
 *
 * @author Ai Ai
 */
public class BasePlusCommissionEmployee extends CommissionEmployee{
    double salary;
    double newSalary;
    
    public BasePlusCommissionEmployee(){
        this("", "", 0.0, 0.0, 0.0);
    }
    
    public BasePlusCommissionEmployee(String name, String myKad, double grossSales, double rate, double salary){
        super(name, myKad, grossSales, rate);
        this.salary=salary;
        this.newSalary=salary;
    }
    
    public void setSalary(double salarys){
        salary = salarys;
    }
    
    public double getSalary(){
        return salary;
    }
    
    public void setNewSalary(double newsalarys){
        newSalary = salary * 1.1;
    }
    
    public double getNewSalary(){
        return newSalary;
    }
    
    public double getEarnings(){
        setEarnings(getNewSalary() + (grossSales * rate));
        return earnings;
    }
    public String getEmployeeInfo(){
        DecimalFormat formatter = new DecimalFormat("#.00");
        String info = "Base-salaried Commission employee: " + getName() + 
                "\n" + "MyKad: " + getMyKad() + 
                "\n" + "Gross Sales: $" + formatter.format(getGrossSales()) + "; Commission rate: " + getRate() + "; Base salary: $" + formatter.format(getSalary()) + 
                "\n" + "New base salary with 10% increase is: $" + formatter.format(getNewSalary()) + 
                "\n" + "Earned $" + formatter.format(getEarnings());
        return(info);
    }

    
}
