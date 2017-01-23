package com.allstate.services;

import com.allstate.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    private ChyldCardService chyldCardService;

    @Autowired
    public void setChyldCardService(ChyldCardService chyldCardService) {
        this.chyldCardService = chyldCardService;
    }

    public void startGame(User userById) {
        String card = chyldCardService.ChyldCard().getCard();
        int card_value;

        switch (card){
            case "J" : case "Q" :case "K":case "10":  card_value = 10;
            default: card_value = Integer.parseInt(card);
        }

        if(card == "A") card_value = 11;

    }
}
