package Factory.IDCard;

import Factory.framework.Product;

public class IDCard extends Product {
    private String owner;

    IDCard(String owner) {
        System.out.println("Construct IDCard for " + owner);
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("Use IDCard for " + owner);
    }

    public String getOwner() {
        return owner;
    }
}
