package com.juan.ligaBetPlay.services;

import java.util.List;

import com.juan.ligaBetPlay.models.League;
import com.juan.ligaBetPlay.models.Team;

public class TeamService {

    private League league;
    


    public League GetLeague() {
        return this.league;
    }

    public List<Team> GetAllTeams() {
        return this.league.GetLeagueTeams();
    }

    public League CreateTeam(Team team, League league) {
        league.GetLeagueTeams().add(team);
        return league;
    }

    public void EditTeam(Team team, int teamId) {
        this.league.GetLeagueTeams().set(teamId, team);
    }

    public List<Team> getAllActiveTeams() { // This is missing
        List<Team> ActiveTeams = null;

        for (Team team : this.league.GetLeagueTeams()) {
            if (team.getTeamStatus()) {
                ActiveTeams.add(team);
            }
        }

        return ActiveTeams;
    }

    public Team DeactivateTeam(int teamId) {
        Team DeactivatedTeam = null;
        for (Team team : this.league.GetLeagueTeams()) {
            if (teamId == team.getTeamId()) {
                team.setTeamStatus(false);
            }
        }
        return DeactivatedTeam;
    }

    public Team ActivateTeam(int teamId){
        Team ActivatedTeam = null;
        for (Team team : this.league.GetLeagueTeams()) {
            if (teamId == team.getTeamId()) {
                team.setTeamStatus(true);
            }
        }  
        return ActivatedTeam;
    }

    public Team GetTeamByID(int teamId) {
        Team ChosenTeam = null;
        for (Team team : this.league.GetLeagueTeams()) {
            if (team.getTeamId() == teamId) {
                ChosenTeam = team;
            }
        }
        return ChosenTeam;
    }

    
    public boolean checkUniqueTeamID(int teamID){
        boolean isRepeated = false;
        List<Team> allTeams = GetAllTeams();
        for(Team team : allTeams){
            if(team.getTeamId()==teamID){
                isRepeated = true;
            }
        }
        return isRepeated;
    }

}
