package Prototype;

public class UnderLinePen extends Product {
    private char ulchar;

    public UnderLinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    @Override
    public void use(String s) {
        System.out.println(" " + s);

        for (int i = 0; i < s.length() + 2; i++) {
            System.out.print(ulchar);
        }
        System.out.println();
    }
}
