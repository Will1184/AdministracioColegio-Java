import ExamenJavaFundamentals.*;

import java.util.ArrayList;

public class EjemploHerencia {


    public static void main(String[] args) {

        Profesor profesor1 =new Profesor("Juan","Sandoval","JuanLuisMatematicas@gmail.com",40,"Matematicas");
        System.out.println(imprimirPersona(profesor1));
        Alumno alumno1=new Alumno("Brandon", "William", "brandonwilliammg@gmail.com", 16, "Liceo Cristiano Reverendo Juan Bueno", 8, 7, 6);
        System.out.println(imprimirPersona(alumno1));
        alumno1=(new AlumnoInternacional("George", "Washington", "georgeWashngtonisthebest@gmail.com", 17, "Liceo Cristiano Reverendo Juan Bueno", 8, 7, 6,"Estados Unidos", 9));
        System.out.println(imprimirPersona(alumno1));
        alumno1=(new AlumnoInternacionalDiplomatico("Julia", "Smith", "TheloveisWar@gmail.com", 18, "Liceo Cristiano Reverendo Juan Bueno", 10, 10, 10));
        System.out.println(imprimirPersona(alumno1));
    }
      static Persona imprimirPersona(Persona persona){
        return persona;
    }
}
/*ArrayList<Alumno> alumnos = new ArrayList<>();
        ArrayList<Profesor> profesores=new ArrayList<>();
        alumnos.add(new Alumno("Brandon", "William", "brandonwilliammg@gmail.com", 16, "Liceo Cristiano Reverendo Juan Bueno", 8, 7, 6));
        alumnos.add(new AlumnoInternacional("George", "Washington", "georgeWashngtonisthebest@gmail.com", 17, "Liceo Cristiano Reverendo Juan Bueno", 8, 7, 6,"Estados Unidos", 9));
        alumnos.add(new AlumnoInternacional("Salma", "Reina", "salmaReinaUSA@gmail.com", 17, "Liceo Cristiano Reverendo Juan Bueno", 5, 7, 10,"Estados Unidos", 9.5));
        profesores.add(new Profesor("Juan","Luis","JuanLuisMatematicas@gmail.com",40,"Matematicas"));
        imprimirPersona(alumnos,profesores);
        */