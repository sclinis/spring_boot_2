package com.navent.example.model;

import org.springframework.stereotype.Component;
import java.util.Comparator;

@Component
public class PriceComparator implements Comparator<Posting> {


    public int compare(Posting o1, Posting o2) {
        return Double.compare(o1.getPrice().getAmount(), o2.getPrice().getAmount());
    }
}
