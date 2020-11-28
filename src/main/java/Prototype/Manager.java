package Prototype;

import java.util.HashMap;

public class Manager {
    private HashMap showname = new HashMap();

    public void register(String name, Product proto) {
        showname.put(name, proto);
    }

    public Product create(String protoname) {
        Product p = (Product) showname.get(protoname);
        return p.createClone();
    }
}
