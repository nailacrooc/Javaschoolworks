import java.util.*;

public class Terminal {
    Scanner in = new Scanner(System.in);
    Schedule sched = new Schedule();
    boolean done = false;
    
    public Terminal(){
            
            //Declaration of slots. Important to be outside of loop
            sched.setAmSlot(10);
            sched.setPmSlot(10);
        do {
            //Instantiation of Ticket class
            Tickets tick = new Tickets();
            tick.setEcoCost(20);
            tick.setVipCost(100);
            int tickSelect = tick.selTicket();
        
            //Schedules
            String schedSelect = sched.pickSched();
            int ticketAmount = sched.ticketAmount();
            compSlot(schedSelect, ticketAmount);
        
            //Instantiation of Payment class
            Payment pay = new Payment();
            pay.printSum(tickSelect, schedSelect, ticketAmount);
            
            buyAgain();
        }while (!done);
        
    }
    
    //Computes the remaining slot
    public void compSlot(String schedSelect, int ticketAmount){
        if (schedSelect.equalsIgnoreCase("A")){
            sched.setAmSlot(sched.getAmSlot() - ticketAmount);
        }else if (schedSelect.equalsIgnoreCase("B")){
            sched.setPmSlot(sched.getPmSlot() - ticketAmount);
        }
    }
    
    //Reruns the program
    public void buyAgain(){
        System.out.println("Buy Again? (Y/N)");
        String choice = in.nextLine();
        if (choice.equalsIgnoreCase("Y")){
            done = false;
        }else if (choice.equalsIgnoreCase("N")){
            done = true;
            in.close();
        }
    }
}