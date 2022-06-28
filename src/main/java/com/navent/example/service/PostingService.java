package com.navent.example.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.navent.example.model.Posting;
import com.navent.example.model.PostingResult;
import com.navent.example.model.Price;
import com.navent.example.reader.ExampleFileReader;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PostingService {

    @Autowired
    private ExampleFileReader exampleFileReader;
    @Autowired
    private Posting postingResult;

    public void returnLowestPricePosting(List<Posting> postingList){
        postingList.sort(new Comparator<Posting>() {
            @Override
            public int compare(Posting posting, Posting posting2) {
                int result = Double.compare(posting.getPrice().getAmount(),posting2.getPrice().getAmount());
                return result;
            }
        });
       // postingList.forEach(System.out::println);
        for (int i = 0; i<postingList.size(); i++){
            if (postingList.get(i).getStatus().equals("ONLINE")){
                System.out.println("Posting ONLINE con precio mas bajo: " + postingList.get(i));
                break;
            }
        }
    }

}
