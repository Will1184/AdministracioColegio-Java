package ExamenJavaFundamentals;

public class AlumnoInternacional extends Alumno {
    String pais;
    double notaIdiomas;


public AlumnoInternacional(){

}

    public AlumnoInternacional(String nombre, String apellido, String email, int edad, String institucion, double notaMatematicas, double notasHiatorias, double notaCastellano, String pais, double notaIdiomas) {
        super(nombre, apellido, email, edad, institucion, notaMatematicas, notasHiatorias, notaCastellano);
        this.pais = pais;
        this.notaIdiomas = notaIdiomas;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaIdiomas() {
        return notaIdiomas;
    }

    public void setNotaIdiomas(double notaIdiomas) {
        this.notaIdiomas = notaIdiomas;
    }

    public  double calcularPromedio() {
        return (notaCastellano+notaMatematicas+notasHistorias+notaIdiomas)/4;

    }

    @Override
    public String toString() {
        return super.toString()+
                " pais: " + pais ;
    }

    public String saludar() {

        return "Hello everyone, I love this country, thanks for all";
    }
}
