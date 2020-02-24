/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Schedule;

import Business.Airliner.Airliner;
import Business.Airliner.Airplane;
import Business.Customer.Seat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author dell
 */
public class Flight {

    private String FlightNum;
    private Date date;
    private String departure;
    private String destination;
    private String time;
    private Airplane airplane;
    private Airliner airliner;

    public Airliner getAirliner() {
        return airliner;
    }

    public void setAirliner(Airliner airliner) {
        this.airliner = airliner;
    }
  
    private ArrayList<Seat> seatList;
    
    public Flight(){
           seatList = new ArrayList<>();
           addSeat();
      }
    
    

    public ArrayList<Seat> getSeatList() {
        return seatList;
    }

    public void setSeatList(ArrayList<Seat> seatList) {
        this.seatList = seatList;
    }
    private void addSeat(){
           for(int i = 0; i < 150; i++){
               
               if(i >= 0 && i <= 24){
                    Seat seat  = new Seat("A", (i+1), false);
                    seatList.add(seat);
                    
               }else if(i>= 25 && i <= 49){
                    Seat seat  = new Seat("B", (i-24), false);
                    seatList.add(seat);
               
               }else if(i>= 50 && i <= 74){
                    Seat seat  = new Seat("C", (i-49), false);
                    seatList.add(seat);
               
               }else if(i>= 75 && i <= 99){
                    Seat seat  = new Seat("D", (i-74), false);
                    seatList.add(seat);
               
               }else if(i>= 100 && i <= 124){
                    Seat seat  = new Seat("E", (i-99), false);
                    seatList.add(seat);
                    
               }else {
                    Seat seat  = new Seat("F", (i-124), false);
                    seatList.add(seat);
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
        return this.getFlightNum();
    }

}
