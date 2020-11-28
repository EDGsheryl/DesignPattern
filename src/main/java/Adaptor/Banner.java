package Adaptor;

public class Banner {
    private String str;

    public Banner(String str) {
        this.str = str;
    }

    public void showWithParen() {
        System.out.printf("(%s)\n", this.str);
    }

    public void showWithAster() {
        System.out.printf("*%s*\n", this.str);
    }
}
