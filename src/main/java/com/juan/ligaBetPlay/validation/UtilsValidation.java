package com.juan.ligaBetPlay.validation;

import java.util.List;

import com.juan.ligaBetPlay.models.League;
import com.juan.ligaBetPlay.models.Player;
import com.juan.ligaBetPlay.models.Team;
import com.juan.ligaBetPlay.services.PlayerService;
import com.juan.ligaBetPlay.services.TeamService;

public class UtilsValidation {
    private final TeamService teamService;

    public UtilsValidation(TeamService teamService) {
        this.teamService = teamService;
    }

    public boolean checkUniqueTeamID(int teamID, League league) {
        boolean isRepeated = false;
        List<Team> allTeams = teamService.GetAllTeams(league);
        for (Team team : allTeams) {
            if (team.getTeamId() == teamID) {
                isRepeated = true;
            }
        }
        return isRepeated;
    }

    public boolean checkUniqueDorsalNumber(int teamID, League league, int PlayerId){

        boolean isRepeated = false;
        Team chosenTeam = teamService.GetTeamByID(teamID, league);
        for(Player player: chosenTeam.getAllPlayers()){
            if(PlayerId== player.getPlayerShirtNumber()){
                return true;
            }
        }

        return isRepeated;
    }

}
