package com.gabrielmarquez.kalahbackend.model;

public class Game {
    private int playerBAmount;
    private int playerAAmount;
    private boolean playerATurn;
    private int[] playerASeeds;
    private int[] playerBSeeds;

    public Game(int playerBAmount, int playerAAmount, boolean playerATurn, int[] playerASeeds, int[] playerBSeeds) {
        this.playerBAmount = playerBAmount;
        this.playerAAmount = playerAAmount;
        this.playerATurn = playerATurn;
        this.playerASeeds = playerASeeds;
        this.playerBSeeds = playerBSeeds;
    }

    public Game(){}
}
