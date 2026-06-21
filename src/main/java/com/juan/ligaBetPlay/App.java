package com.juan.ligaBetPlay;
import java.util.List;

import com.juan.ligaBetPlay.UI.LeagueUI;
import com.juan.ligaBetPlay.models.*;
import com.juan.ligaBetPlay.services.TeamService;

public class App 
{

    public static void main( String[] args )
    {
        League BetPlayleague = new League("BetPlay League");
        LeagueUI leagueUI = new LeagueUI();
        leagueUI.mainLeagueMenu();
    }
}
