package org.example.day06.iterator;

/**
 * @author Fickler
 * @date 2024/4/22 16:25
 */
public class FilmMenuIterator implements Iterator {
    MenuItem[] menuItems;
    int position = 0;

    public FilmMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position > menuItems.length - 1 || menuItems[position] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems[position];
        position ++ ;
        return menuItem;
    }
}
