package com.codingdojo.phoneassignment;
import java.util.ArrayList;

public abstract class Phone implements Ringable{
    public int number;
    public int batteryPercentage;
    public String carrier;
    public boolean hasCamera;
    public String Owner;
    public ArrayList<Integer> contacts;
    
    public void call(Phone phone) { // 1st phone is our phone. 2nd phone is who we are calling // 
    	System.out.println("Riiinnnggg");
    	phone.ring(this);
    }
}