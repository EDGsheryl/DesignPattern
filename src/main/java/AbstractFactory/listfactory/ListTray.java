package AbstractFactory.listfactory;

import AbstractFactory.factory.Item;
import AbstractFactory.factory.Tray;

public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    public String makeHTML() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("<li>\n");
        buffer.append(caption).append("\n");
        buffer.append("<ul>\n");
        for (Object o : tray) {
            Item item = (Item) o;
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("</li>\n");
        return buffer.toString();
    }
}
