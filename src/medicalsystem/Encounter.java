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
public class Encounter {
    
    private int id;
    private VitalSign vitalSign;
    private int doctorId;

    public Encounter(int id, VitalSign vitalSign, int doctorId) {
        this.doctorId = doctorId;
        this.vitalSign = vitalSign;
        this.id = id;
    }

    public Encounter(int id) {
        this.id = id;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public VitalSign getVitalSign() {
        return vitalSign;
    }

    public void setVitalSign(VitalSign vitalSign) {
        this.vitalSign = vitalSign;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }
    
    @Override
    public String toString(){
        return Integer.toString(id);
    
    }
}
