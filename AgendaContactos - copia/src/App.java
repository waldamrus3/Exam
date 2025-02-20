
import java.util.Scanner;

public class App {

    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        Agenda a = new Agenda();

        int op = 0;

        do {

            System.out.println("+-------------------------+");
            System.out.println("| ->     CONTACTOS     <- |");
            System.out.println("|  [1] Añadir contacto    |");
            System.out.println("|  [2] Eliminar contacto  |");
            System.out.println("|  [3] Listar contactos   |");
            System.out.println("+-------------------------+");
            System.out.println("| ->      EVENTOS      <- |");
            System.out.println("|  [4] Añadir evento      |");
            System.out.println("|  [5] Borrar evento      |");
            System.out.println("|  [6] Listar eventos     |");
            System.out.println("+-------------------------+");
            System.out.println("|  [7] Ordenar contactos  |");
            System.out.println("|  [8] SALIR              |");
            System.out.println("|  [9] Eventos por fecha  |");
            System.out.println("+-------------------------+");
            System.out.println("|  [10] Eventos por desc. |");
            System.out.println("|  [11] OrdenarContactos2 |");
            System.out.println("+-------------------------+");

            op = sc.nextInt();

            switch (op) {

                case 1:

                    System.out.println("Introduce el nombre de tu contacto:");
                    String name = sc.next();
                    System.out.println("Introduce un nº de teléfono:");
                    int num = sc.nextInt();
                    System.out.println("Introduce una dirección de correo:");
                    String mail = sc.next();
                    System.out.println("Introduce el cumpleaños:");
                    System.out.println("- Día:");
                    int day = sc.nextInt();
                    System.out.println("- Mes:");
                    int month = sc.nextInt();
                    System.out.println("- Year:");
                    int year = sc.nextInt();

                    Fecha cumple = new Fecha(day, month, year);

                    Contacto contacto = new Contacto(name, num, mail, cumple);

                    a.addContacto(contacto);

                    // contacto.toString();
                    // System.out.println(contacto);

                    break;

                case 2:

                    System.out.println("Introduce el nombre del contacto a eliminar:");

                    a.borrarContacto(sc.next());

                    break;

                case 3:

                    a.listarContactos();

                    break;

                case 4:

                    System.out.println("Introduce el nombre del evento:");
                    String nomEv = sc.next();
                    System.out.println("Introduce una breve descripción del evento:");
                    String descEv = sc.next();
                    System.out.println("Introduce la fecha del evento:");
                    System.out.println("- Día:");
                    int diaEv = sc.nextInt();
                    System.out.println("- Mes:");
                    int mesEv = sc.nextInt();
                    System.out.println("- Año:");
                    int anioEv = sc.nextInt();

                    Fecha fechaEvento = new Fecha(diaEv, mesEv, anioEv);

                    Evento ev = new Evento(nomEv, descEv, fechaEvento);

                    a.addEvento(ev);

                    break;

                case 5:

                    System.out.println("Introduce el nombre del evento a borrar:");

                    a.eliminarEvento(sc.next());

                    break;

                case 6:

                    a.listarEventos();

                    break;

                case 7:

                    a.ordenarListaContactos();

                    break;

                case 8:

                    System.out.println("Introduce la fecha del evento a buscar:");
                    int d = sc.nextInt();
                    int m = sc.nextInt();
                    int an = sc.nextInt();

                    Fecha f = new Fecha(d, m, an);

                    boolean hayEventos = a.mostrarEventosPorFecha(f);
                    if (hayEventos == false) {
                        System.out.println("No hay eventos programados para este día.");
                    }

                    break;

                case 9:

                    a.ordenarEventoPorNombre();

                    break;

                case 10:

                    a.ordenarEventosPorDescripcion();

                    break;

                case 11:

                    System.out.println("Elige cómo quieres ordenar:");
                    System.out.println("[1] De la A a la Z");
                    System.out.println("[2] De la Z a la A");
                    System.out.println("[3] Por Teléfono");
                    System.out.println("[4] Por cumpleaños");
                    int eleccion = sc.nextInt();

                    switch (eleccion) {
                        case 1:

                            ComparadorContacto c1 = new ComparadorContacto(ComparadorContacto.Parametros.NOMBRE);
                            a.ordenarContactosNew(c1, false);

                            break;

                        case 2:

                            ComparadorContacto c2 = new ComparadorContacto(ComparadorContacto.Parametros.NOMBRE);
                            a.ordenarContactosNew(c2, true);

                            break;

                        case 3:

                            ComparadorContacto c3 = new ComparadorContacto(ComparadorContacto.Parametros.TELEFONO);
                            a.ordenarContactosNew(c3, false);

                        case 4:

                            ComparadorContacto c4 = new ComparadorContacto(ComparadorContacto.Parametros.CUMPLEANOS);
                            a.ordenarContactosNew(c4, false);
                    }

                    break;

                case 12:

                    System.out.println("Indica cómo quieres ordenar:");
                    System.out.println("[1]");
                    int eleccion2 = sc.nextInt();
                    switch (eleccion2) {
                        case 1:

                            ComparadorEvento.Parametros p1 = ComparadorEvento.Parametros.NOMBRE;
                            a.ordenarEventosNew(p1, false);

                            break;
                        default:
                            throw new AssertionError();
                    }

                    break;
            }

        } while (op != 13);
    }
}
