interface Selector{
    boolean end();
    Object current();
    void next();
}

public class Sequence {
    private Object[] items;
    private int next = 0;
    public Sequence(int size){items = new Object[size];}

    public void add(Object x){
        if ( next < items.length)
            items[next++] = x;
    }

    private class SequenceSelector implements Selector{
        private int i = 0;
        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if (i < items.length) i++;
        }
    }

    public Selector selector(){
        return new SequenceSelector();
    }

    static public void main(String... args){
        Sequence sequence = new Sequence(12);
        for (int i = 0; i < 10; ++i)
            sequence.add(Integer.toString(i));
        sequence.add(new A("String #1"));
        sequence.add(new A("String #2"));
        Selector selector = sequence.selector();
        while(!selector.end()){
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}
