package com.navent.example.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Data
public class PostingResult {
    private List<Posting> result;
}
