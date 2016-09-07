/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uits.jv1608.learningclasses;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author Serebra
 */
public class StudentExample {
    public static void main(String[] args) throws ParseException {
        Student[] arrayStudent = new Student[20];
        for(int i=0; i<20; i++){
            arrayStudent[i] = new Student();
        }
        System.out.println("Please, enter the code of the faculty "
                + "from a specified list of faculties below to print a list of students:" + "\n");
        
        System.out.println("AI -> AUTOMATICS AND INSTRUMENT DEPARTMENT," + "\n" 
                + "ME -> MECHANICAL ENGINEERING DEPARTMENT" + "\n" 
                + "EPh -> ENGINEERING PHYSICS DEPARTMENT" + "\n" 
                + "CSM -> COMPUTER SCIENCE AND MANAGEMENT DEPARTMENT" + "\n" 
                + "E -> ECONOMIC DEPARTMENT" + "\n" 
                + "BF -> DEPARTMENT OF BUSINESS AND FINANCE" + "\n" 
                + "EMI -> ELECTRIC MACHINE INDUSTRY DEPARTMENT" + "\n" 
                + "PhT -> PHYSICO-TECHNICAL DEPARTMENT" + "\n" 
                + "TOS -> TECHNOLOGY OF ORGANIC SUBSTANCES" + "\n" 
                + "ITACh -> INTEGRAL TECHNOLOGY AND APPLIED CHEMISTRY");
        System.err.println(" ");
        Scanner in = new Scanner(System.in);
        String dep = in.next();
        for(Student x : arrayStudent){
            if(x.department.equals(dep))
            System.out.println(x);
        }
        System.out.println(" ");
        //This method prints lists of students of each faculty
        printListOfStudentsFromAllDepartments(arrayStudent);
        System.out.println("");
        //This method prints lists of students of each year of study
        listOfStudentsOfAllTheYearsOfStudy(arrayStudent);
        
        System.out.println("Enter the year in format \"dd.mm.yyyy\" to print list of "
                + "students that were born after this year");
        Scanner in1 = new Scanner(System.in);
        String theDate = in1.next();
        //Этот метод печатает список студентов, родившихся после введенного года
        listOfStudentsAfterDateOfBirth(arrayStudent, theDate);
        System.out.println(" ");
        //чтобы распечатать список студ группы нужно ее ввести, то есть в начале дать перечень
        //шифров групп, которые нужно ввести
        System.out.println("Please, enter the group number from a specified list "
                + "of students groups below to print a list of students" + "\n");
        System.out.println("\"40-b\"" + "\n" + "\"12-a\"" + "\n" + "\"15\"" + "\n"
        + "\"26-a\"" + "\n" + "\"47-b\"" + "\n" + "\"35\"" + "\n"
        + "\"58-a\"" + "\n" + "\"20\"" + "\n" + "\"20\"" + "\n"
        + "\"67\"" + "\n" + "\"30\"" +"\n");
        Scanner in2 = new Scanner(System.in);
        String groupN = in2.next();
        listOfStudentsOfChosenGroup(arrayStudent, groupN);
    }
    
    public static void printListOfStudentsFromAllDepartments(Student arr[]){
        System.out.println("List of students from AUTOMATICS AND INSTRUMENT department:");
        for(Student x : arr){
            if(x.department.equals("AI")){ 
                System.out.println(x + "\n");
            }
        }
        System.out.println("List of students from MECHANICAL ENGINEERING department:");
        for(Student x : arr){
            if(x.department.equals("ME")){ 
                System.out.println(x + "\n"); 
            }
        }
        System.out.println("List of students from ENGINEERING PHYSICS department:");
        for(Student x : arr){
            if(x.department.equals("EPh")){
                System.out.println(x + "\n"); 
            }
        }
        System.out.println("List of students from COMPUTER SCIENCE AND MANAGEMENT department:");
        for(Student x : arr){
            if(x.department.equals("CSM")){ 
                System.out.println(x + "\n");
            }
        }
        System.out.println("List of students from ECONOMIC department:");
        for(Student x : arr){
            if(x.department.equals("E")){ 
                System.out.println(x + "\n");
            }
        }
        System.out.println("List of students from DEPARTMENT OF BUSINESS AND FINANCE department:");
        for(Student x : arr){
            if(x.department.equals("BF")){ 
                System.out.println(x + "\n");
            }
        }
        System.out.println("List of students from ELECTRIC MACHINE INDUSTRY department:");
        for(Student x : arr){
            if(x.department.equals("EMI")){
                System.out.println(x + "\n");
            }
        }
        System.out.println("List of students from PHYSICO-TECHNICAL department:");
        for(Student x : arr){
            if(x.department.equals("PhT")){
                System.out.println(x + "\n");
            }
        }
        System.out.println("List of students from TECHNOLOGY OF ORGANIC SUBSTANCES department:");
        for(Student x : arr){
            if(x.department.equals("TOS")){
                System.out.println(x + "\n");
            }
        }
        System.out.println("List of students from INTEGRAL TECHNOLOGY AND APPLIED CHEMISTRY department:");
        for(Student x : arr){
            if(x.department.equals("ITACh")){
                System.out.println(x + "\n");
            }
        }
    }    
    
    public static void listOfStudentsOfAllTheYearsOfStudy(Student arr[]){
        System.out.println("List of students from the first year of study:");
        for(Student x : arr){
            if(x.yearOfStudy == 1) 
                System.out.println(x + "\n");    
        }
        System.out.println("List of students from the second year of study:");
        for(Student x : arr){
            if(x.yearOfStudy == 2) 
                System.out.println(x + "\n");
        }
        System.out.println("List of students from the third year of study:");
        for(Student x : arr){
            if(x.yearOfStudy == 3) 
                System.out.println(x + "\n");    
        }
        System.out.println("List of students from the fourth year of study:");
        for(Student x : arr){
            if(x.yearOfStudy == 4) 
                System.out.println(x + "\n");   
        }
        System.out.println("List of students from the fifth year of study:");
        for(Student x : arr){
            if(x.yearOfStudy == 5)
                System.out.println(x+ "\n");   
        }
        System.out.println("List of students from the sixth year of study:");
        for(Student x : arr){
            if(x.yearOfStudy == 6) 
                System.out.println(x + "\n");   
        }
    }
    
    public static void listOfStudentsAfterDateOfBirth(Student arr[], String theDate) throws ParseException{
        Date d = new SimpleDateFormat("dd.mm.yyyy").parse(theDate);
        for(Student x : arr){
            if(new SimpleDateFormat("dd.mm.yyyy").parse(x.dateOfBirthStudent).after(d) )
                System.out.println(x + "\n");
        }
    }
    
     public static void listOfStudentsOfChosenGroup(Student arr[], String groupN){
        for(Student x : arr){
            if(x.groupNumber.equals(groupN))
                System.out.println(x + "\n");
        }   
    }
}
