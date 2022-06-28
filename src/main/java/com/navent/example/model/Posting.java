package com.navent.example.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Posting{
    private String title;
    private Price price;
    private Status status;
}
