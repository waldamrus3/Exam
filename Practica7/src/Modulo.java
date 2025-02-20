public class Modulo {

    private String nombreAsignatura;
    private int codigoAsignatura;

    public int getCodigoAsignatura() {
        return codigoAsignatura;
    }

    public Modulo(String nombreAsignatura, int codigoAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
        this.codigoAsignatura = codigoAsignatura;
    }

    @Override
    public String toString() {
        return this.nombreAsignatura + ", " + this.codigoAsignatura;
    }

    @Override
    public boolean equals(Object obj) {
        
        Modulo aux = (Modulo)obj;
        if (this.codigoAsignatura == aux.getCodigoAsignatura()) {

            return true;

        }
        return false;
    }

    

}
