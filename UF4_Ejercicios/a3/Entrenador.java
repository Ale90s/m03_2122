public class Entrenador extends Persona {

    private int edad;
    private int idFederacion;

    public Entrenador(int id, String nombre, String apellidos, int edad, int dorsal, int demarcacion) {
        super(id, nombre, apellidos, edad);
        this.edad = dorsal;
        this.idFederacion = demarcacion;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getIdFederacion() {
        return this.idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }
}