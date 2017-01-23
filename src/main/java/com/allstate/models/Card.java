package com.allstate.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by localadmin on 23/01/17.
 */
public class Card {
    private String card;
    private String suit;

    public Card() {
    }

    public Card(String card, String suite) {
        this.card = card;
        this.suit = suite;
    }

    @JsonProperty("card")
    public String getCard() {
        return card;
    }
    public void setCard(String card) {
        this.card = card;
    }

    @JsonProperty("suit")
    public String getSuit() {
        return suit;
    }
    public void setSuit(String suite) {
        this.suit = suite;
    }
}
