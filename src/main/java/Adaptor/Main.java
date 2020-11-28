package Adaptor;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Print pb = new PrintBanner("This is a Banner");
        pb.printWeak();
        pb.printStrong();

        FileIO f = new FileProperties();
        try {
            String path = Main.class.getResource("/").getPath() + "adaptor/";
            f.readFromFile(path + "file.txt");
            f.setValue("year", f.getValue("year"));
            f.setValue("month", "4");
            f.setValue("day", "21");
            f.writeToFile(path + "newfile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
