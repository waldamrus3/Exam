public class Cuenta {

    private String titular;
    private int numCuenta;
    private double saldo;
    private String dni;

    public Cuenta(String titular, int numCuenta, double saldo, String dni) {
        this.titular = titular;
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.dni = dni;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void verDatos() {

        System.out.println("Titular:      " + titular);
        System.out.println("Nº de cuenta: " + numCuenta);
        System.out.println("Saldo:        " + saldo);
        System.out.println("DNI:          " + dni);

    }

    // public void verSaldo() {

    // System.out.println("Saldo: " + saldo);

    // }

    public double ingresar(double ingresado) {

        saldo = saldo + ingresado;

        return saldo;

    }

    public boolean retirar1(double retirado) {

        if (retirado <= saldo) {

            saldo = saldo - retirado;
            return true;

        } else {

            return false;

        }

    }

    public double retirar(double retirado) {

        if (retirado > saldo) {

            System.out.println("No hay dinero suficiente.");

        } else {

            saldo = saldo - retirado;

        }

        return saldo;

    }

    @Override
    public boolean equals(Object obj) {

        Cuenta aux = (Cuenta) obj;

        if (this.numCuenta == aux.getNumCuenta()) {

            return true;

        } else {

            return false;

        }
    }

    @Override
    public String toString() {
        return "Cuenta\nTitular: " + this.titular + "\nNº Cuenta: " + this.numCuenta + "\nSaldo: " + this.saldo
                + "\nDNI: " + this.dni;
    }

}
