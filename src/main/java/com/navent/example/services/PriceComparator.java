package com.navent.example.services;

import com.navent.example.model.Posting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Comparator;
@Component
public class PriceComparator implements Comparator<Posting> {

    @Override
    public int compare(Posting posting1, Posting posting2) {
        return (int) (posting1.getPrice().getAmount() - posting2.getPrice().getAmount());
    }

}
