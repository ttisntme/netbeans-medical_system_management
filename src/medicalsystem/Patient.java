/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalsystem;

import java.util.HashMap;

/**
 *
 * @author TT
 */
public class Patient {
    
    
    private int id;
    private int age;
    private String firstName;
    private String lastName;
    private int residenceId;
    private int communityId;
    private EncounterHistory encounterHistory;

    public Patient(int id, int age, String firstName, String lastName, int residenceId, int communityId) {
        this.id = id;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.residenceId = residenceId;
        this.communityId = communityId;
        this.encounterHistory = new EncounterHistory();
    }

    public Patient(int id) {
        this.id = id;
        this.encounterHistory = new EncounterHistory();
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getResidenceId() {
        return residenceId;
    }

    public void setResidenceId(int residenceId) {
        this.residenceId = residenceId;
    }

    public int getCommunityId() {
        return communityId;
    }

    public void setCommunityId(int communityId) {
        this.communityId = communityId;
    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
    
    @Override
    public String toString(){
        return Integer.toString(id);
    
    }
    
    
    
            
            
}
