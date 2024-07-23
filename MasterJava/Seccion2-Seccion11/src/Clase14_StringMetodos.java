public class Clase14_StringMetodos {
    public static void main(String[] args) {

        String nombre = "Andres";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());

        // El método equals() se utiliza para verificar si dos objetos son iguales en términos de su contenido.
        System.out.println("nombre.equals(\"Andres\") = " + nombre.equals("Andres"));
        System.out.println("nombre.equals(\"andres\") = " + nombre.equals("andres"));
        System.out.println("nombre.equalsIgnoreCase(\"andres\") = " + nombre.equalsIgnoreCase("andres"));

        // El método compareTo() se utiliza para comparar dos objetos y determinar su orden relativo.
        System.out.println("nombre.compareTo(\"Andres\") = " + nombre.compareTo("Andres"));
        System.out.println("nombre.compareTo(\"Aaron\") = " + nombre.compareTo("Aaron"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));

        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1, 4) = " + nombre.substring(1, 4));
        System.out.println("nombre.substring(nombre.length()-2) = " + nombre.substring(nombre.length()-2));

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas = " + trabalenguas.replace("a", "."));
        System.out.println("trabalenguas = " + trabalenguas);

        // indexOf('a'): Devuelve el índice de la primera ocurrencia del carácter 'a' en la cadena trabalenguas. Si el carácter no se encuentra, devuelve -1.
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));

        // lastIndexOf('a'): Devuelve el índice de la última ocurrencia del carácter 'a' en la cadena trabalenguas. Si el carácter no se encuentra, devuelve -1.
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas.indexOf('t') = " + trabalenguas.indexOf("lenguas"));

        // contains("lenguas"): Devuelve true si la cadena trabalenguas contiene la subcadena "lenguas", de lo contrario devuelve false.
        System.out.println("trabalenguas.contains('lenguas') = " + trabalenguas.contains("lenguas"));

        // startsWith("tr"): Devuelve true si la cadena trabalenguas comienza con la subcadena "tr", de lo contrario devuelve false.
        System.out.println("trabalenguas.startsWith(\"tr\") = " + trabalenguas.startsWith("tr"));

        // endsWith("s"): Devuelve true si la cadena trabalenguas termina con el carácter 's', de lo contrario devuelve false.
        System.out.println("trabalenguas.endsWith(\"s\") = " + trabalenguas.endsWith("s"));
        System.out.println("  trabalenguas ");
        System.out.println("  trabalenguas ".trim());

    }
}
