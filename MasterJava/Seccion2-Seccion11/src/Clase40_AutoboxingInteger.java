public class Clase40_AutoboxingInteger {

    public static void main(String[] args) {

        // Autoboxing es el proceso de conversión automática que realiza el compilador de Java
        // para que un tipo primitivo pase a ser un objeto utilizando para ello su clase
        // de envoltura(Wrapper)

        Integer[] enteros = {Integer.valueOf(1), 2, 3, 4, 5, 6, 7,
                8, 9, 10, 11, 12, 13, 14, 15};

        int suma = 0;

        for(Integer i: enteros){
            if(i.intValue() % 2 == 0){
                suma += i.intValue();
            }
        }
        System.out.println("suma = " + suma);

        suma = 0;
        for(Integer i: enteros){
            if(i % 2 == 0){
                suma += i;
            }
        }
        System.out.println("suma = " + suma);
    }
}
