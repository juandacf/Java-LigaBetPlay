package com.juan.ligaBetPlay.UI;

public class LeagueUI {
    Utils UIUTils = new Utils();

    public void mainLeagueMenu(){
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
                mainTeamMenu();
                break;
                case '2':
                mainPlayerMenu();
                break;
                case '3':
                mainStaffMenu();
                break;
                case '4':
                System.out.println("Por desarrollarse");
                break;
                case'5':
                System.out.println("Gracias por participar");
                break;
            } 
    }

    public void mainTeamMenu() {
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
    }
    public void mainPlayerMenu() {
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

    public void mainStaffMenu(){
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
