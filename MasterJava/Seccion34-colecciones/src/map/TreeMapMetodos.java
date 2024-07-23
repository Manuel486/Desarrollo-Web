package map;

import java.util.*;

public class TreeMapMetodos {
    public static void main(String[] args) {
        // En TreeMap no puedo guardar null
        // Ordena mediante la llave
        // Map<String, Object> persona = new TreeMap<>((a,b) -> b.compareTo(a));
        // Map<String, Object> persona = new TreeMap<>(Comparator.comparing(String::length).reversed());
        Map<String, Object> persona = new TreeMap<>(Comparator.reverseOrder());

        //persona.put(null, "12345");
        //persona.put(null, "123456");
        persona.put("nombre", "John");
        persona.put("apellidoPaterno", "Doe");
        persona.put("apellido", "Doe");
        persona.put("email", "john.doe@gmail.com");
        persona.put("edad", "30");

        Map<String, String> direccion = new TreeMap<>();
        direccion.put("pais", "USA");
        direccion.put("estado", "California");
        direccion.put("ciudad", "Santa Barbara");
        direccion.put("calle", "One Street");
        direccion.put("numero", "120");

        persona.put("direccion", direccion);

        System.out.println("persona = " + persona);



    }
}
