package com.company;

import java.util.Comparator;

public class ToyComparator implements Comparator<Toy> {

    @Override
    public int compare(Toy o1, Toy o2) {
        return (o1.getPrice().compareTo(o2.getPrice()));
    }
}
