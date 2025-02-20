public class Contacto implements Comparable<Contacto> {

    private String nombre;
    private int telefono;
    private String correo;
    private Fecha cumpleanios;

    public Contacto(String nombre, int telefono, String correo, Fecha cumpleanios) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.cumpleanios = cumpleanios;
    }

    public Contacto(String correo, Fecha cumpleanios, String nombre, int telefono) {
        this.correo = correo;
        this.cumpleanios = null;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Fecha getCumpleanios() {
        return cumpleanios;
    }

    public void setCumpleanios(Fecha cumpleanios) {
        this.cumpleanios = cumpleanios;
    }

    @Override
    public String toString() {
        return "-- Contacto --\nNombre: " + nombre + "\nTeléfono: " + telefono + "\nCorreo: " + correo
                + "\nCumpleaños: "
                + cumpleanios;
    }

    @Override
    public boolean equals(Object obj) {

        Contacto aux = (Contacto) obj;

        return this.nombre.equals(aux.getNombre());
    }

    @Override
    public int compareTo(Contacto c) {

        String n1 = this.getNombre();
        String n2 = c.getNombre();

        if (n1.compareTo(n2) < 0) {

            return -1;

        } else if (n1.compareTo(n2) > 0) {

            return 1;

        } else {

            return 0;

        }
    }

}
