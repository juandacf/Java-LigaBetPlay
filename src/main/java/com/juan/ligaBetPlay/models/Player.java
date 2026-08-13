package com.juan.ligaBetPlay.models;

public class Player {
    
    private int ShirtNumber;
    private String Name;

    public Player(int shirtNumber, String name){
        this.ShirtNumber = shirtNumber;
        this.Name = name;
    }
    
    public int getPlayerShirtNumber(){
        return this.ShirtNumber;
    }

    public String getPlayerName(){
        return this.Name;
    }


}
