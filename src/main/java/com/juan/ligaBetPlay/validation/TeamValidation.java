package com.juan.ligaBetPlay.validation;

import com.juan.ligaBetPlay.UI.Utils;
import com.juan.ligaBetPlay.models.League;
import com.juan.ligaBetPlay.models.Team;
import com.juan.ligaBetPlay.services.TeamService;

public class TeamValidation {

    Utils utils = new Utils();
    TeamService teamService = new TeamService();

    public League CreateTeamValidation(League league){
        
        String teamName = utils.CollectUserString();
        int  teamId = utils.CollectUserInt();
        
        Team newTeam = new Team(teamId, teamName);
        teamService.CreateTeam(newTeam, league);
        return league;

    }
}
