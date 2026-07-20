package com.juan.ligaBetPlay.services;
import com.juan.ligaBetPlay.models.League;
import com.juan.ligaBetPlay.models.Player;
import com.juan.ligaBetPlay.models.Team;

public class PlayerService {



    public boolean AddNewPlayer(League league, int teamId, Player player){
        
        for(Team team : league.GetLeagueTeams()){
            if(teamId == team.getTeamId()){
                team.getAllPlayers().add(player);
                return true;
            }
        }

        return false;
    }


    public boolean DeletePlayer(League league, int teamId, int shirtNumber) {

        for(Team team: league.GetLeagueTeams()){
            if(teamId == team.getTeamId()){
                for(Player player: team.getAllPlayers() ){
                    
                }
            }
        }


        return false;
    }
    
}
