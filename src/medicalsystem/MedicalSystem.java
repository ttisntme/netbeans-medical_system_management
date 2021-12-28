/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalsystem;

/**
 *
 * @author TT
 */
public class MedicalSystem {

    public PatientDirectory patientDirectory;
    public PersonDirectory persionDirectory;
    public City city;

    public MedicalSystem() {
        this.patientDirectory = new PatientDirectory();
        this.persionDirectory = new PersonDirectory();
        this.city = new City();
    }
    
    
    
}
