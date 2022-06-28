package com.navent.example.model;

import java.util.Comparator;

public class PostingComparator implements Comparator<Posting> {
    @Override
    public int compare(Posting o1, Posting o2) {
        return (int) (o1.getPrice().getAmount() - o2.getPrice().getAmount());
    }
}
