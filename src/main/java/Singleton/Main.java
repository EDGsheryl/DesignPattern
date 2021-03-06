package Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        System.out.println(obj1 == obj2);

        System.out.println(TicketMaker.getInstance().getNextTicketNumber());
        System.out.println(TicketMaker.getInstance().getNextTicketNumber());
        System.out.println(TicketMaker.getInstance().getNextTicketNumber());

        System.out.println(Triple.getInstance(0));
        System.out.println(Triple.getInstance(1));
        System.out.println(Triple.getInstance(2));
    }
}
