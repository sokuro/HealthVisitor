package control;

import model.Patient;
import model.Person;

import java.util.ArrayList;

/**
 * Created by Kajo on 4/22/2016.
 */
public class HandlePatient {

    ArrayList<Person> patientList = new ArrayList<Person>();

    // add new patient into the patient list
    public void addPatient(int aNumber, String aName, String aFirstName, String aStreet, String aCity,
                           int aBirthYear, String aNote){
        Patient patient = new Patient(aNumber, aName, aFirstName, aStreet, aCity, aBirthYear, aNote);
        patientList.add(patient);
    }

    public String getElements(){
        String str = "";
//        for (int i: patientList) str += patientList.get(i);
        for (int i=0;i<patientList.size();i++) str += patientList.get(i) + "";
        return str;
    }
}
