package com.juan.ligaBetPlay.models;
import java.util.List;


public class Equipo {
    private int Id;
    private String Name;
    private List<Jugador> Jugadores;

    public Equipo(int id, String name ){
        this.Id = id;
        this.Name= name;
    }

    public int getTeamId(){
        return this.Id;
    }

    public String getTeamName(){
        return this.Name;
    }
    
    
}
