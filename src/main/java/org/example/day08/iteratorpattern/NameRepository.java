package org.example.day08.iteratorpattern;

/**
 * @author Fickler
 * @date 2024/4/24 9:36
 */
public class NameRepository implements Container{
    public String[] names = {"Robert" , "John" ,"Julie" , "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            if (index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index ++ ];
            }
            return null;
        }
    }
}
