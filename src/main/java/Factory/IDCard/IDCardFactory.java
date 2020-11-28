package Factory.IDCard;

import Factory.framework.Factory;
import Factory.framework.Product;

import java.util.ArrayList;

public class IDCardFactory extends Factory {
    private ArrayList<String> owners = new ArrayList<>();

    @Override
    public Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    public void registerProduct(Product p) {
        this.owners.add(((IDCard) p).getOwner());
    }

    public ArrayList<String> getOwners() {
        return owners;
    }
}
