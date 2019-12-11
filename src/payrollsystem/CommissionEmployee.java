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
public class CommissionEmployee extends Employee {
    double grossSales, rate;
    
    public CommissionEmployee(){
        this("", "", 0.0, 0.0);
    }
    
    public CommissionEmployee(String name, String myKad, double grossSales, double rate){
        super(name, myKad);
        this.grossSales=grossSales;
        this.rate=rate;
    }
    
    public void setGrossSales(double grossSale){
        grossSales = grossSale;
    }
    
    public double getGrossSales(){
        return grossSales;
    }
    
    public void setRate(double rates){
        rate = rates;
    }
    
    public double getRate(){
        return rate;
    }
    
    public double getEarnings(){
        setEarnings(grossSales * rate);
        return earnings;
    }
    public String getEmployeeInfo(){
        DecimalFormat formatter = new DecimalFormat("#.00");
        String info = "Commission employee: " + getName() + 
                "\n" + "MyKad: " + getMyKad() + 
                "\n" + "Gross Sales: $" + formatter.format(getGrossSales()) + "; Commission rate: " + getRate() + 
                "\n" + "Earned $" + formatter.format(getEarnings());
        return(info);
    }
   
    
}
