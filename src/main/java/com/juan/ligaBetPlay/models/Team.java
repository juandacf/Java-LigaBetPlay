package com.juan.ligaBetPlay.models;
import java.util.List;


public class Team {
    private int Id;
    private String Name;
    private List<Player> Jugadores;

    public Team(int id, String name ){
        this.Id = id;
        this.Name= name;
    }

    public int getTeamId(){
        return this.Id;
    }

    public String getTeamName(){
        return this.Name;
    }

    public List<Player> getAllPlayers(){
        return this.Jugadores;
    }
    

}
