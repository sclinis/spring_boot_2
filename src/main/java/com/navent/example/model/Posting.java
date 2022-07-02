package com.navent.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Posting {
    @JsonProperty("title")
    private String title;
    @JsonProperty("status")
    private Status status;
    @JsonProperty("price")
    private Price price;
}
