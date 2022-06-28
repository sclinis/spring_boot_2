package com.navent.example.Service;

import com.navent.example.model.Posting;
import com.navent.example.model.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.*;

@Service //recoce la class como servicio
public class PostingService {
    @Autowired
    private PriceComparator priceComparator;
    @Autowired
    private Posting posting;


    public Posting getPostingLowerPrice(List<Posting> postings){
        //Posting lowerPrice = new Posting();
        LinkedList<Posting> postOnline = new LinkedList<>();
        for(Posting po: postings){
            if(po.getStatus().equals(Status.ONLINE)) {
                //preguntar si es el mas bajo
                postOnline.add(po);
            }
        }
        Collections.sort(postOnline,new PriceComparator());
        return postOnline.getFirst();
    }
}
