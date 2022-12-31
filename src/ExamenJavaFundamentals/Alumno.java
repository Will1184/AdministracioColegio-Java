package ExamenJavaFundamentals;

public class Alumno extends Persona{
    String institucion;
    double notaMatematicas,notasHistorias,notaCastellano, resultado;


 public  Alumno(){
     super();
 }

    public Alumno(String nombre, String apellido, String email, int edad, String institucion, double notaMatematicas, double notasHistorias, double notaCastellano) {
        super(nombre, apellido, email, edad);
        this.institucion = institucion;
        this.notaMatematicas = notaMatematicas;
        this.notasHistorias = notasHistorias;
        this.notaCastellano = notaCastellano;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotaMatematicas() {
        return notaMatematicas;
    }

    public void setNotaMatematicas(double notaMatematicas) {
        this.notaMatematicas = notaMatematicas;
    }

    public double getNotasHistorias() {
        return notasHistorias;
    }

    public void setNotasHiatorias(double notasHiatorias) {
        this.notasHistorias = notasHiatorias;
    }

    public double getNotaCastellano() {
        return notaCastellano;
    }

    public void setNotaCastellano(double notaCastellano) {
        this.notaCastellano = notaCastellano;
    }


    public  double calcularPromedio() {

        return (notaCastellano+notaMatematicas+notasHistorias)/3;
    }

    @Override
    public String toString() {
        return super.toString()+" Es: Alumno, "+
                "Institucion: " + institucion +
                ", Nota Matematicas: " + notaMatematicas +
                ", Nota Historias: " + notasHistorias +
                ", Nota Castellano: " + notaCastellano +
                ", Promedio: " + calcularPromedio() +
                ". Saludo: "+saludar()+"";
    }

    public String saludar() {

        return "Hola a todos, Bienvenidos";
    }
}
