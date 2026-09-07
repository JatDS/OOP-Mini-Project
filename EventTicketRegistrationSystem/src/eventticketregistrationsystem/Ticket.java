/*
This is the Ticket superclass for EarlyBirdTicket and VIPTicket
 */
package eventticketregistrationsystem;

/**

 */
public abstract class Ticket {
    protected String ticketId;
    protected String eventName;
    protected String attendeeName;
    protected double basePrice;
    
    public double calculateFinalPrice;
}
