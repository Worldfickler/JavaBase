package org.example.day06.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Fickler
 * @date 2024/4/22 16:56
 */
public class TVChannelMenu implements TelevisionMenu {

    List<MenuItem> menuItems;

    public TVChannelMenu(){
        menuItems = new ArrayList<MenuItem>();
        addItem(1, "CCTV-1", "This is CCTV-1");
        addItem(2, "CCTV-2", "This is CCTV-2");
        addItem(3, "CCTV-3", "This is CCTV-3");
        addItem(4, "CCTV-4", "This is CCTV-4");
        addItem(5, "CCTV-5", "This is CCTV-5");
    }

    @Override
    public void addItem(int channel, String name, String description) {
        MenuItem menuItem = new MenuItem(name, description, channel);
        menuItems.add(menuItem);
    }

    @Override
    public Iterator createIterator() {
        return new TVChanneMenuIterator(menuItems);
    }
}
