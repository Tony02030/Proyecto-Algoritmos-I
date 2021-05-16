/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Date;

/**
 *
 * @author User
 */
public class Student {
    private int id;
    private String studentID;
    private String lastname;
    private String firstname;
    private Date birthday;
    private String phoneNumber;
    private String email;
    private String address;
    private int careerID;

    public Student(int id, String studentID, String lastname, String firstname, Date birthday, String phoneNumber, String email, String address, int careerID) {
        this.id = id;
        this.studentID = studentID;
        this.lastname = lastname;
        this.firstname = firstname;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.careerID = careerID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCareerID() {
        return careerID;
    }

    public void setCareerID(int careerID) {
        this.careerID = careerID;
    }
    
     public int getAge() {
        if(birthday.getMonth()<=05){
            return 2021 - (birthday.getYear() + 1900);
        }
        return (2020 - (birthday.getYear() + 1900));
    }
    //Para refencia en como guardar la fecha en String 
     
//     @Override
//    public String toString() {
//        return "(ID)" + id + "/(Name)" + lastName + ", " + firstName
//                + "/(Birthday)" + util.Utility.dateFormat(birthday) + "/(Title)" + title
//                + "/(Age)" + getAge();
//    }
}
