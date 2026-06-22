package com.juan.ligaBetPlay.UI;

import java.util.Scanner;

public class Utils {

    public void CleanTerminal(){
    System.out.print("\033[H\033[2J");
    System.out.flush();
    }

    public char CollectUserNumericKey(){
        Scanner scanner = new Scanner(System.in);
        char option = ' ';
        boolean isValid = false;

        while (!isValid){
            String input = scanner.next();
            if(input.length() == 1  && Character.isDigit(input.charAt(0))){
                option = input.charAt(0);
                isValid = true;
            } else {
                System.out.println("Error: Entrada no válida. Debe ser un solo número.");
            }
        }

        return option;

    }

    public String CollectUserString(){

        Scanner scanner = new Scanner(System.in);
        String userInput = null;
        boolean IsValid = false;

        while(!IsValid){
            userInput = scanner.nextLine();
            if(userInput.length()==0){
                System.out.println("El campo no puede estar vacío.");
            } else {
                IsValid = true;
            }
        }
        return userInput;

    }
}
