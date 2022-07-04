package com.navent.example.service;

import com.navent.example.model.Posting;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostingService {

    public void returnLowestPricePosting(List<Posting> postingList, String status){
        System.out.println("Posting " + status + " con precio mas bajo: " + postingList.stream().filter(p -> status.equalsIgnoreCase(p.getStatus())).min((x, y)-> (int) (x.getPrice().getAmount() - y.getPrice().getAmount())).get());
       /* for (int i = 0; i<postingList.size(); i++){
            if (status.equalsIgnoreCase(postingList.get(i).getStatus())){
                System.out.println("Posting " + status + " con precio mas bajo: " +
                        postingList.stream().filter(p -> status.equals(p.getStatus())).min((x, y) ->
                                (int) (x.getPrice().getAmount() - y.getPrice().getAmount())).get());
                break;
            }
        }*/
    }

}
