package com.example.energyadvisors;


import com.backendless.Backendless;



public class Contacts {
    private String Area_Of_Specialty;
    private String Bio;
    private int Business;
    private int Consumer;
    private String Email;
    private String First_Name;
    private String Last_Name;
    private String Phone_Number;
    private double Rating;
    private String ObjectId;

    public Contacts(String first, String last, String email, int Business, int Consumer, String num, String Area) {
        First_Name = first;
        Last_Name = last;
        Email = email;
        this.Business = Business;
        this.Consumer = Consumer;
        Phone_Number = num;
        Area_Of_Specialty = Area;
    }


    // Getters
    public String getArea_Of_Specialty() {
        return Area_Of_Specialty;
    }

    public String getBio() {
        return Bio;
    }

    public String getEmail() {
        return Email;
    }
    public String getFirst_Name() {
        return First_Name;
    }
    public String getLast_Name() {
        return Last_Name;
    }
    public String getPhone_Number() {
        return Phone_Number;
    }
    public String getObjectId() {
        return ObjectId;
    }
    public int getBusiness() {
        return Business;
    }
    public int getConsumer() {
        return Consumer;
    }
    public double getRating() {
        return Rating;
    }




}

