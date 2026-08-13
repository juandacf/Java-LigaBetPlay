package com.juan.ligaBetPlay;
import java.util.List;
import java.util.Scanner;

import com.juan.ligaBetPlay.UI.LeagueUI;
import com.juan.ligaBetPlay.UI.Utils;
import com.juan.ligaBetPlay.models.*;
import com.juan.ligaBetPlay.persistence.JsonManager;
import com.juan.ligaBetPlay.services.TeamService;
import com.juan.ligaBetPlay.validation.TeamValidation;
import com.juan.ligaBetPlay.validation.UtilsValidation;

public class App 
{

    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        Utils utils = new Utils(scanner);
        TeamService teamService = new TeamService();
        UtilsValidation utilsValidation = new UtilsValidation(teamService);
        TeamValidation teamValidation = new TeamValidation(utils, utilsValidation, teamService);
        League betPlayLeague = JsonManager.loadLeague();
        LeagueUI leagueUI = new LeagueUI(utils, teamValidation, teamService );
        leagueUI.mainLeagueMenu(betPlayLeague);

    }
}
