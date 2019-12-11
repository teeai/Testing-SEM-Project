/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student3.java;

/**
 *
 * @author Ai Ai
 */
public class Student {
    String name;
    int matricNo;
    public String grade;
    public static int noOfStudent = 0;
    
    public Student(String StudName,int MatricNum,double mark ){
        name=StudName;
        matricNo=MatricNum;
        grade= determineGrade (mark);
        noOfStudent++;
    
    }
    public String getName(){
        return name;
    }
    public int getMatricNo (){
        return matricNo;
    }
    public String determineGrade(double mark){
        if (mark>39)
            grade = "PASS";
        else
            grade = "FAIL";
        return grade;
    }
    public void displayInfo(){
        System.out.println("Name:" +name);
        System.out.println("Matric Number:" +matricNo);
        System.out.println("Grade:" +grade);     
    }
    public void displayInfo(Student stud,double sMark){
        stud.name = "Sara";
        stud.matricNo = 3333;
        stud.determineGrade(sMark);
        
    }
    
    
    
}
