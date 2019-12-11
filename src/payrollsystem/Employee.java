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
public abstract class Employee {
    String name;
    String myKad;
    double earnings;
    
    public Employee(){
        this("", "");
    }
    
    public Employee(String name, String myKad){
        setName(name);
        setMyKad(myKad);
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setMyKad(String myKad){
        this.myKad = myKad;
    }
    
    public void setEarnings(double earnings){
        this.earnings = earnings;
    }
    
    public String getName(){
        return name;
    }
    
    public String getMyKad(){
        return myKad;
    }
    
    public String getEmployeeInfo(){
        String info = "Employee: " + getName() + "\n" + "MyKad: " + getMyKad();
        return(info);
    }
    
    public abstract double getEarnings();

    
}
