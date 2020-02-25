/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import java.util.ArrayList;
/**
 *
 * @author dell
 */
public class Airliner {
    private String name;
    private String address;
    private int totalFlightsPerDay;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Airplane> getAirplanesDir() {
        return airplanesDir;
    }

    public void setAirplanesDir(ArrayList<Airplane> airplanes) {
        this.airplanesDir = airplanes;
    }

    public int getTotalFlightsPerDay() {
        return totalFlightsPerDay;
    }

    public void setTotalFlightsPerDay(int totalFlightsPerDay) {
        this.totalFlightsPerDay = totalFlightsPerDay;
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
