package com.projekt.rezt;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DatingProfile {

    @Id
    @GeneratedValue
    private Long id;

    private int age;
    private String userName;
    private int length;
    private String info;
    private double gamingHoursPerWeek;
    private int energyDrinksConsumedPerWeek;
    private String city;
    private int happiness;
    private boolean rager;

    public DatingProfile() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public double getGamingHoursPerWeek() {
        return gamingHoursPerWeek;
    }

    public void setGamingHoursPerWeek(double gamingHoursPerWeek) {
        this.gamingHoursPerWeek = gamingHoursPerWeek;
    }

    public int getEnergyDrinksConsumedPerWeek() {
        return energyDrinksConsumedPerWeek;
    }

    public void setEnergyDrinksConsumedPerWeek(int energyDrinksConsumedPerWeek) {
        this.energyDrinksConsumedPerWeek = energyDrinksConsumedPerWeek;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public boolean isRager() {
        return rager;
    }

    public void setRager(boolean rager) {
        this.rager = rager;
    }

    /*- DatingProfile (image?, age, userName, length, weight, info, city, salary, totalSavings, happiness)
- DatingProfileRepository (Interface)
- DatingProfileController*/
}
