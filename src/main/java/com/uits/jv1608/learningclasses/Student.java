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
public class Student {
    public static int id = 0;
    public String surname;
    public String name;
    public String patronymic;
    public String dateOfBirthStudent;        
    public String address;
    public String phoneNumber;
    public String department;
    public int yearOfStudy;
    public String groupNumber;
    
    public Student(){
        id += 1;
        InfoBase s = new InfoBase();
        surname = s.surnames[((int)(Math.random()*10))];
        
        InfoBase n = new InfoBase();
        name = n.names[((int)(Math.random()*10))];
        
        InfoBase p = new InfoBase();
        patronymic = p.patronymics[((int)(Math.random()*10))];
        
        InfoBase date = new InfoBase();
        dateOfBirthStudent = date.dateOfBirth[((int)(Math.random()*10))];
        
        InfoBase addr = new InfoBase();
        address = addr.addresses[((int)(Math.random()*10))];
        
        InfoBase phN = new InfoBase();
        phoneNumber = phN.phoneNumbers[((int)(Math.random()*10))];
        
        InfoBase dep = new InfoBase();
        department = dep.departments[((int)(Math.random()*10))];
        
        InfoBase ySdy = new InfoBase();
        yearOfStudy = ySdy.yearOfStudyN[((int)(Math.random()*10))];
        
        InfoBase grN = new InfoBase();
        groupNumber = grN.groupNumbers[((int)(Math.random()*10))];    
    }
    
    @Override
    public String toString(){
        return "Student: " + surname + " " + name + " " + patronymic + "\n"
                + "id: " + id + "; year of study: " + yearOfStudy + "\n"
                + "group number: " + groupNumber + "; " + "department: " + department + "\n" 
                + "date of birth: " + dateOfBirthStudent + "\n"
                + "phone number: " + phoneNumber + "\n"
                + "address: " + address;             
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getDateOfBirthStudent() {
        return dateOfBirthStudent;
    }

    public void setDateOfBirthStudent(String dateOfBirthStudent) {
        this.dateOfBirthStudent = dateOfBirthStudent;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }
    
    public void listOfStudentsOfChosenDepartment(Student arr[], String department){
        for(Student x : arr){
            if(Student.this.department.equals(department))
                System.out.println(x);
        }   
    } 

    public void printListOfStudentsFromAllDepartments(Student arr[]){
        System.out.println("List of students from AUTOMATICS AND INSTRUMENT department:");
        for(Student x : arr){
            if(Student.this.department.equals("AUTOMATICS AND INSTRUMENT")){ 
                System.out.println(x);
            }
        }
        System.out.println("List of students from MECHANICAL ENGINEERING department:");
        for(Student x : arr){
            if(Student.this.department.equals("MECHANICAL ENGINEERING")){ 
                System.out.println(x); 
            }
        }
        System.out.println("List of students from ENGINEERING PHYSICS department:");
        for(Student x : arr){
            if(Student.this.department.equals("ENGINEERING PHYSICS")){
                System.out.println(x); 
            }
        }
        System.out.println("List of students from COMPUTER SCIENCE AND MANAGEMENT department:");
        for(Student x : arr){
            if(Student.this.department.equals("COMPUTER SCIENCE AND MANAGEMENT")){ 
                System.out.println(x);
            }
        }
        System.out.println("List of students from ECONOMIC department:");
        for(Student x : arr){
            if(Student.this.department.equals("ECONOMIC")){ 
                System.out.println(x);
            }
        }
        System.out.println("List of students from DEPARTMENT OF BUSINESS AND FINANCE department:");
        for(Student x : arr){
            if(Student.this.department.equals("DEPARTMENT OF BUSINESS AND FINANCE")){ 
                System.out.println(x);
            }
        }
        System.out.println("List of students from ELECTRIC MACHINE INDUSTRY department:");
        for(Student x : arr){
            if(Student.this.department.equals("ELECTRIC MACHINE INDUSTRY")){
                System.out.println(x);
            }
        }
        System.out.println("List of students from PHYSICO-TECHNICAL department:");
        for(Student x : arr){
            if(Student.this.department.equals("PHYSICO-TECHNICAL")){
                System.out.println(x);
            }
        }
        System.out.println("List of students from TECHNOLOGY OF ORGANIC SUBSTANCES department:");
        for(Student x : arr){
            if(Student.this.department.equals("TECHNOLOGY OF ORGANIC SUBSTANCES")){
                System.out.println(x);
            }
        }
        System.out.println("List of students from INTEGRAL TECHNOLOGY AND APPLIED CHEMISTRY department:");
        for(Student x : arr){
            if(Student.this.department.equals("INTEGRAL TECHNOLOGY AND APPLIED CHEMISTRY")){
                System.out.println(x);
            }
        }
    }    
    
    public void listOfStudentsOfAllTheYearsOfStudy(Student arr[]){
        System.out.println("The first year of study:");
        for(Student x : arr){
            if(Student.this.yearOfStudy == 1) // нужно проверить строки на совпадение
                System.out.println(x);// если стрки совадают, то печатаем студента    
        }
        System.out.println("The second year of study:");
        for(Student x : arr){
            if(Student.this.yearOfStudy == 2) // нужно проверить строки на совпадение
                System.out.println(x);// если стрки совадают, то печатаем студента    
        }
        System.out.println("The third year of study:");
        for(Student x : arr){
            if(Student.this.yearOfStudy == 3) // нужно проверить строки на совпадение
                System.out.println(x);// если стрки совадают, то печатаем студента    
        }
        System.out.println("The fourth year of study:");
        for(Student x : arr){
            if(Student.this.yearOfStudy == 4) // нужно проверить строки на совпадение
                System.out.println(x);// если стрки совадают, то печатаем студента    
        }
        System.out.println("The fifth year of study:");
        for(Student x : arr){
            if(Student.this.yearOfStudy == 5) // нужно проверить строки на совпадение
                System.out.println(x);// если стрки совадают, то печатаем студента    
        }
        System.out.println("The sixth year of study:");
        for(Student x : arr){
            if(Student.this.yearOfStudy == 6) // нужно проверить строки на совпадение
                System.out.println(x);// если стрки совадают, то печатаем студента    
        }
    }
    
    public void listOfStudentsAfterDateOfBirth(Student arr[], String theDate) throws ParseException{
        Date d = new SimpleDateFormat("dd.mm.yyyy").parse(theDate);
        for(Student x : arr){
            if(new SimpleDateFormat("dd.mm.yyyy").parse(Student.this.dateOfBirthStudent).after(d) )
                System.out.println(x);
        }
    }
    
     public void listOfStudentsOfChosenGroup(Student arr[], String groupN){
        for(Student x : arr){
            if(Student.this.groupNumber.equals(groupN))
                System.out.println(x);
        }   
    }
}
