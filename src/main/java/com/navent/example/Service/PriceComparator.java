package com.navent.example.Service;

import com.navent.example.model.Posting;
import org.springframework.stereotype.Component;
import java.util.Comparator;

@Component
public class PriceComparator implements Comparator<Posting> {


    public int compare(Posting o1, Posting o2) {
        return Integer.compare(o1.getPrice().getAmount(), o2.getPrice().getAmount());
    }
}
