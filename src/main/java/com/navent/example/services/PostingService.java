package com.navent.example.services;

import com.navent.example.model.Posting;
import com.navent.example.model.StatusEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class PostingService {


    @Autowired
    private PriceComparator priceComparator;

    public Posting getMinPricePosting (List<Posting> postingList) {
        List<Posting> filteredPostingList = getPostingsByStatus(postingList);
        return Collections.min(postingList, priceComparator);
    }

    private List<Posting> getPostingsByStatus(List<Posting> postingList) {
        List<Posting> filteredPostingList = new ArrayList<>();

        for (Posting posting : postingList) {
            if (StatusEnum.ONLINE.equals(posting.getStatus())) {
                filteredPostingList.add(posting);
            }
        }

        return filteredPostingList;
    }
}
