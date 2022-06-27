package com.navent.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
@Data
public class Posting {
    private String title;

    @JsonProperty("status")
    private StatusEnum status;

    @JsonProperty("posting_id")
    private Integer postingId;

    private Price price;

}
