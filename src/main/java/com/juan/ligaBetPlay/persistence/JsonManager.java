package com.juan.ligaBetPlay.persistence;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.juan.ligaBetPlay.models.League;


public class JsonManager {
    private static final String FILE_NAME = "./src/main/java/com/juan/ligaBetPlay/persistence/league.json";

    public static void saveLeague(League league) {

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        try (FileWriter writer = new FileWriter(FILE_NAME)) {
            gson.toJson(league, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    

    public static League loadLeague() {

        Gson gson = new Gson();

        try (FileReader reader = new FileReader(FILE_NAME)) {
            return gson.fromJson(reader, League.class);
        } catch (IOException e) {
        League league = new League("BetPlay League");
        saveLeague(league);
        return league;
        }
    }
}
