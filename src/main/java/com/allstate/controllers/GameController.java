package com.allstate.controllers;

import com.allstate.services.ChyldCardService;
import com.allstate.services.GameService;
import com.allstate.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    private GameService gameService;
    private UserService userService;
    private ChyldCardService chyldCardService;

    @Autowired
    public void setGameService(GameService gameService) {
        this.gameService = gameService;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    public void setChyldCardService(ChyldCardService chyldCardService) {
        this.chyldCardService = chyldCardService;
    }

    @RequestMapping(value = "/{userid}/{bet}", method = RequestMethod.POST)
    public String startGame(@PathVariable int userid, @PathVariable double bet_amount) {
        this.gameService.startGame(this.userService.findUserById(userid));
    }
}
