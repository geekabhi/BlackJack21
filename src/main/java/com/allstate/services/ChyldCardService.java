package com.allstate.services;

import com.allstate.models.Card;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ChyldCardService {

    public Card ChyldCard() {

        RestTemplate rest = new RestTemplate();
        return  rest.getForObject("https://blackjack-chyld.c9users.io/cards/draw", Card.class);

    }
}
