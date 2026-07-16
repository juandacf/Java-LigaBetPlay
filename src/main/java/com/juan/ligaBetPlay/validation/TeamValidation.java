package com.juan.ligaBetPlay.validation;

import com.juan.ligaBetPlay.UI.Utils;
import com.juan.ligaBetPlay.models.League;
import com.juan.ligaBetPlay.models.Team;
import com.juan.ligaBetPlay.services.TeamService;

public class TeamValidation {

    Utils utils = new Utils();
    UtilsValidation utilsValidation = new UtilsValidation();
    TeamService teamService = new TeamService();

    public League CreateTeamValidation(League league){

        System.out.println("Por favor, ingrese el ID del equipo.");
        int  teamId = utils.CollectUserInt();
        if(utilsValidation.checkUniqueTeamID(teamId, league)){
            utils.CleanTerminal();
            System.out.println("El Id ya está tomado. Por favor, escoja otro.");
             return CreateTeamValidation(league);
        }
        System.out.println("Por favor, ingrese el nombre del equipo.");
        String teamName = utils.CollectUserString();
        Team newTeam = new Team(teamId, teamName);
        teamService.CreateTeam(newTeam, league);
        System.out.println("El equipo ha sido cread exitosamente");
        return league;
    }

    public League DeleteTeamValidation (League league){
        teamService.getAllActiveTeams(league);
        System.out.println("Por favor, escoja el ID del equipo que quiere eliminar");
        int  teamId = utils.CollectUserInt();
        if(!utilsValidation.checkUniqueTeamID((teamId), league)){
            System.out.println("El Equipo no existe. Por favor, presione una tecla numércia y vuelva a intentarlo.");
            return DeleteTeamValidation(league);
        }
        teamService.DeleteTeam(teamId, league);
        System.out.println("La liga ha sido borrada con éxito.");
        return league;
    }

}
