/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Airliner.Airliner;
import Business.Schedule.Flight;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author dell
 */
public class Customer {
    private String name;
    private String uniqID;
    private ArrayList<Ticket> ticketList;
    

    public Customer() {
        ticketList = new ArrayList<>();
        
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniqID() {
        return uniqID;
    }

    public void setUniqID(String uniqID) {
        this.uniqID = uniqID;
    }

    
    
    @Override
    public String toString() {
        return this.uniqID;
    }
    
    
  

    public ArrayList<Ticket> getTicketList() {
        return ticketList;
    }

    public void setTicketList(ArrayList<Ticket> ticketList) {
        this.ticketList = ticketList;
    }
    
    public Ticket addTicket() {
        Ticket ticket = new Ticket();
        ticketList.add(ticket);
        return ticket;
    }
    
    public void deleteTicket(Ticket t){
        ticketList.remove(t);
        t.getSeat().setAssigned(false);
    }
    
    public void deleteAll(){
         for(Ticket t :ticketList){
             
             t.getSeat().setAssigned(false);
         }
         ticketList.clear();
    }
    
    public void deleteFlight(Flight f){
         Iterator<Ticket> iterator = ticketList.iterator();
         while (iterator.hasNext()) {
             Ticket t = iterator.next();
             if (t.getFlight() == f) {
              iterator.remove();
         }
       }
    }
    
    
    
}
