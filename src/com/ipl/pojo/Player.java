package com.ipl.pojo;

public class Player {

    private int playerId;
    private String playerName;
    private String teamName;
    private double bid;

    public Player() {
    }

    public Player(int playerId, String playerName, String teamName, double bid) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.teamName = teamName;
        this.bid = bid;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public double getBid() {
        return bid;
    }

    public void setBid(double bid) {
        this.bid = bid;
    }

    @Override
    public String toString() {
        return "Player [playerId=" + playerId +
                ", playerName=" + playerName +
                ", teamName=" + teamName +
                ", bid=" + bid + "]";
    }
}