package com.navent.example.services;

import com.navent.example.model.CurrencyEnum;
import com.navent.example.model.Posting;
import com.navent.example.model.Price;
import com.navent.example.model.StatusEnum;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest

class PostingServiceTest {

    @Autowired
    PostingService postingService;

    @Test
    void minPosting() {
        Posting postingOne = new Posting();
        postingOne.setTitle("Posting Uno");
        postingOne.setPostingId(1111);
        postingOne.setStatus(StatusEnum.ONLINE);
        postingOne.setPrice(new Price(100000, CurrencyEnum.USD));

        Posting postingTwo = new Posting();
        postingTwo.setTitle("Posting Dos");
        postingTwo.setPostingId(2222);
        postingOne.setStatus(StatusEnum.ONLINE);
        postingTwo.setPrice(new Price(200000, CurrencyEnum.USD));

        List<Posting> postingList = new ArrayList<>();
        postingList.add(postingOne);
        postingList.add(postingTwo);

        Posting postingResult = postingService.getMinPricePosting(postingList);
        assertEquals(1111, postingResult.getPostingId());
    }

}