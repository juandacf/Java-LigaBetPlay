package com.juan.ligaBetPlay;
import java.util.List;
import com.juan.ligaBetPlay.models.*;
import com.juan.ligaBetPlay.services.TeamService;

public class App 
{
    public static void main( String[] args )
    {
        League BetPlay = new League("BetPLay");
        Team Millonarios = new Team(1, "Millonarios");
        Team Medellín = new Team(2, "Medellín");
        TeamService teamservice = new TeamService(BetPlay);
        teamservice.CreateTeam(Millonarios);
        teamservice.CreateTeam(Medellín);
        Team chosenTeam = teamservice.GetTeamByID(1);
        System.out.println(chosenTeam.getTeamName());
        System.out.println(chosenTeam.getTeamStatus());
        teamservice.DeactivateTeam(1);
        System.out.println(chosenTeam.getTeamName());
        System.out.println(chosenTeam.getTeamStatus());

    }
}
