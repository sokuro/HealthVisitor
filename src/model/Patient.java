package model;

/**
 * Created by Kajo on 4/22/2016.
 */
public class Patient extends Person {

    // instance variables
    private int patientNumber;
    private String securityValue;

    // inherited name, firstname
    public Patient(String aName, String aFirstname){
        super(aName, aFirstname);
    }

    // inherited second constructor
    public Patient(int aPatNumber, String aName, String aFirstName, String aStreet, String aCity, int aBirthYear, String aSecValue){
        super(aName, aFirstName, aStreet, aCity, aBirthYear);
        this.patientNumber = aPatNumber;
        this.securityValue = aSecValue;
    }

    public int getPatientNumber() {
        return patientNumber;
    }

    public void setPatientNumber(int aPatientNumber) {
        this.patientNumber = aPatientNumber;
    }

    public String getSecurityValue() {
        return securityValue;
    }

    public void setSecurityValue(String aSecurityValue) {
        this.securityValue = aSecurityValue;
    }

}
