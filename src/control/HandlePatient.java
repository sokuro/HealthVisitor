package control;

import model.Patient;
import model.Person;

import java.util.ArrayList;

/**
 * Created by Kajo on 4/22/2016.
 */
public class HandlePatient {

    ArrayList<Patient> patientList = new ArrayList<Patient>();

    // add new patient into the patient list
    public void addPatient(int aNumber, String aName, String aFirstName, String aStreet, String aCity,
                           int aBirthYear, String aNote){
        Patient patient = new Patient(aNumber, aName, aFirstName, aStreet, aCity, aBirthYear, aNote);
        patientList.add(patient);
    }

    // get values
    public String getPatient(){
        String str = "";
        for (int i=0;i<patientList.size();i++) {
            str += this.patientList.get(i).getPatientNumber() + " | ";
            str += this.patientList.get(i).getName() + " | ";
            str += this.patientList.get(i).getFirstName() + " | ";
            str += this.patientList.get(i).getStreet() + " | ";
            str += this.patientList.get(i).getCity() + " | ";
            str += this.patientList.get(i).getBirthyear() + " | ";
            str += this.patientList.get(i).getSecurityValue() + "\n";
        }
        return str;
    }

    public String getElements(){
        String str = "";
//        for (int i: patientList) str += patientList.get(i);
        for (int i=0;i<patientList.size();i++) str += this.patientList.get(i).toString() + " ";
        return str;
    }
}
