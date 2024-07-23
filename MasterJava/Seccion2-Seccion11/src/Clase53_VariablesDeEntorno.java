import java.util.Map;

public class Clase53_VariablesDeEntorno {
    public static void main(String[] args) {
        // Un mapa es un arreglo asociativo, asocia valores que estan guardados con un nombre, se le conoco como
        // llave y valor
        Map<String,String> varEnv = System.getenv();
        System.out.println("Varibles de ambiente del sistema = " + varEnv);

        System.out.println("-------- Listando variables de entorno del sistema --------");
        for (String key: varEnv.keySet()){
            System.out.println(key + " => "+ varEnv.get(key));
        }
        
        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);
        
        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);
        
        String timeDir = System.getenv("TEMP");
        System.out.println("timeDir = " + timeDir);
        
        String path = System.getenv("Path");
        System.out.println("path = " + path);

        String path2 = varEnv.get("Path");
        System.out.println("path2 = " + path2);
    }
}
