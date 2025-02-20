import java.util.Arrays;

public class Banco {

    private Cuenta[] cuentas;

    private boolean limiteAlcanzado;

    // si limite es falso puedo añadir cuentas
    // si limite el true el banco está completo

    // public Banco(Cuenta[] cuentas) {
    // this.cuentas = cuentas;
    // }

    public Banco(int nMax) {
        this.cuentas = new Cuenta[nMax];
        this.limiteAlcanzado = false;
    }

    public boolean getLimiteAlcanzado() {
        return limiteAlcanzado;
    }

    public void addCuenta(Cuenta c) {

        for (int i = 0; i < cuentas.length; i++) {

            if (cuentas[i] == null) {

                cuentas[i] = c;

                if (i == cuentas.length - 1) {
                    limiteAlcanzado = true;
                }

                break; // si no ponemos este break, rellenará todos los huecos del array con la misma
                       // cuenta en la primera
                       // vuelta del programa, ya que al empezar todos los huecos serán "null" y
                       // cumplirá la condición.
            }

        }

    }

    public Cuenta buscarCuentaPorClave(int nCuenta) {

        for (int i = 0; i < cuentas.length; i++) {

            if (cuentas[i].getNumCuenta() == nCuenta) {

                System.out.println(cuentas[i]);
                return cuentas[i];

            }

        }

        return null;

    }

    @Override
    public boolean equals(Object obj) {

        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Banco\nCuentas: " + Arrays.toString(cuentas) + "\nLimite Alcanzado: " + limiteAlcanzado;
    }

}
