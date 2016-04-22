package model;

/**
 * Created by Kajo on 4/22/2016.
 */
public class Person {

    // instance variables
    private String name;
    private String firstName;
    private String street;
    private String city;
    private int birthyear;

    // main constructor
    public Person(String aName, String aFirstName) {
        this.name = aName;
        this.firstName = aFirstName;
    }

    // additional constructor
    public Person(String aName, String aFirstName, String aStreet, String aCity, int aBirthYear){
        this.name = aName;
        this.firstName = aFirstName;
        this.street = aStreet;
        this.city = aCity;
        this.birthyear = aBirthYear;
    }

    public String getName(){
        return name;
    }
    public void setName(String aName){
        this.name = aName;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String aFirstName) {
        this.firstName = aFirstName;
    }

    public String getStreet() {
        return street;
    }
    public void setStreet(String aStreet) {
        this.street = aStreet;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String aCity) {
        this.city = aCity;
    }

    public int getBirthyear() {
        return birthyear;
    }
    public void setBirthyear(int aBirthYear) {
        this.birthyear = aBirthYear;
    }

}
