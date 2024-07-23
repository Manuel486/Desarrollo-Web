import java.util.Random;

public class Clase56_Random {
    public static void main(String[] args) {

        String[] colores = {"azul","amarillo","rojo","verde","blanco","negro"};
        double random = Math.random(); // retorna solo double entre 0 y 1
        System.out.println("random = " + random);

        random*= colores.length;

        System.out.println("random = " + random);

        // En este caso esta bien redondear hacia abajo para que no tome como indice el valor 6
        random = Math.floor(random);

        System.out.println("random = " + random);

        System.out.println("colores = " + colores[(int) random]);

        Random randomObj = new Random();
        int randomInt = 15 + randomObj.nextInt(25-15+1); // -2^32 < x < 2^32 por defecto
                                                               // iria de 15 a 25
        // si le agrego un parametro ej = 7 solo iria de 0 a 6
        System.out.println("randomInt = " + randomInt);;

        randomInt = randomObj.nextInt(colores.length);
        System.out.println("colores = " + colores[randomInt]);
    }
}
