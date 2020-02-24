/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Airliner;
import java.util.ArrayList;
/**
 *
 * @author dell
 */
public class Airliner {
    private String name;
    private ArrayList<Airplane> airplanesDir;
    
    public Airliner() {
        this.airplanesDir = new ArrayList<>();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public ArrayList<Airplane> getAirplanesDir() {
        return airplanesDir;
    }

    public void setAirplanesDir(ArrayList<Airplane> airplanes) {
        this.airplanesDir = airplanes;
    }

    
    @Override
    public String toString() {
        return this.getName();
    }
    
    public Airplane addAirplane() {
        Airplane newAirplane = new Airplane();
        airplanesDir.add(newAirplane);
        return newAirplane;
    }
    
    public void deleteAirplane() {
        this.airplanesDir = new ArrayList<>();
    }
}
