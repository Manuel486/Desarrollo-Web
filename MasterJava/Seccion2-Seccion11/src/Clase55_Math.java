public class Clase55_Math {
    public static void main(String[] args) {
        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);
        
        absoluto = Math.abs(3);
        System.out.println("absoluto = " + absoluto);
        
        double max = Math.max(3.5,1.2);
        System.out.println("max = " + max);

        double min = Math.min(3.5,1.2);
        System.out.println("min = " + min);
        
        double techo = Math.ceil(3.5); // Redondea hacia arriba
        System.out.println("techo = " + techo);
        
        double piso = Math.floor(3.5); // Redondea hacia abajo
        System.out.println("piso = " + piso);

        long redondear = Math.round(Math.PI); // Retorna un entero, si es 3.5 o mayor toma el valor de arriba
        System.out.println("redondear = " + redondear);

        double exp = Math.exp(2);
        System.out.println("exp = " + exp);
        
        double log = Math.log(10);
        System.out.println("log = " + log);
        
        double potencia = Math.pow(10,3);
        System.out.println("potencia = " + potencia);

        double raiz = Math.sqrt(5);
        System.out.println("raiz = " + raiz);

        double grados = Math.toDegrees(1.57);
        grados = Math.round(grados);
        System.out.println("Convertir de radianes a grados = " + grados);

        double radianes = Math.toRadians(90.00);
        System.out.println("Convertir grados a radianes = "+radianes);


        System.out.println("sin(90) : "+Math.sin(radianes));
        System.out.println("cos(90) : "+Math.cos(radianes));


        radianes = Math.toRadians(180);
        System.out.println("cos(180): "+Math.cos(radianes));

        radianes = Math.toRadians(0.00);
        System.out.println("cos(0) = " + radianes);
    }
}
