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
public class SalariedEmployee extends Employee{
    double salary;
    
    public SalariedEmployee(){
        this("", "", 0.0);
    }
    
    public SalariedEmployee(String name, String myKad, double salary){
        super(name, myKad);
        this.salary=salary;
    }
    
    public void setSalary(double sala){
       salary = sala;
    }
    
    public double getSalary(){
        return salary;
    }
    
    public double getEarnings(){
        setEarnings(salary);
        return earnings;
    }
    public String getEmployeeInfo(){
        DecimalFormat formatter = new DecimalFormat("#.00");
        String info = "Salaried employee: " + getName() + 
                "\n" + "MyKad: " + getMyKad() + 
                "\n" + "Monthly salary: $" + formatter.format(getSalary()) + 
                "\n" + "Earned $" + formatter.format(getEarnings());
        return(info);
    }

    
}
