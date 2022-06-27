package com.navent.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Price {
    private Integer amount;

    @JsonProperty("currency")
    private CurrencyEnum currencyEnum;
}
