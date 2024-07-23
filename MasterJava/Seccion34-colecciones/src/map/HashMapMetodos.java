package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapMetodos {
    public static void main(String[] args) {
        Map<String, Object> persona = new HashMap<>();
        // las llaves son unicos, utiliza el hashcode o el equals para verificar si es unica

        persona.put(null,"12345");
        persona.put(null,"123456");
        persona.put("nombre","John");
        persona.put("apellidoPaterno","Doe");
        persona.put("apellido","Doe");
        persona.put("email","john.doe@gmail.com");
        persona.put("edad","30");

        Map<String, String> direccion = new HashMap<>();
        direccion.put("pais","USA");
        direccion.put("estado","California");
        direccion.put("ciudad","Santa Barbara");
        direccion.put("calle","One Street");
        direccion.put("numero","120");

        persona.put("direccion",direccion);

        System.out.println("persona = " + persona);
        
        String nombre = (String) persona.get("nombre");
        System.out.println("nombre = " + nombre);
        
        String apellido = (String) persona.get("apellido");
        System.out.println("apellido = " + apellido);

        Map<String, String> direccionPersona = (Map<String, String>) persona.get("direccion");
        String pais = direccionPersona.get("pais");
        String ciudad = direccionPersona.get("ciudad");
        // Mostramos un valor por defecto si no existe
        String barrio = direccionPersona.getOrDefault("barrio","La playa");
        System.out.println("El pais de " + nombre + " es: "+ pais);
        System.out.println("La ciudad de " + nombre + " es: "+ ciudad);
        System.out.println("El barrio de " + nombre + " es: "+ barrio);

        // Eliminar
        // clear -> elimina todos los elementos
        // String valorApellido = persona.remove("apellidoPaterno");
        boolean valorApellido = persona.remove("apellidoPaterno","Doe");
        System.out.println("eliminado = "+valorApellido);
        System.out.println("persona = " + persona);
        
        boolean b2 = persona.containsKey("apellidoPaterno");
        System.out.println("b2 = " + b2);
        
        b2 = persona.containsValue("Doe");
        System.out.println("b2 = " + b2);

        System.out.println("========================================= values");
        // Retornar una coleccion
        Collection<Object> valores = persona.values();
        System.out.println(valores);

        System.out.println("========================================= keySet");
        Set<String> llaves = persona.keySet();
        System.out.println(llaves);

        // iterar con pares y valores
        System.out.println("========================================= entrySet");
        for (Map.Entry<String, Object> par: persona.entrySet()){
            System.out.println(par.getKey() + " => "+par.getValue());
        }

        System.out.println("========================================= keySet");
        for (String llave: persona.keySet()){
            Object valor = persona.get(llave);
            if ( valor instanceof Map){
                Map<String, String> direccionMap = (Map<String, String>) valor;
                System.out.println("El pais de " + persona.get("nombre") + " : "+direccionMap.get("pais"));
                System.out.println("La ciudad de" + persona.get("nombre") + " : "+direccionMap.get("ciudad"));
                System.out.println("El barrio de " + persona.get("nombre") + " : "+direccionMap.get("barrio"));
            } else {
                System.out.println(llave + " => " + valor);
            }
        }

        System.out.println("========================================= forEach");
        persona.forEach((llave,valor) -> {
            System.out.println(llave + " => " + valor);
        });


        System.out.println("total : "+persona.size());
        System.out.println("contiene elemento : "+!persona.isEmpty());

        // Reemplazar una valor
        persona.replace("nombre","Andrés");
        boolean b3 = persona.replace("nombre","John","Andrés");
        System.out.println("b3 = " + b3);

    }
}
