package Bridge;

public class FileDisplayImpl extends DisplayImpl {
    @Override
    public void rawOpen() {
        System.out.println("open file.");
    }

    @Override
    public void rawPrint() {
        System.out.println("print file.");
    }

    @Override
    public void rawClose() {
        System.out.println("close file.");
    }
}
