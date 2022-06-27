package com.navent.example.model;

import java.util.Comparator;

public class PriceComparator implements Comparator<Posting> {

    public int compare (Posting posting01, Posting posting02){
        return Integer.compare(posting01.getPrice().getAmount(), posting02.getPrice().getAmount());
    }
}
