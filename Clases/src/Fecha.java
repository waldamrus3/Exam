import java.util.Arrays;

public class Fecha {

    private int dia;
    private int mes;
    private int anio;
    private String[] nombre = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
            "Octubre", "Noviembre", "Diciembre" };

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public Fecha() {
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void verFecha() {

        System.out.println("");
        System.out.println(dia + " / " + mes + " / " + anio);
        System.out.println("");

    }

    public String formatear() {

        String ret = dia + " / " + mes + " / " + anio;

        return ret;

    }

    public boolean bisiesto() {

        boolean esBisiesto = false;

        int aux = getAnio();

        if (aux % 4 == 0) {

            esBisiesto = true;

            System.out.println("El año " + aux + " es bisiesto.");

        } else {

            System.out.println("El año " + aux + " no es bisiesto.");

        }

        return esBisiesto;

    }

    public int diferenciaDias(int day, int month, int year) {

        int month2 = month * 30;
        int year2 = year * 365;

        int diasM = mes * 30;
        int diasA = anio * 365;

        int total1 = (diasA + dia + diasM);
        int total2 = (day + month2 + year2);

        int cantidad = (total1 - total2);

        if (cantidad < 0) {

            cantidad = cantidad * -1;

        }

        System.out.println("Hay " + cantidad + " días de diferencia.");

        return cantidad;

    }

    public boolean nombreMes() {

        boolean acertado = false;

        for (int i = 0; i <= nombre.length; i++) {

            if (mes == i) {

                String nombremes = nombre[i - 1];
                System.out.println(nombremes);
                acertado = true;
            }

        }

        return acertado;

    }

    // Con este método sobreescribimos el metodo 'equals' para que pueda comparar
    // las fechas (Objetos String)
    // y no salga false, pues con el metodo equals normal saldria false debido a que
    // detecta que son objetos
    // distintos (?).

    @Override
    public boolean equals(Object obj) {

        Fecha aux = (Fecha) obj;

        if (this.mes == aux.getMes() && this.dia == aux.getDia() && this.anio == aux.getAnio()) {
            System.out.println("Las fechas son iguales");

            return true;

        } else {

            System.out.println("Las fechas no son iguales");
            return false;

        }
    }

    @Override
    public String toString() {
        return "Fecha --> dia: " + dia + ", mes: " + mes + ", anio: " + anio + ", nombre: " + Arrays.toString(nombre)
                + "]";
    }

}
