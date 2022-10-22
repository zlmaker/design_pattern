package iterator;

import java.util.List;

public class IteratorImpl<E> implements Iterator<E> {
    private List<E> list;
    private int position;

    public IteratorImpl(List<E> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public E next() {
        return list.get(position++);
    }
}
