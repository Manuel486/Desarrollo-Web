/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package centroeducativo;

/**
 *
 * @author Manuel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CentroEducativo c = new CentroEducativo();
        
        Alumno pepe = new Alumno("123", "Fulano", "Pepe");
        Alumno maria = new Alumno("124", "Mengano", "Maria");
        Alumno luis = new Alumno("125", "Sultano", "Luis");
        
        pepe.agregarExamen(new ExamenEscrito(40, 7, "00/00/0000"));
        pepe.agregarExamen(new ExamenOral(NivelSatisfaccion.SUFICIENTE, "00/00/0000"));
        
        maria.agregarExamen(new ExamenEscrito(60, 4, "00/00/0000"));
        maria.agregarExamen(new ExamenEscrito(65, 8, "00/00/0000"));
        maria.agregarExamen(new ExamenOral(NivelSatisfaccion.EXCELENTE, "00/00/0000"));
        
        luis.agregarExamen(new ExamenEscrito(100, 9, "00/00/0000"));       
        luis.agregarExamen(new ExamenOral(NivelSatisfaccion.INSUFICIENTE, "00/00/0000"));
        luis.agregarExamen(new ExamenOral(NivelSatisfaccion.EXCELENTE, "00/00/0000"));
        
        c.agregarAlumno(pepe);
        c.agregarAlumno(maria);
        c.agregarAlumno(luis);
        
        System.out.println("Cantidad de aprobados: " + c.cantAprobados());
    }
    
}
