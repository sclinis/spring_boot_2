package com.navent.example.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
public class Posting {
    private String title;
    private Price price;
    private StatusEnum status;
}
