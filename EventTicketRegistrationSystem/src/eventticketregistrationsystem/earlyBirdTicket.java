/*
This EarlyBirdTicket Class extends Ticket
 */
package eventticketregistrationsystem;

public class earlyBirdTicket extends Ticket{
    private int howEarly;/*Number of days of how early ticket is bought; must be between 1-10*/
    
    public earlyBirdTicket(String ticketId, String eventName, String attendeeName, double basePrice, int howEarly){
    super (ticketId,eventName,attendeeName,basePrice);
    setHowEarly(howEarly);
    }
    public void setHowEarly(int howEarly){
        this.howEarly=howEarly;
    }
    public double calculateFinalPrice(){
    return basePrice * (1+(0.5*howEarly/10));
    }
    
    
    
    
}
