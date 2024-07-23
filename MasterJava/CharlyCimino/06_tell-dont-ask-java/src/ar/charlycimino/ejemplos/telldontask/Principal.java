package ar.charlycimino.ejemplos.telldontask;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Principal {

    public static void main(String[] args) {

        Motor m = new Motor("12345", 1.6, "Nafta");
        Auto auto = new Auto("XYZ456", "Tiaf", 34136, "Verde", m);

        System.out.println(auto);
//        auto.getMotor().setRpmActuales(auto.getMotor().getRpmActuales() + 1000);
        auto.acelerar();
        System.out.println(auto);
//        auto.getMotor().setRpmActuales(auto.getMotor().getRpmActuales() + 1000);
        auto.acelerar();
        System.out.println(auto);

    }

}
