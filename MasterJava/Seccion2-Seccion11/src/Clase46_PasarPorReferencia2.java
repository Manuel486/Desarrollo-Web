class Persona {
    private String nombre;
    public void modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public String leerNombre(){
        return this.nombre;
    }
}

public class Clase46_PasarPorReferencia2 {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.modificarNombre("Manuel");

        System.out.println("iniciamos el método main = ");
        System.out.println("persona.nombre = "+persona.leerNombre());
        System.out.println("Antes de llamar al método test");
        test(persona);
        System.out.println("Despúes de llamar al método test");
        System.out.println("persona.nombre = "+persona.leerNombre());
        System.out.println("Finaliza el método main con los datos del arreglo modificados");
    }

    public static void test(Persona persona){
        System.out.println("Iniciamos el metodo test");
        persona.modificarNombre("Pepe");
        System.out.println("Finaliza el método test");
    }
}
