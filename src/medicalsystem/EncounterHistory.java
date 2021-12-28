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
public class EncounterHistory {
    
    private HashMap<Integer, Encounter> encounterMap;

    public EncounterHistory() {
        this.encounterMap = new HashMap<Integer, Encounter>();
    }
    
    public void addEncounter(Encounter encounter) {
        encounterMap.put(encounter.getId(), encounter);
    }
    public void addEncounter(int highPressure, int lowPressure, int encounterId, int doctorId) {
        VitalSign vitalSign = new VitalSign(highPressure, lowPressure);
        Encounter encounter = new Encounter(encounterId, vitalSign, doctorId);
        encounterMap.put(encounter.getId(), encounter);
    }
    public void updateEncounter(Encounter encounter) {
        encounterMap.remove(encounter.getId());
        encounterMap.put(encounter.getId(), encounter);
    }
    public void deleteEncounter(Encounter encounter) {
        encounterMap.remove(encounter.getId(), encounter);
    }

    public HashMap<Integer, Encounter> getEncounterMap() {
        return encounterMap;
    }

    public void setEncounterMap(HashMap<Integer, Encounter> encounterHistory) {
        this.encounterMap = encounterHistory;
    }
    
    
    
            
}
