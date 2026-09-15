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
    public int getHowEarly() {
        return howEarly;
    }

    public void setHowEarly(int howEarly) {
        if (howEarly < 0) {
            throw new IllegalArgumentException("Days bought in advance (howEarly) cannot be negative.");
        }
        this.howEarly = howEarly;
    }
    public double calculateFinalPrice(){
    return basePrice * (1-(0.5*Math.min(howEarly, 10)/10));//Math.min is for capping howEarly to 10 during calculation
    }
    
    
    
    
}
