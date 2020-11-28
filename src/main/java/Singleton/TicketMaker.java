package Singleton;

public class TicketMaker {
    private static TicketMaker singleton = new TicketMaker();
    private static int tickNumber;

    private TicketMaker() {
        tickNumber = 1000;
    }

    public static TicketMaker getInstance(){
        return singleton;
    }

    public synchronized int getNextTicketNumber() {
        return tickNumber++;
    }
}
