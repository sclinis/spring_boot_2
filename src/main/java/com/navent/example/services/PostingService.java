package com.navent.example.services;

import com.navent.example.model.Posting;
import com.navent.example.model.PostingPriceComparator;
import com.navent.example.model.Status;
import com.navent.example.reader.ExampleFileReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service


public class PostingService {
    @Autowired
    private ExampleFileReader exampleFileReader;

    public List<Posting> getPostingByStatus(Status statusToFilter) {
        return exampleFileReader.getPostingFromJson().stream().filter(posting -> statusToFilter.equals(posting.getStatus())).collect(Collectors.toList());
    }

    public Posting getLowerPricePosting(Status statusToFilter){
        return this.getPostingByStatus(statusToFilter).stream().min(new PostingPriceComparator()).get();
    }
}
