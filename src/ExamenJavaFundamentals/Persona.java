package ExamenJavaFundamentals;

public  abstract class Persona {
    private   String nombre, apellido,email;
    private Integer  edad;


    public Persona() {
    }

    public Persona(String nombre, String apellido, String email, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public abstract String saludar();

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                ", Apellido: " + apellido  +
                ", Email: " + email  +
                ", Edad: " + edad +" Años ,";
    }
}
