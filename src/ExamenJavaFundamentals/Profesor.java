package ExamenJavaFundamentals;

public class Profesor extends Persona{
    String asignatura;

    public Profesor(String nombre, String apellido, String email, int edad, String asignatura) {
        super(nombre, apellido, email, edad);
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String toString() {
        return super.toString()+" Es: Profesor, "+
                "asignatura: " + asignatura  +" Saludo"+saludar();
    }

    public String saludar() {
        return "Buenas Tardes Alumnos";
    }

}
