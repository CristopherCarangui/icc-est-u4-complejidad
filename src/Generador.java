import java.util.ArrayList;
import java.util.List;

public class Generador {
    public static List<Estudiante> generarEstudiantes(int cantidadEstudiantes){
        List<Estudiante> estudiantes = new ArrayList<>();
        for (int i = 0 ; i< cantidadEstudiantes;i++){//Hace la caintidad de la variable que declaro
            //Hace texto al numero
            String cedula = i+"";// i = 0 -> +"" i= "0"
            String nombre = "Estudiante_"+i;//Se guarda en texto  = "Estudiante_8"
            Estudiante estudiante = new Estudiante(nombre,cedula);
            estudiantes.add(estudiante); 
        }
        return estudiantes;
    }
}
