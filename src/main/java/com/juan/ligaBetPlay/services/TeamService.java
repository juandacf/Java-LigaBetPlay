package com.juan.ligaBetPlay.services;
import java.util.List;

import com.juan.ligaBetPlay.models.League;
import com.juan.ligaBetPlay.models.Team;

public class TeamService {

    private League league;

    public TeamService(League league){
        this.league = league;
    }

    public League GetLeague() {
        return this.league;
    }
    public List<Team> GetAllTeams() {
        return this.league.GetLeagueTeams();
    }

public void getAllActiveTeams() {
    List<Team> ActiveTeams;

    for (Team team : this.league.GetLeagueTeams()) {
        
    }
}
    public void CreateTeam(Team team){
        this.league.GetLeagueTeams().add(team);
    }

    public void EditTeam(Team team, int teamId){
        this.league.GetLeagueTeams().set(teamId, team);
    }

    public Team DeactivateTeam(int teamId){
        Team DeactivatedTeam = null;
        for(Team team: this.league.GetLeagueTeams()){
            if(teamId == team.getTeamId()){
                DeactivatedTeam = team;
            }
        }
       return DeactivatedTeam;
    }

}
