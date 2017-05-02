package com.example.android.notester;

/**
 * Created by Mayank on 4/6/2017.
 */

public class Note
{
    private String name;
    private String rollnumber;
    private String branch;
    private String contact;
    private String address;
    private String dob;
    private String YOE;
    private String degree;

    public Note(String name, String rollnumber, String branch, String contact, String address, String dob, String degree, String YOE)
    {
        this.name = name;
        this.rollnumber = rollnumber;
        this.branch = branch;
        this.contact = contact;
        this.address = address;
        this.dob = dob;
        this.degree = degree;
        this.YOE= YOE;
    }
    public String getName()
    {
        return this.name;
    }
    public String getRollNumber()
    {
        return this.rollnumber;
    }
    public String getBranch() {return this.branch;}
    public String getContact(){return this.contact;}
    public String getAddress(){return this.address;}
    public String getDob(){return this.dob;}
    public String getYOE(){return this.YOE;}
    public String getDegree(){return this.degree;}

    public void setName(String name)
    {
        this.name = name;
    }
    public void setRollNumber(String roll)
    {
        this.rollnumber = roll;
    }
    public void setBranch(String branch)
    {
        this.branch = branch;
    }
    public void setContact(String contact)
    {
        this.contact = contact;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
    public void setDob(String DOB)
    {
        this.dob = DOB;
    }
    public void setYOE(String yoe)
    {
        this.YOE = yoe;
    }
    public void setDegree(String degree)
    {
        this.degree = degree;
    }
}
