package com.allstate.entities;

import com.allstate.enums.Action;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Generated;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table( name = "games")
@Data
public class Game {
    private int id;
    private int version;
    private User user;
    private Action action;
    private double bet_amount;
    private String card;
    private Date created;
    private Date modified;
    private int firstCard ;
    private int secondCard ;

    @Id
    @Generated
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Version
    public int getVersion() {
        return version;
    }
    public void setVersion(int version) {
        this.version = version;
    }

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonIgnore
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    @Column(nullable = false, columnDefinition = "ENUM( 'BET', 'HIT', 'STAND')")
    @Enumerated(EnumType.STRING)
    public Action getAction() {
        return action;
    }
    public void setAction(Action action) {
        this.action = action;
    }


    public double getBet_amount() {
        return bet_amount;
    }
    public void setBet_amount(double bet_amount) {
        this.bet_amount = bet_amount;
    }

}
