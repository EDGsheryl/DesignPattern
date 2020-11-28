package Factory;

import Factory.IDCard.IDCardFactory;
import Factory.framework.Factory;
import Factory.framework.Product;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("1");
        Product card2 = factory.create("2");
        Product card3 = factory.create("3");

        card1.use();
        card2.use();
        card3.use();
    }
}
