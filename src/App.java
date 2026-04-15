import java.util.List;
public class App {
    public static void main(String[] args) throws Exception {
       int cantidadEstudiantes = 60000000;
       int cantidadConsultas = 40000;
        
       System.out.println("Generando Estudiantes...");

       List<Estudiante> estudiantes = Generador.generarEstudiantes(cantidadEstudiantes);
    //    for(Estudiante est : estudiantes ){
    //     System.out.println(est.nombre);
    //    }

       //Buscas si existe el usuario con CI 1999993
       String cedulaBuscar = "51999993";
       for (Estudiante est : estudiantes){
        if (est.cedula.equals(cedulaBuscar) ){
            System.out.println("Existe");
            break;
        }
       }

    //    int inicio = 0;
    //    int fin = estudiantes.size()-1;
    //    while(inicio<= fin){
    //     int medio = (inicio+fin)/2;
    //     Estudiante  actual = estudiantes.get(medio); //Solo coge el del medio 
    //     int comparacion = actual.cedula.compareTo(cedulaBuscar);//Comapra conla cedula que estoy buscando 
    //     if (comparacion == 0){
    //         System.out.println("Existe");
    //         break;
    //     }else if(comparacion<0) {
    //         inicio = medio+1;
    //     }else{
    //         fin = medio-1;
    //     }
    //    }
    }
    // ESP cntrl+}] comentar y descomentar
    // ENG cntrl+/
}
