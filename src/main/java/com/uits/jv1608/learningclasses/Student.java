/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uits.jv1608.learningclasses;

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
        name = s.names[((int)(Math.random()*10))];
        patronymic = s.patronymics[((int)(Math.random()*10))];
        dateOfBirthStudent = s.dateOfBirth[((int)(Math.random()*10))];
        address = s.addresses[((int)(Math.random()*10))];
        phoneNumber = s.phoneNumbers[((int)(Math.random()*10))];
        department = s.departments[((int)(Math.random()*10))];
        yearOfStudy = s.yearOfStudyN[((int)(Math.random()*10))];
        groupNumber = s.groupNumbers[((int)(Math.random()*10))];    
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
}