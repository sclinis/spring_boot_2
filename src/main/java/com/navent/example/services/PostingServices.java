package com.navent.example.services;

import com.navent.example.model.Posting;
import com.navent.example.model.PriceComparator;
import com.navent.example.model.Status;
import com.navent.example.reader.ExampleFileReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class PostingServices {

    @Autowired
    private ExampleFileReader exampleFileReader;
    @Autowired
    private Posting resultPosting;
    @Autowired
    private PriceComparator priceComparator;

    private List<Posting> arrangePostingsByPrice (){
        List<Posting> postingList = exampleFileReader.getPostingFromJson();
        Collections.sort(postingList, priceComparator);
        return postingList;
    }

    private Posting getLowerPriceByStatus (Status status){
        //Posting resultPosting = new Posting();
        for (Posting posting : arrangePostingsByPrice()){
            if (posting!=null && status.equals(posting.getStatus())){
                resultPosting = posting;
                break;
            }
        }
        return resultPosting;
    }

    public void showLowerPricePostingOnline(){
        System.out.println(getLowerPriceByStatus(Status.ONLINE));
    }
}
