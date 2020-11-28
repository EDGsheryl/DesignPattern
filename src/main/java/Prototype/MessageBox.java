package Prototype;

public class MessageBox extends Product {
    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String s) {
        for (int i = 0; i < s.length() + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println();

        System.out.print(decochar);
        System.out.print(" " + s + " ");
        System.out.println(decochar);


        for (int i = 0; i < s.length() + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println();
    }
}
