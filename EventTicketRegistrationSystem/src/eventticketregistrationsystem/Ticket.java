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
    
    public Ticket(String ticketId, String eventName, String attendeeName, double basePrice){
        setTicketId(ticketId);
        setEventName(eventName);
        setAttendeeName(attendeeName);
        setBasePrice(basePrice);
    }
    public void setTicketId(String ticketId){
        this.ticketId=ticketId;
    }
    
    public String getTicketId() {
    return ticketId;
    }
    
    public void setEventName(String eventName){
        this.eventName=eventName;
    }
    
    public String getEventName() {
    return eventName;
    }
    
    public void setAttendeeName(String attendeeName){
        this.attendeeName=attendeeName;
    }
    
    public String getAttendeeName() {
    return attendeeName;
    }
    
    public void setBasePrice(double basePrice){
        this.basePrice=basePrice;
    }
    
    public double getBasePrice() {
    return basePrice;
    }
    public abstract double calculateFinalPrice();
}
