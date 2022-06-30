public class Schedule extends Tickets{
    
    public String schedSelect;
    public int ticketAmount;
    public int ticketType = this.ticketType;
    private int amSlot = 10;
    private int pmSlot = 10;
    
    public int getAmSlot(){
        return amSlot;
    }
    
    public void setAmSlot(int amSlot){
        this.amSlot = amSlot;
    }
    
    public int getPmSlot(){
        return pmSlot;
    }
    
    public void setPmSlot(int pmSlot){
        this.pmSlot = pmSlot;
    }
    
    public String pickSched(){
       System.out.println("Pick a schedule: ");
       System.out.println("A. 9AM (" + getAmSlot() + " slots available)");
       System.out.println("B. 1PM  (" + getPmSlot() + " slots available)");
       schedSelect = in.next();
       return schedSelect;
    }
    
    public int ticketAmount(){
        System.out.println("Number of tickets to buy: ");
        ticketAmount = in.nextInt();
        if (schedSelect.equalsIgnoreCase("A")){
            AMslotChecker(ticketAmount);
        }else if (schedSelect.equalsIgnoreCase("B")){
            PMslotChecker(ticketAmount);
        }
        return ticketAmount;
    }
    
    //Checks if there's still a slot available in AM
    public int AMslotChecker(int ticketAmount){
        if (getAmSlot() < ticketAmount){
            System.out.println("**No more available slot**");
            System.exit(0);//Kicks the user out of the ticket booth.
        }else if (getAmSlot() >= ticketAmount){
            return ticketAmount;
        }
        return 0;
    }
    
    //Checks if there's still a slot available in PM
    public int PMslotChecker(int ticketAmount){
        if (getPmSlot() < ticketAmount){
            System.out.println("**No more available slot**");
            return 0;
        }else if (getPmSlot() >= ticketAmount){
            return ticketAmount;
        }
        return 0;
    }
}