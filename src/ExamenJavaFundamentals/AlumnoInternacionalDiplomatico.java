package ExamenJavaFundamentals;

public class AlumnoInternacionalDiplomatico extends Alumno{



    public AlumnoInternacionalDiplomatico(String nombre, String apellido, String email, int edad, String institucion, double notaMatematicas, double notasHistorias, double notaCastellano) {
        super(nombre, apellido, email, edad, institucion, notaMatematicas, notasHistorias, notaCastellano);
    }

    @Override
    public String toString() {
        return "Este Alumno es \" Alumno internacional diplomatico.\" "+super.toString();
    }
}
