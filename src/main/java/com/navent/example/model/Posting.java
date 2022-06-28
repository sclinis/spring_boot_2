package com.navent.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Posting {
    @JsonProperty("title")
    private String title;
    @JsonProperty("status")
    private Status status;
    @JsonProperty("price")
    private Price price;
}
