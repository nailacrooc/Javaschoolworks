import java.util.*;
public class Tickets
{
    Scanner in = new Scanner(System.in);
    public int ticketType;
    private int ecoCost = 20;
    private int vipCost = 100;
    
    public int getEcoCost(){
        return ecoCost;
    }
    
    public void setEcoCost(int ecoCost){
        this.ecoCost = ecoCost;
    }
    
    public int getVipCost(){
        return vipCost;
    }
    
    public void setVipCost(int vipCost){
        this.vipCost = vipCost;
    }
    
    //Ticket Selection
    public int selTicket(){
       System.out.println("Select a ticket: ");
       System.out.println("1. Economy: $" + getEcoCost());
       System.out.println("2. VIP: $" + getVipCost());
       ticketType = in.nextInt();
       return ticketType;
    }
}