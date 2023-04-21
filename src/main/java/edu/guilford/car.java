package edu.guilford;

import java.time.Year;
import java.util.Random;

public class car {
Random rand = new Random();
//attributes
private String make;
private String model;
private int year;
private double price;
private String color;
private String vin;
private String licensePlate;
private String owner;
private String ownerAddress;
private String ownerPhone;
private String ownerEmail;

//constructor
public car(String make, String model, int year, double price, String color, String vin, String licensePlate, String owner, String ownerAddress, String ownerPhone, String ownerEmail) {
    this.make = make;
    this.model = model;
    this.year = year;
    this.price = price;
    this.color = color;
    this.vin = vin;
    this.licensePlate = licensePlate;
    this.owner = owner;
    this.ownerAddress = ownerAddress;
    this.ownerPhone = ownerPhone;
    this.ownerEmail = ownerEmail;

}
//default constructor
public car() {
    this.make = "Ford";
    this.model = "Mustang";
    this.year = rand.nextInt(1990,2023);
    this.price = rand.nextDouble(1000.00, 60000.00);
    this.color = "Red";
    this.vin = "1FABP40E7KF123456";
    this.licensePlate = "ABC123";
    this.owner = "John Doe";
    this.ownerAddress = "123 Main St";
    this.ownerPhone = "336-555-1234"; }
    
   //toString
    public String toString() {
        return "Make: " + make + " Model: " + model + " Year: " + year + " Price: " + price + " Color: " + color + " VIN: " + vin + " License Plate: " + licensePlate + " Owner: " + owner + " Owner Address: " + ownerAddress + " Owner Phone: " + ownerPhone + " Owner Email: " + ownerEmail;
    }

    //methods
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model; 
    }
    public int getYear() {
        return year;
    }
    //setters
    public void setYear(int year) {
        this.year = year;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public char[] getVin() {
        return null;
    }
    //randomly generated make, model, year, price, color, vin, licensePlate;
  /*  public void setVin(String vin) {
        this.vin = vin;
    }
    public String getLicensePlate() {
        return licensePlate;
    }
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner= owner;
    }
    public String getOwnerAddress() {
        return ownerAddress;
    }
    public void setOwnerAddress(String ownerAddress) {
        this.ownerAddress = ownerAddress;
    }
    public String getOwnerPhone() {
        return ownerPhone;
    }
    public void setOwnerPhone(String ownerPhone) {
        this.ownerPhone = ownerPhone;
    }
    public String getOwnerEmail() {
        return ownerEmail;
    }
    public void setOwnerEmail(String ownerEmail) {
        this.ownerEmail = ownerEmail;
    }*/

}
