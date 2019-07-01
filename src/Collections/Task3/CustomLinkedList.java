package Collections.Task3;

import java.util.Iterator;

public class CustomLinkedList implements Iterable<Integer> {
    private static class Var {

        int value;
        Var next;
    }

    Var begin;

    public void add(int value) {
        Var nods = new Var();
        nods.value = value;
        nods.next = null;

        if (begin == null) {
            begin = nods;
        } else {
            Var el = begin;
            while (el.next != null) {
                el = el.next;
            }
            el.next = nods;
        }
    }

    public void delete(int i) {
        if (i == 0) {
            begin = begin.next;
        } else {
            Var el = begin;
            Var elem = null;
            for (int j = 0; i < i - 1; j++) {
                el = elem.next;
            }
            elem = el.next;
            el.next = elem.next;
        }
    }

    public Var reverse(Var currentElement) {
        Var prev = null;
        Var next = null;
        while (currentElement != null) {
            next = currentElement.next;
            currentElement.next = prev;
            prev = currentElement;
            currentElement = next;
        }
        return prev;
    }

    private class ListIterator implements Iterator<Integer> {

        private Var currentVariable;

        private ListIterator(Var startPosition) {
            currentVariable = startPosition;
        }

        @Override
        public boolean hasNext() {
            return currentVariable != null;
        }

        @Override
        public Integer next() {
            int value = currentVariable.value;
            currentVariable = currentVariable.next;
            return value;
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new ListIterator(begin);
    }

}
