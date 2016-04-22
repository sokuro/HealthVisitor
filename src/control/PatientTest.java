package control;

import model.Patient;

import java.util.ArrayList;

/**
 * Created by Kajo on 4/22/2016.
 */
public class PatientTest {

    public static void main(String[] args){

        HandlePatient patient = new HandlePatient();
        patient.addPatient(1, "Ugorcak", "Karol", "Rosenweg 21", "Bern", 1981, "calm");
        System.out.println(patient.getElements());
    }
}
