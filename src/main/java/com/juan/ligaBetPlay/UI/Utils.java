package com.juan.ligaBetPlay.UI;

import java.util.Scanner;

public class Utils {
    private Scanner scanner;

    public Utils(Scanner scanner){
        this.scanner = scanner;
    }

    public void CleanTerminal(){
    System.out.print("\033[H\033[2J");
    System.out.flush();
    }

    public char CollectUserNumericKey(){
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

    public int CollectUserInt() {

    int userInput = 0;
    boolean isValid = false;

    while (!isValid) {

        String input = scanner.nextLine();

        if (input == null || input.isBlank()) {
            System.out.println("El campo no puede estar vacío.");
            continue;
        }

        try {
            userInput = Integer.parseInt(input);
            isValid = true;
        } catch (NumberFormatException e) {
            System.out.println("Por favor ingrese un número entero válido.");
        }
    }

    return userInput;
}

    public void GuideUserToNextMethod(){
        System.out.println("Por favor, presione una tecla numérica para ir la próximo menú:");
        int number = CollectUserNumericKey();
        
    }
}
