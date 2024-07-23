public class Clase57_ArgumentosLineaComando {


    public static void main(String[] args) {

        // javac es el compilador para generar el bytecode, es necesario agregar el .java
        // java es el render para ejecutar nuestras aplicaciones, no es necesario el .java

        if(args.length == 0 ){
            System.err.println("Debe ingresar argumentos!");
            System.exit(-1);
            // 1  -> cuando ocurre una excepcion
            // 0  -> cuando todo sale bien
            // -1 -> cuando sale un error
        }

        for (int i=0;i<args.length;i++){
            System.out.println("Argumentos nro : "+i+":"+args[i]);
        }
    }
}
