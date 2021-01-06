package Composite;

public class Main {
    public static void main(String[] args) {
        try {
            Directory rootDir = new Directory("root");

            Directory userDir = new Directory("usr");
            rootDir.add(userDir);

            Directory yuki = new Directory("yuki");
            userDir.add(yuki);

            File file = new File("Composite.java", 100);
            yuki.add(file);
            rootDir.printList();

            System.out.println();
            System.out.println("file = " + file.getFullName());     
            System.out.println("yuki = " + yuki.getFullName());     
        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }
    }
}
