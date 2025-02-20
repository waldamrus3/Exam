import java.util.Scanner;

public class App {

    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        Banco bank = new Banco(5);

        // for (int i = 0; i < 6; i++) {

        // System.out.println("----------------------------------------");
        // System.out.println("");
        // System.out.println("Introduce el nombre del titular:");
        // String n1 = sc.next();
        // System.out.println("Introduce el nº de cuenta: ");
        // int nc1 = sc.nextInt();
        // System.out.println("Introduce el saldo de la cuenta: ");
        // double s1 = sc.nextDouble();
        // System.out.println("Introduce el DNI:");
        // String dn1 = sc.next();
        // System.out.println("");
        // System.out.println("----------------------------------------");

        // Cuenta c1 = new Cuenta(n1, nc1, s1, dn1);

        // if (bank.getLimiteAlcanzado() == false) {

        // bank.addCuenta(c1);

        // }
        // }

        Cuenta c1 = new Cuenta("Paco", 1, 560, "3123F");
        Cuenta c2 = new Cuenta("Luis", 5, 100, "53453O");
        Cuenta c3 = new Cuenta("Diego", 10, 3798, "33423G");
        Cuenta c4 = new Cuenta("Sara", 2, 20, "23111K");
        Cuenta c5 = new Cuenta("Carlos", 7, 7, "6434L");

        if (bank.getLimiteAlcanzado() == false) {

            bank.addCuenta(c1);

        }
        if (bank.getLimiteAlcanzado() == false) {

            bank.addCuenta(c2);

        }
        if (bank.getLimiteAlcanzado() == false) {

            bank.addCuenta(c3);

        }
        if (bank.getLimiteAlcanzado() == false) {

            bank.addCuenta(c4);

        }
        if (bank.getLimiteAlcanzado() == false) {

            bank.addCuenta(c5);

        }

        int op = 0;

        while (op != 5) {

            System.out.println("----------------------------------------");
            System.out.println("");
            System.out.println("[1] Buscar por nº de cuenta");
            System.out.println("[2] Salir");
            System.out.println("");
            System.out.println("----------------------------------------");
            System.out.println("");

            op = sc.nextInt();

            if (op == 1) {

                System.out.println("Introduce el nº de cuenta a buscar");
                System.out.println("");
                Cuenta c = bank.buscarCuentaPorClave(sc.nextInt());

                while (c == null) {

                    System.out.println("La cuenta introducida no existe. Por favor introduce otro nº de cuenta:");
                    System.out.println("Introduce el nº de cuenta a buscar");
                    System.out.println("");
                    c = bank.buscarCuentaPorClave(sc.nextInt());

                }

                int opp = 0;

                do {

                    System.out.println("----------------------------------------");
                    System.out.println("");
                    System.out.println("[1] Consultar tus datos de cuenta");
                    System.out.println("[2] Ver saldo");
                    System.out.println("[3] Ingresar dinero");
                    System.out.println("[4] Retirar dinero");
                    System.out.println("");
                    System.out.println("----------------------------------------");
                    System.out.println("");

                    opp = sc.nextInt();

                    switch (opp) {

                        case 1:

                            c.verDatos();
                            System.out.println("");
                            System.out.println(c.toString());

                            break;

                        case 2:

                            System.out.println("Saldo: " + c.getSaldo());

                            break;

                        case 3:

                            System.out.println("Saldo actual: " + c.getSaldo());
                            System.out.println("");
                            System.out.println("Introduce la cantidad que desea introducir:");

                            c1.ingresar(sc.nextDouble());

                            System.out.println("");
                            System.out.println("Nuevo saldo: " + c.getSaldo());

                            break;

                        case 4:

                            System.out.println("Saldo actual: " + c.getSaldo());
                            System.out.println("");
                            System.out.println("Introduce la cantidad que desea retirar:");

                            c1.retirar(sc.nextDouble());

                            System.out.println("");
                            System.out.println("Nuevo saldo: " + c.getSaldo());

                            break;

                        case 5:

                            System.out.println("Cerrando sesión...");
                            System.out.println("");

                            break;
                    }

                } while (opp != 2);

            } else

            if (op == 2) {

                System.out.println("Saliendo...");

            }

        }

    }
}
