public class Clase58_ArgumentoLineaComandoCalculadora {
    public static void main(String[] args) {

        // Pasos para ejecutar en consola
        // javac .\Clase58_ArgumentoLineaComandoCalculadora.java -encoding utf8
        // java Clase58_ArgumentoLineaComandoCalculadora div 20 0

        if(args.length!=3){
            System.err.println("Por favor Ingresar una " +
                    "operación (Suma,resta,div o multi) y dos enteros");
            System.exit(-1);
        }

        String operacion = args[0];
        int a = 0;
        int b = 0;
        double resultado = 0.00;
        try {
            a = Integer.parseInt(args[1]);
            b = Integer.parseInt(args[2]);
        }catch(NumberFormatException e){
            System.err.println("Cuidado a y b deben ser enteros");
        }
        switch (operacion){
            case "suma":
                resultado = a-b;
                break;
            case "resta":
                resultado = a-b;
                break;
            case "div":
                if(b==0){
                    System.err.println("No se puede dividir por cero");
                    System.exit(-1);
                }
                resultado = (double)a/b;
                break;
            default:
                resultado=a+b;
        }

        System.out.println("Resultado de la operación : "+operacion+ " => "+resultado);
    }
}
