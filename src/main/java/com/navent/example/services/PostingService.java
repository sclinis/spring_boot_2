package com.navent.example.services;

import com.navent.example.model.Posting;
import com.navent.example.model.PostingComparator;
import com.navent.example.model.PostingResult;
import com.navent.example.model.StatusEnum;
import com.navent.example.reader.ExampleFileReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PostingService {
    @Autowired
    ExampleFileReader fileReader;

    public Posting getPostingOfMinValue(){
        List<Posting> postingList = fileReader.getPostingFromJson();
        return postingList.stream().filter(p -> StatusEnum.ONLINE.equals(p.getStatus())).min(new PostingComparator()).get();
    }
}
