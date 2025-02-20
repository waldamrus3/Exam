import java.util.Scanner;

public class App {

    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        System.out.println("Introduce el nombre del titular:");
        String n1 = sc.next();
        System.out.println("Introduce el nº de cuenta: ");
        int nc1 = sc.nextInt();
        System.out.println("Introduce el saldo de la cuenta: ");
        double s1 = sc.nextDouble();
        System.out.println("Introduce el DNI:");
        String dn1 = sc.next();

        Cuenta c1 = new Cuenta(n1, nc1, s1, dn1);

        int op = 0;

        while (op != 5) {

            System.out.println("----------------------------------------");
            System.out.println("");
            System.out.println("[1] Consultar datos de la cuenta:");
            System.out.println("[2] Ver saldo de la cuenta:");
            System.out.println("[3] Ingresar dinero");
            System.out.println("[4] Retirar dinero");
            System.out.println("[5] Salir");
            System.out.println("");
            System.out.println("----------------------------------------");
            System.out.println("");

            op = sc.nextInt();

            if (op == 1) {

                c1.verDatos();
                System.out.println("");
                System.out.println(c1.toString());

            } else

            if (op == 2) {

                System.out.println("Saldo: " + c1.getSaldo());

            } else

            if (op == 3) {

                System.out.println("Saldo actual: " + c1.getSaldo());
                System.out.println("");
                System.out.println("Introduce la cantidad que desea introducir:");

                c1.ingresar(sc.nextDouble());

                System.out.println("");
                System.out.println("Nuevo saldo: " + c1.getSaldo());

            } else

            if (op == 4) {

                System.out.println("Saldo actual: " + c1.getSaldo());
                System.out.println("");
                System.out.println("Introduce la cantidad que desea retirar:");

                c1.retirar(sc.nextDouble());

                System.out.println("");
                System.out.println("Nuevo saldo: " + c1.getSaldo());

            } else

            if (op == 5) {

                System.out.println("Vuelva pronto.");

            }

        }

    }
}
