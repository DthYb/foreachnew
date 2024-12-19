package com.example;

import java.util.Iterator;

public class StringWrapper implements Iterable<Character> {
    private final String str;
    private final boolean reverse;

    public StringWrapper(String str, boolean reverse) {
        this.str = str;
        this.reverse = reverse;
    }

    @Override
    public Iterator<Character> iterator() {
        return new StringIterator(str, reverse);
    }

    private static class StringIterator implements Iterator<Character> {
        private final String str;
        private int index;
        private final boolean reverse;

        public StringIterator(String str, boolean reverse) {
            this.str = str;
            this.reverse = reverse;
            this.index = reverse ? str.length() - 1 : 0;
        }

        @Override
        public boolean hasNext() {
            return reverse ? index >= 0 : index < str.length();
        }

        @Override
        public Character next() {
            char currentChar = str.charAt(index);
            index += reverse ? -1 : 1;
            return currentChar;
        }
    }
}