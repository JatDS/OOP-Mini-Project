/*
This Class is for creating VIPTicket objects, extending Ticket
 */
package eventticketregistrationsystem;

/**

 */
public class VIPTicket extends Ticket{
    private double backstagePassFee;
    private boolean parkingAccess;
    
    public VIPTicket(String ticketId, String eventName, String attendeeName, double basePrice,double backstagePassFee, boolean parkingAccess){
        super(ticketId, eventName, attendeeName, basePrice);
        setBackstagePassFee(backstagePassFee);
        setParkingAccess(parkingAccess);
    }
    public void setBackstagePassFee(double backstagePassFee){
        this.backstagePassFee=backstagePassFee;
    }
    public void setParkingAccess(boolean parkingAccess){
        this.parkingAccess=parkingAccess;
    }
    public double calculateFinalPrice(){
        if (parkingAccess){
            return basePrice + backstagePassFee + 20.00; /*Parking fee is RM 20*/
        }else if (!parkingAccess){
            return basePrice + backstagePassFee;
        }
        return 0.0;
    }
}
