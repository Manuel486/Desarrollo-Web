package org.example;

public class App {
    public static void main(String[] args) {
        App app = new App();
        app.m1InvertString("Hola mundo");
    }

    // 1. invertir una cadena
    private void m1InvertString(String text){
        String[] array = text.split("");
        StringBuilder newText = new StringBuilder();

        for(int i = array.length; i > 0; i--){
            newText.append(array[i - 1]);
        }
        System.out.println(newText);
    }
}