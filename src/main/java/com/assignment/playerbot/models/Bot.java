package com.assignment.playerbot.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Bot extends Player{
    private long playerRank;
}
