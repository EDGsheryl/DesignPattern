package Singleton;

public class Triple {
    private static Triple[] instance = new Triple[]{new Triple(), new Triple(), new Triple()};

    private Triple() {

    }

    public static Triple getInstance(int id) {
        return instance[id];
    }
}
