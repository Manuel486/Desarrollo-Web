package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Password {
    private int longitud = 8;
    private String contrasenia;

    private static final String UPPER_CASE_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER_CASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final Random RANDOM = new Random();

    public Password() {
    }

    public Password(int longitud) {
        this.longitud = longitud;
        this.contrasenia = generarPassword();
    }

    private boolean esFuerte(){
        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int digitCount = 0;

        for(char ch: this.contrasenia.toCharArray()){
            if (Character.isUpperCase(ch)){
                upperCaseCount++;
            } else if (Character.isLowerCase(ch)){
                lowerCaseCount++;
            } else if (Character.isDigit(ch)){
                digitCount++;
            }
        }

        return upperCaseCount > 2 && lowerCaseCount > 1 && digitCount > 5;
    }

    private String generarPassword() {
        List<Character> passwordChars = new ArrayList<>();

        // Añadir más de 2 mayúsculas
        for (int i = 0; i < 3; i++) {
            passwordChars.add(UPPER_CASE_LETTERS.charAt(RANDOM.nextInt(UPPER_CASE_LETTERS.length())));
        }

        // Añadir más de 1 minúscula
        for (int i = 0; i < 2; i++) {
            passwordChars.add(LOWER_CASE_LETTERS.charAt(RANDOM.nextInt(LOWER_CASE_LETTERS.length())));
        }

        // Añadir más de 5 números
        for (int i = 0; i < 6; i++) {
            passwordChars.add(DIGITS.charAt(RANDOM.nextInt(DIGITS.length())));
        }

        // Completar la longitud de la contraseña con caracteres aleatorios hasta la longitud especificada
        while (passwordChars.size() < longitud) {
            String allChars = UPPER_CASE_LETTERS + LOWER_CASE_LETTERS + DIGITS;
            passwordChars.add(allChars.charAt(RANDOM.nextInt(allChars.length())));
        }

        // Mezclar los caracteres para asegurar aleatoriedad
        Collections.shuffle(passwordChars);

        // Convertir la lista de caracteres a una cadena
        StringBuilder password = new StringBuilder();
        for (char ch : passwordChars) {
            password.append(ch);
        }

        // Si la longitud es mayor que la especificada, truncar
        if (password.length() > longitud) {
            return password.substring(0, longitud);
        }

        return password.toString();
    }

    public int getLongitud() {
        return longitud;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
        this.contrasenia = generarPassword();
    }
}
