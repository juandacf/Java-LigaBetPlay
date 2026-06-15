package com.juan.ligaBetPlay.models;
import java.util.ArrayList;
import java.util.List;

public class League {

    private String Name;
    private List<Team> Teams;

    public League(String name){
        this.Name =  name;
        this.Teams =  new ArrayList<>();
    }   

    public String GetName() {
        return this.Name;
    }

    public List<Team> GetLeagueTeams() {
        return this.Teams;
    }
}
