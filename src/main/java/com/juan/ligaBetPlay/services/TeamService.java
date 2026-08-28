package com.juan.ligaBetPlay.services;

import java.util.ArrayList;
import java.util.List;

import com.juan.ligaBetPlay.models.League;
import com.juan.ligaBetPlay.models.Team;

public class TeamService {

    private League league;
    


    public League GetLeague() {
        return this.league;
    }

    public List<Team> GetAllTeams(League league) {
        return league.GetLeagueTeams();
    }

    public League CreateTeam(Team team, League league) {
        GetAllTeams(league).add(team);
        return league;
    }

    public void EditTeam(Team team, int teamId, League league) {
        league.GetLeagueTeams().set(teamId, team);
    }

    public void getAllActiveTeams(League league) { // This is missing
        List<Team> ActiveTeams = new ArrayList<>();

        
        for (Team team :league.GetLeagueTeams()) {
            if (team.getTeamStatus()) {
                ActiveTeams.add(team);
            }
        }
        if(ActiveTeams.size()== 0){
            System.out.println("No hay equipos para mostrar.");
        }
        for(Team team: ActiveTeams){
            String mensaje = String.format("%d. %s", team.getTeamId(), team.getTeamName() );
            System.out.println(mensaje);
        }

        
    }

    public Team DeactivateTeam(int teamId, League league) {
        Team DeactivatedTeam = null;
        for (Team team : league.GetLeagueTeams()) {
            if (teamId == team.getTeamId()) {
                team.setTeamStatus(false);
            }
        }
        return DeactivatedTeam;
    }

    public Team ActivateTeam(int teamId, League league){
        Team ActivatedTeam = null;
        for (Team team : league.GetLeagueTeams()) {
            if (teamId == team.getTeamId()) {
                team.setTeamStatus(true);
            }
        }  
        return ActivatedTeam;
    }

    public Team GetTeamByID(int teamId, League league) {
        Team ChosenTeam = null;
        for (Team team : league.GetLeagueTeams()) {
            if (team.getTeamId() == teamId) {
                ChosenTeam = team;
            }
        }
        return ChosenTeam;
    }

    public boolean DeleteTeam(int teamId, League league) {


        for (Team team : league.GetLeagueTeams()) {
            if (team.getTeamId() == teamId) {
                league.GetLeagueTeams().remove(team);
                return true;
            }
        }
        return false;   
    }


    public boolean EditTeamName(int teamId, League league, String name){
        for(Team team : league.GetLeagueTeams()){
            if(team.getTeamId() == teamId){
                team.setTeamName(name);
                return true;
            }
        }
        return false;
    }

    
}
