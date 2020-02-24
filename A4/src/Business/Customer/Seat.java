/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

/**
 *
 * @author apple
 */
public class Seat {
   private String seatLocation;
   private int seatNumber;
   private boolean assigned;
   
   public Seat(){
   }
   
   public Seat(String seatLocation, int seatNumber, boolean assigned ){
        this.seatLocation = seatLocation;
        this.seatNumber = seatNumber;
        this.assigned = assigned;
   }
   
    public String getSeatLocation() {
        return seatLocation;
    }

    public void setSeatLocation(String seatLocation) {
        this.seatLocation = seatLocation;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }
    
   @Override
    public String toString(){
         return getSeatNumber() + getSeatLocation();
    }
    
}
