package com.juan.ligaBetPlay.models;
import java.util.ArrayList;
import java.util.List;


public class Team {
    private int Id;
    private String Name;
    private List<Player> Players;
    private int TotalPositiveGoals;
    private int TotalNegativeGoals;
    private boolean IsActive;
    private List<StaffMember> Staff;
    private int Wins;
    private int Loses;
    private int Evens;
    private int LeaguePoints;
    
    public Team(int id, String name ){
        this.Id = id;
        this.Name= name;
        this.Players = new ArrayList<>();
        this.TotalPositiveGoals = 0;
        this.TotalNegativeGoals = 0;
        this.Staff = new ArrayList<>();
        this.Wins = 0;
        this.Loses =0; 
        this.Evens=0;
        this.IsActive = true;
    }

    public int getTeamId(){
        return this.Id;
    }

    public String getTeamName(){
        return this.Name;
    }

    public List<Player> getAllPlayers(){
        return this.Players;
    }
    
    public int returnPositiveGoals(){
        return this.TotalPositiveGoals;
    }

    public int returnNegativeGoals() {
        return this.TotalNegativeGoals;
    }

    public boolean getTeamStatus() {
        return this.IsActive;
    }
}
