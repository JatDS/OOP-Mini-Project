/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventticketregistrationsystem;

public class earlyBirdTicket extends Ticket{
    private double discount;
    
    public earlyBirdTicket(){
    super (ticketId,eventName,attendeeName,basePrice);
     double discount = 0.2;
      }
    @Override
    public double calculateFinalPrice(){
     return basePrice * discount; }
    
    
    
    
}
