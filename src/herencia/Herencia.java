package herencia;
import java.util.Scanner;
public class Herencia {
    public static void main(String[] args) {
        Persona persona1 =  new Persona("Julio", 20 , "Hombre", "Celaya");
        System.out.println (persona1.getNombre() );
        persona1.setEdad(32);
        System.out.println (persona1.getEdad());
        //----------------------------------------------------------------
        Alumno alumno1 = new Alumno(
                "Emilio",//nombre
                22,//edad
                "Hombre",//sexo
                "Celaya",//direccion
                "A001",//clave
                "A",//grupo
                1,//semestre
                "Sistemas"//carrera
        );
        //----------------------------------------------------------------
        System.out.println (alumno1.getCarrera());
        Scanner entrada = new Scanner (System.in);
        String nombre;
        int edad;
        String sexo;
        String direccion;
        String clave;
        String grupo;
        int semestre;
        String carrera;
        
        
        System.out.println("Ingresa el nombre del Alumno:");
        nombre = entrada.next();
        
        System.out.println("Ingresa el edad del Alumno:");
        edad = entrada.nextInt();
        
        System.out.println("Ingresa el sexo del Alumno:");
        sexo = entrada.next();
        
        System.out.println("Ingresa la direccion del Alumno:");
        direccion = entrada.next();
        
        System.out.println("Ingresa la clave del Alumno:");
        clave = entrada.next();
        
        System.out.println("Ingresa el grupo del Alumno:");
        grupo = entrada.next();
        
        System.out.println("Ingresa el semestre del Alumno:");
        semestre = entrada.nextInt();
        
        System.out.println("Ingresa el nombre del Alumno:");
        carrera = entrada.next();
        
        Alumno alumno_nuevo = new Alumno(
        nombre,
        edad,
        sexo,
        direccion,
        clave,
        grupo,
        semestre,
        carrera);
        System.out.println(alumno_nuevo.getNombre());
    } 
}
