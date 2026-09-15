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
        public String getTicketId() {
            return (ticketId != null) ? ticketId.toUpperCase() : "";
        }

        public void setTicketId(String ticketId) {
            if (ticketId == null || ticketId.trim().isEmpty()) {
            throw new IllegalArgumentException("Ticket ID cannot be empty.");
        }

        String trimmed = ticketId.trim();

        // Right-pad short alphanumeric IDs with spaces or trailing zeros without parsing to int
        if (trimmed.length() < 5) {
            trimmed = String.format("%-5s", trimmed).replace(' ', '0'); // e.g., "A1" -> "A1000"
        }

        if (trimmed.length() > 5) {
            throw new IllegalArgumentException("Ticket ID must be exactly 5 characters long.");
        }

        this.ticketId = trimmed;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        if (eventName == null || eventName.trim().isEmpty()) {
            throw new IllegalArgumentException("Event name cannot be empty.");
        }
        this.eventName = eventName.trim();
    }

    public String getAttendeeName() {
        return attendeeName;
    }

    public void setAttendeeName(String attendeeName) {
        if (attendeeName == null || attendeeName.trim().isEmpty()) {
            throw new IllegalArgumentException("Attendee name cannot be empty.");
        }
        this.attendeeName = attendeeName.trim();
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        if (basePrice < 0) {
            throw new IllegalArgumentException("Base price cannot be negative.");
        }
        this.basePrice = basePrice;
    }
    public abstract double calculateFinalPrice();
}
