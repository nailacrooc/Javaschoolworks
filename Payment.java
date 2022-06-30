import java.util.*;

public class Payment{
    Scanner in = new Scanner (System.in);
    TestClass term = new TestClass();
    Schedule sched = new Schedule();
    int result;
    int money;
    
    public void printSum(int ticketType, String schedSelect, int ticketAmount){
        System.out.println("Summary: ");
        checkTick(ticketType);
        checkSched(schedSelect);
        System.out.println("Number of Tickets: " + ticketAmount);
        computePay(ticketType, ticketAmount);
    }
    
    //Computes how much you will pay
    public void computePay(int ticketType, int ticketAmount){
        boolean done = false;
        
        if (ticketType == 1){
            result = 20 * ticketAmount;
        }else if (ticketType == 2){
            result = 100 * ticketAmount;
        }
        System.out.println("Amount to pay: $" + result);
        
        //Checks if money is sufficient
        do{
            System.out.println("Enter payment: ");
            money = in.nextInt();
            if (money >= result){
                int currentBal = money - result;
                System.out.println("**Transcation was successful, your change is $" + currentBal + "**");
                done = true;
            }else if (money <= result){
                System.out.println("**Transcation was unsuccessful, please enter enough money**");
                done = false;
            }
        } while (!done);
    }

    //Checks the type of ticket
    public void checkTick(int ticketType){
        if (ticketType == 1){
            System.out.println("Ticket Type: Economy");
        }else if (ticketType == 2){
            System.out.println("Ticket Type: VIP");
        }
    }
    
    //Checks the schedule if am or pm
    public void checkSched(String schedSelect){
        if (schedSelect.equalsIgnoreCase("A")){
            System.out.println("Schedule: 9 AM");
        }else if (schedSelect.equalsIgnoreCase("B")){
            System.out.println("Schedule: 1 PM");
        }
    }
    
}