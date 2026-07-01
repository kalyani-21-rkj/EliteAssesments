package com.ipl;

public class Player {
	

	    private String playerName;
	    private double bid;
	    private String teamName;

	    public Player(String playerName, double bid, String teamName) {
	        this.playerName = playerName;
	        this.bid = bid;
	        this.teamName = teamName;
	    }

	    public String getPlayerName() {
	        return playerName;
	    }

	    public double getBid() {
	        return bid;
	    }

	    public String getTeamName() {
	        return teamName;
	    }

	    public void displayPlayer() {
	        System.out.println("Player Name : " + playerName);
	        System.out.println("Team Name   : " + teamName);
	        System.out.println("Bid Amount  : ₹" + bid + " Cr");
	    }
	}


