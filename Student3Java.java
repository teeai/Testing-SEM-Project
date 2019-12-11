/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student3.java;
import java.util.Scanner;
/**
 *
 * @author Ai Ai
 */
public class Student3Java {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        double studMark;
        
        Student UGStudent = new Student("Adila", 222227,30);
        UGStudent.displayInfo();
        System.out.println();
        
        System.out.print("Please enter student's mark:");
        studMark = read.nextDouble();
        
        UGStudent.displayInfo (UGStudent, studMark);
        System.out.println();
        System.out.println("After object passed to method");
        System.out.println("Student's name:"+ UGStudent.getName());
        System.out.println("Student's name:"+ UGStudent.getMatricNo());
        System.out.println("Student's name:"+ UGStudent.determineGrade(studMark));
    }
    
}
