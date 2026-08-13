package com.juan.ligaBetPlay.services;

import java.util.List;

import com.juan.ligaBetPlay.models.League;
import com.juan.ligaBetPlay.models.Player;
import com.juan.ligaBetPlay.models.Team;

public class PlayerService {

    public boolean AddNewPlayer(League league, int teamId, Player player) {

        for (Team team : league.GetLeagueTeams()) {
            if (teamId == team.getTeamId()) {
                team.getAllPlayers().add(player);
                return true;
            }
        }

        return false;
    }

    public List<Player> GetAllTeamPlayers(League league, int teamID ){
        for(Team team: league.GetLeagueTeams()){
            if(team.getTeamId()== teamID){
                return team.getAllPlayers();
            }
        }

        return null;
    }

    public boolean DeletePlayer(League league, int teamId, int shirtNumber) {

        for (Team team : league.GetLeagueTeams()) {
            if (teamId == team.getTeamId()) {
                for (Player player : team.getAllPlayers()) {
                    if (shirtNumber == player.getPlayerShirtNumber()) {
                        team.getAllPlayers().remove(player);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean EditPlayer(League league, int teamId, int shirtNumber, Player player) {
        for (Team team : league.GetLeagueTeams()) {
            if (team.getTeamId() == teamId) {
                for (int i = 0; i < team.getAllPlayers().size(); i++) {
                    Player chosenPlayer = team.getAllPlayers().get(i);

                    if (chosenPlayer.getPlayerShirtNumber() == shirtNumber) {
                        team.getAllPlayers().set(i, player);
                        return true;
                    }
                }
            }
        }

        return false;
    }

}
