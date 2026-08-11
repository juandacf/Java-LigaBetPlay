package com.juan.ligaBetPlay.UI;

import com.juan.ligaBetPlay.models.League;
import com.juan.ligaBetPlay.persistence.JsonManager;
import com.juan.ligaBetPlay.services.TeamService;
import com.juan.ligaBetPlay.validation.TeamValidation;

public class LeagueUI {
    Utils UIUTils = new Utils();
    TeamValidation teamvalidation = new TeamValidation();
    TeamService teamService = new TeamService();
    public void mainLeagueMenu(League league){
        UIUTils.CleanTerminal();
        System.out.println(""" 
            Bienvenido a la liga. Por favor, escoja una de las siguientes opciones:
            -----------------------------------------------------------------------
            1. Gestionar Equipos
            2. Gestionar Jugadores
            3. Gestionar Staff
            4. Añadir fecha
            5. Salir de la liga 
            -----------------------------------------------------------------------
            """); 

            char chosenOption = UIUTils.CollectUserNumericKey();
            switch(chosenOption){
                case '1':
                mainTeamMenu(league);
                break;
                case '2':
                mainPlayerMenu(league);
                break;
                case '3':
                mainStaffMenu(league);
                break;
                case '4':
                System.out.println("Por desarrollarse");
                break;
                case'5':
                System.out.println("Gracias por participar");
                break;
            } 
    }

    public void mainTeamMenu(League league) {
        UIUTils.CleanTerminal();
        System.out.println("""
            Gestion de equipos
            ------------------
            1. Añadir un nuevo Equipo
            2. Ver equipos
            3. Editar un equipo
            4. Eliminar un equipo
            5. Volver al menú anterior
            --------------------------
            """);

        char chosenOption = UIUTils.CollectUserNumericKey();
        switch (chosenOption) {
            case '1':
            teamvalidation.CreateTeamValidation(league);
            UIUTils.GuideUserToNextMethod();
            JsonManager.saveLeague(league);
            mainLeagueMenu(league);
            break;
            case '2':
            teamService.getAllActiveTeams(league);
            UIUTils.GuideUserToNextMethod();
            JsonManager.saveLeague(league);
            mainLeagueMenu(league);
            break;
            case '3':
            teamService.getAllActiveTeams(league);
            teamvalidation.SetTeamNameValidation(league);
            UIUTils.GuideUserToNextMethod();
            JsonManager.saveLeague(league);
            mainLeagueMenu(league);
            break;

            case '4':
            teamvalidation.DeleteTeamValidation(league);
            UIUTils.GuideUserToNextMethod();
            JsonManager.saveLeague(league);
            mainLeagueMenu(league);
            break;

            case '5':
            mainLeagueMenu(league);
            break;
        }
    }
    public void mainPlayerMenu(League league) {
        UIUTils.CleanTerminal();
        System.out.println("""
            Gestión de jugadores
            --------------------
            1. Añadir un nuevo Jugador a un equipo
            2. Ver los jugadores de un equipo
            3. Editar a un jugador de un equipo
            4. Eliminar a un jugador de un equipo
            """);

            char chosenOption = UIUTils.CollectUserNumericKey();
    }

    public void mainStaffMenu(League league){
        UIUTils.CleanTerminal();
        System.out.println("""
            Gestión de Staff
            ----------------
            1. Añadir un nuevo miembro de staff a un equipo
            2. Ver el staff de un equipo
            3. Editar un miembro de staff de un equipo
            4. Eliminar un miembro de staff de un equipo

        """);

        char chosenOption = UIUTils.CollectUserNumericKey();
    }
}
