public class Evento implements Comparable<Evento> {

    private String nombreEvento;
    private String descripcion;
    private Fecha fechaEvento;

    public Evento(String nombreEvento, String descripcion, Fecha fechaEvento) {
        this.nombreEvento = nombreEvento;
        this.descripcion = descripcion;
        this.fechaEvento = fechaEvento;
    }

    @Override
    public String toString() {
        return "Evento:\nNombre -> " + nombreEvento + "\nDescripcion -> " + descripcion + "\nFecha del evento -> "
                + fechaEvento;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Fecha getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(Fecha fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    @Override
    public int compareTo(Evento c) {

        Fecha f1 = this.getFechaEvento();
        Fecha f2 = c.getFechaEvento();

        if (f1.compareTo(f2) == 0) { // f1.equals(f2)
            // las fechas son iguales, comparo por nombre
            String n1 = this.getNombreEvento();
            String n2 = c.getNombreEvento();

            return n1.compareToIgnoreCase(n2);

        } else {
            return f1.compareTo(f2);
        }

    }

}
