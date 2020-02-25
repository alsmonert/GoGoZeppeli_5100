/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author dell
 */
public class FlightSchedule {

    private ArrayList<Flights> flightDir;

    public FlightSchedule() {
        this.flightDir = new ArrayList<>();
    }

    public ArrayList<Flights> getFlightDir() {
        return flightDir;
    }

    public void setFlightDir(ArrayList<Flights> flightDir) {
        this.flightDir = flightDir;
    }

    public Flights addFlight() {
        Flights newFlight = new Flights();
        flightDir.add(newFlight);
        return newFlight;
    }

    private int size() {
        return flightDir.size();
    }

    private void add(Flights f) {
        flightDir.add(f);
    }

    public void deleteFlight(Flights f) {
        flightDir.remove(f);
    }

    public FlightSchedule filterAirliner(String name) {
        FlightSchedule result = new FlightSchedule();
        for (Flights f : this.flightDir) {
            if (f.getAirplane().getAirlinerName().equalsIgnoreCase(name)) {
                result.add(f);
            }
        }
        if (result.size() == 0) {
            result = null;
        }
        return result;
    }

    public FlightSchedule filterAirplane(String number) {
        FlightSchedule result = new FlightSchedule();
        for (Flights f : this.flightDir) {
            if (f.getAirplane().getAirplaneNum().equals(number)) {
                result.add(f);
            }
        }
        if (result.size() == 0) {
            result = null;
        }
        return result;
    }

    public FlightSchedule filterDate(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        FlightSchedule result = new FlightSchedule();
        for (Flights f : this.flightDir) {
            if (sdf.format(f.getDate()).equals(date)) {
                result.add(f);
            }
        }
        if (result.size() == 0) {
            result = null;
        }
        return result;
    }

    public FlightSchedule filterDeparture(String departure) {
        FlightSchedule result = new FlightSchedule();
        for (Flights f : this.flightDir) {
            if (f.getDeparture().equals(departure)) {
                result.add(f);
            }
        }
        if (result.size() == 0) {
            result = null;
        }
        return result;
    }

    public FlightSchedule filterDestination(String destination) {
        FlightSchedule result = new FlightSchedule();
        for (Flights f : this.flightDir) {
            if (f.getDestination().equals(destination)) {
                result.add(f);
            }
        }
        if (result.size() == 0) {
            result = null;
        }
        return result;
    }

    public FlightSchedule filterTime(String time) {
        FlightSchedule result = new FlightSchedule();
        for (Flights f : this.flightDir) {
            if (f.getTime().equals(time)) {
                result.add(f);
            }
        }
        if (result.size() == 0) {
            result = null;
        }
        return result;
    }
}
