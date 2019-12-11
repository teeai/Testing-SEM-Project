/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrollsystem;

import java.util.ArrayList;

/**
 *
 * @author Ai Ai
 */
public class PayrollSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <Employee> employees = new ArrayList<Employee>();
        employees.add(new SalariedEmployee("Mohd Akmal", "801123-10-5749", 2400));
        employees.add(new CommissionEmployee("Sanjay Menon", "870314-02-5507", 10000, 0.06));
        employees.add(new BasePlusCommisionEmployee("Siti Saifudin", "900128-14-7862", 5000.00, 0.04, 1200.00));
        
        for(int x = 0; x < employees.size(); x++){
            System.out.println(employees.get(x).getEmployeeInfo());
            System.out.println("\n");
        }
    }

        
    }
    

