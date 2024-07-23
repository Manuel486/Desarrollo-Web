public class Main {
    public static void main(String[] args) {
//        m1InvertString("Hola mundo");
//        m2IsCapicua(1412);
        m3CountCharacterTimes("Hola mundoh");
    }

    // Ejercicio 1 : invertir una cadena
    private static void m1InvertString(String text){
        String newText = new StringBuilder(text).reverse().toString();
        System.out.println(newText);
    }


    // Ejercicio 2 : Capicua
    private static void m2IsCapicua(int number){
        String numberText = String.valueOf(number);
        String numberTextReverse = new StringBuilder(numberText).reverse().toString();

        System.out.println("Es capicua : "+ (numberText.equals(numberTextReverse)));
    }

    // Ejercicio 3 : Contar los caracteres por texto
    private static void m3CountCharacterTimes(String text){
        int length, counter[] = new int[256];

        length = text.length();

        char[] array = text.toCharArray();

        for(int i=0; i < length; i++){
            counter[text.charAt(i)]++;
        }

        for(int j=0; j < 256; j++){
            if (counter[j] != 0 &&  ((char) j) != ' '){
                System.out.println((char) j + "=" + counter[j]);
            }
        }
    }

    // MCMXCIV
    public static int romanToInt(String s) {
        if (!s.matches("[IVXLCDM]+")) {
            return 0; // La cadena no contiene solo caracteres válidos, devuelve 0 inmediatamente
        }

        String[] sArray = s.split("");
        int numero = 0;

        for (int i = 0; i < sArray.length - 1; i++) {
            int valorActual = obtenerValor(sArray[i]);
            int valorSiguiente = obtenerValor(sArray[i + 1]);

            if (valorActual < valorSiguiente) {
                numero -= valorActual;
            } else {
                numero += valorActual;
            }
        }

        // Añade el valor del último carácter
        numero += obtenerValor(sArray[sArray.length - 1]);

        return numero;
    }

    private static int obtenerValor(String caracter) {
        switch (caracter) {
            case "I": return 1;
            case "V": return 5;
            case "X": return 10;
            case "L": return 50;
            case "C": return 100;
            case "D": return 500;
            case "M": return 1000;
            default: return 0; // Carácter no reconocido
        }
    }

    

}