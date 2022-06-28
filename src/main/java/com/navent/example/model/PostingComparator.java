package com.navent.example.model;

import java.util.Comparator;

public class PostingComparator implements Comparator<Posting> {
    @Override
    public int compare(Posting pos1, Posting pos2) {
        return (int)(pos1.getPrice().getAmount()-pos2.getPrice().getAmount());
    }
}
