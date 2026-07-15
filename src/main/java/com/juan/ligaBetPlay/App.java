package com.juan.ligaBetPlay;
import java.util.List;

import com.juan.ligaBetPlay.UI.LeagueUI;
import com.juan.ligaBetPlay.models.*;
import com.juan.ligaBetPlay.persistence.JsonManager;
import com.juan.ligaBetPlay.services.TeamService;

public class App 
{

    public static void main( String[] args )
    {

        League betPlayLeague = JsonManager.loadLeague();
        LeagueUI leagueUI = new LeagueUI();
        leagueUI.mainLeagueMenu(betPlayLeague);

    }
}
