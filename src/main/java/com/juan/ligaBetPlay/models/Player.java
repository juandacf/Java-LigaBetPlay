package com.juan.ligaBetPlay.models;

public class Player {
    
    private int ShirtNumber;
    private String Name;
    private int TotalScoredGoals;
    private int TotalYellowCards;
    private int TotalRedCards;
    private int TotalFouls;

    public Player(int shirtNumber, String name){
        this.ShirtNumber = shirtNumber;
        this.Name = name;
        this.TotalScoredGoals = 0;
        this.TotalYellowCards = 0;
        this.TotalRedCards = 0;
        this.TotalFouls = 0;
    }
    
    public int getPlayerShirtNumber(){
        return this.ShirtNumber;
    }

    public String getPlayerName(){
        return this.Name;
    }

    public int GetScoredGoals() {
        return this.TotalScoredGoals;
    }
    
    public int GetYellowCards() {
        return this.TotalYellowCards;
    }

    public int GetRedCards() {
        return this.TotalRedCards;
    }

    public int GetFouls() {
        return this.TotalFouls;
    }
}
