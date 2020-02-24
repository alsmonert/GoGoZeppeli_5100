/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Customer.CustomerDirectory;
import Business.Customer.TicketHistory;
import Business.Schedule.FlightSchedule;


/**
 *
 * @author apple
 */
public class TravelOffice {
     private CustomerDirectory customerDirectory;
     
     private FlightSchedule flightSchedule;

     private TicketHistory ticketHistory;
     
     public TravelOffice(){
         customerDirectory = new CustomerDirectory();
         //masterFlightSchedule = new MasterFlightSchedule();
         ticketHistory = new TicketHistory();
     }
     
    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public FlightSchedule getFlightSchedule() {
        return flightSchedule;
    }

    public void setFlightSchedule(FlightSchedule masterFlightSchedule) {
        this.flightSchedule = masterFlightSchedule;
    }

    public TicketHistory getTicketHistory() {
        return ticketHistory;
    }

    public void setTicketHistory(TicketHistory ticketHistory) {
        this.ticketHistory = ticketHistory;
    }
     
     
}
