/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;

/**
 *
 * @author dell
 */
public class Flights {

    private String FlightNum;
    private Date date;
    private String departure;
    private String destination;
    private String time;
    private Airplane airplane;
    private String seat[][];

    public Flights() {
        this.airplane = new Airplane();
        this.seat = new String[26][6];
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 6; j++) {
                seat[i][j] = "Unreserved";
            }
        }
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }

    public String[][] getSeat() {
        return seat;
    }

    public void setSeat(String[][] seat) {
        this.seat = seat;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getFlightNum() {
        return FlightNum;
    }

    public void setFlightNum(String FlightNum) {
        this.FlightNum = FlightNum;
    }

    @Override
    public String toString() {
        return this.getAirplane().getAirplaneNum();
    }

    public boolean filterSeat(int row, int column) {
        return (this.seat[row][column].equals("Unreserved"));
    }

    public void addReservation(int row, int column, String ID) {
        this.seat[row][column] = ID;
    }

    public void cancelReservation(int row, int column) {
        this.seat[row][column] = "Unreserved";
    }
}
