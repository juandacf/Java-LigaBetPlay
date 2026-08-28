package com.juan.ligaBetPlay.validation;

import java.util.List;

import com.juan.ligaBetPlay.UI.Utils;
import com.juan.ligaBetPlay.models.League;
import com.juan.ligaBetPlay.models.Player;
import com.juan.ligaBetPlay.services.PlayerService;
import com.juan.ligaBetPlay.services.TeamService;

public class PlayerValidation {

    private final Utils utils;
    private final UtilsValidation utilsValidation;
    private final PlayerService playerService;
    private final TeamService teamService;

    public PlayerValidation(Utils utils, UtilsValidation utilsValidation, PlayerService playerservice,
            TeamService teamservice) {
        this.utils = utils;
        this.utilsValidation = utilsValidation;
        this.playerService = playerservice;
        this.teamService = teamservice;
    }

    public League CreatePlayerValidation(League league) {
        teamService.getAllActiveTeams(league);
        System.out.println("Por favor, ingrese el ID del equipo escogido.");
        int teamId = utils.CollectUserInt();
        if (!utilsValidation.checkUniqueTeamID(teamId, league)) {
            utils.CleanTerminal();
            System.out.println("El equipo no existe. Por favor, vuelva a intentarlo.");
            return CreatePlayerValidation(league);
        }
        System.out.println("Por favor, ingrese el dorsal del jugador.");
        int playerNumber = utils.CollectUserInt();
        if (utilsValidation.checkUniqueDorsalNumber(teamId, league, playerNumber)) {
            utils.CleanTerminal();
            System.out.println("El equipo no existe. Por favor, vuelva a intentarlo.");
            return CreatePlayerValidation(league);
        }
        System.out.println("Por favor, ingrese el nombre del jugador.");
        String playerName = utils.CollectUserString();
        Player newPlayer = new Player(playerNumber, playerName);
        playerService.AddNewPlayer(league, teamId, newPlayer);
        return league;
    }

    public void PrintAllTeamPlayers(League league, int teamID) {
        List<Player> playerList = playerService.GetAllTeamPlayers(league, teamID);
        if (playerList.size() == 0) {
            System.out.println("No hay jugadores para mostrar");
        }
        for (Player player : playerList) {
            String message = String.format("%d. %s", player.getPlayerShirtNumber(), player.getPlayerName());
            System.out.println(message);
        }
    }

    public League EditPlayerValidation(League league) {
        teamService.getAllActiveTeams(league);
        System.out.println("Por favor, ingrese el ID del equipo escogido.");
        int teamId = utils.CollectUserInt();
        if (!utilsValidation.checkUniqueTeamID(teamId, league)) {
            utils.CleanTerminal();
            System.out.println("El equipo no existe. Por favor, vuelva a intentarlo.");
            return EditPlayerValidation(league);
        }
        PrintAllTeamPlayers(league, teamId);
        int PlayerId = utils.CollectUserInt();
        if (!utilsValidation.checkUniqueDorsalNumber(teamId, league, PlayerId)) {
            System.out.println("El jugador no existe.Por favor, vuelva a intentarlo.");
            return EditPlayerValidation(league);
        }
        System.out.println("Por favor, ingrese el nuevo dorsal del jugador.");
        String PlayerNewName = utils.CollectUserString();

        Player editedPlayer = new Player(PlayerId, PlayerNewName);
        boolean wasPlayerEdited = playerService.EditPlayer(league, teamId, PlayerId, editedPlayer);

        if (wasPlayerEdited) {
            System.out.println("El jugador fue modificado exitosamente:)");
        }

        return league;
    }

    public League DeletePlayerValidation(League league) {
        teamService.getAllActiveTeams(league);
        System.out.println("Por favor, ingrese el ID del equipo escogido.");
        int teamId = utils.CollectUserInt();
        if (!utilsValidation.checkUniqueTeamID(teamId, league)) {
            utils.CleanTerminal();
            System.out.println("El equipo no existe. Por favor, vuelva a intentarlo.");
            return EditPlayerValidation(league);
        }
        PrintAllTeamPlayers(league, teamId);
        int PlayerId = utils.CollectUserInt();
        if (!utilsValidation.checkUniqueDorsalNumber(teamId, league, PlayerId)) {
            System.out.println("El jugador no existe.Por favor, vuelva a intentarlo.");
            return EditPlayerValidation(league);
        }

        boolean wasPlayerDeleted = playerService.DeletePlayer(league, teamId, PlayerId);

        if (wasPlayerDeleted) {
            System.out.println("El jugador fue borrado exitosamente");
        }

        return league;
    }

}
