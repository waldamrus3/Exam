import java.util.Scanner;

public class App {

    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        // -------------------------------------------------------------------------------

        // Ejemplo para utilizar el metodo 'equals' modificado o reescrito (@Override)
        // en la clase Fecha

        Fecha ff1 = new Fecha(2, 4, 1999);
        Fecha ff2 = new Fecha(2, 4, 1999);

        // System.out.println(ff1);
        // System.out.println(ff2);

        boolean iguales = ff1.equals(ff2);
        System.out.println(iguales);

        // -------------------------------------------------------------------------------

        System.out.println("Introduce el día:");
        int day = sc.nextInt();
        while (day > 30 || day < 0) {
            System.out.println("Máximo 30, minimo 1, introduce el día de nuevo:");
            day = sc.nextInt();
        }
        System.out.println("Introduce el mes:");
        int month = sc.nextInt();
        while (month > 12 || month < 1) {
            System.out.println("Máximo 12, mínimo 0, introduce el mes de nuevo:");
            month = sc.nextInt();
        }
        System.out.println("Introduce el año:");
        int year = sc.nextInt();

        Fecha f1 = new Fecha(day, month, year);

        // PRIMERA FORMA
        f1.verFecha();
        f1.nombreMes();

        // SEGUNDA FORMA
        String fechaformateada = f1.formatear();
        System.out.println(fechaformateada);

        f1.bisiesto();

        System.out.println("Introduce el día:");
        int day1 = sc.nextInt();
        while (day1 > 30) {
            System.out.println("Máximo 30, introduce el día de nuevo:");
            day1 = sc.nextInt();
        }
        System.out.println("Introduce el mes:");
        int month1 = sc.nextInt();
        while (month1 > 12) {
            System.out.println("Máximo 12, introduce el mes de nuevo:");
            month1 = sc.nextInt();
        }
        System.out.println("Introduce el año:");
        int year1 = sc.nextInt();

        Fecha f2 = new Fecha(day, month, year);

        f1.diferenciaDias(day1, month1, year1);
    }
}
