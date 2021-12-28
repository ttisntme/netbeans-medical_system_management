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
public class VitalSign {
    
    private int highPressure;
    private int lowPressure;

    public VitalSign(int highPressure, int lowPressure) {
        this.highPressure = highPressure;
        this.lowPressure = lowPressure;
    }
    
    public int getHighPressure() {
        return highPressure;
    }

    public void setHighPressure(int highPressure) {
        this.highPressure = highPressure;
    }

    public int getLowPressure() {
        return lowPressure;
    }

    public void setLowPressure(int lowPressure) {
        this.lowPressure = lowPressure;
    }
}
