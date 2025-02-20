
import java.util.Scanner;

public class App {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        AparatoElectrico lavadora = new AparatoElectrico(1500);
        AparatoElectrico microondas = new AparatoElectrico(500);
        AparatoElectrico radiador = new AparatoElectrico(370);

        // AGREGAMOS LOS DISPOSITIVOS A LA LISTA
        AparatoElectrico.agregarAparatos(radiador);
        AparatoElectrico.agregarAparatos(lavadora);
        AparatoElectrico.agregarAparatos(microondas);

        int op = 0;

        while (op != 5) {

            System.out.println("-----------------------------------------------");
            System.out.println("             APARATOS ELÉCTRICOS");
            System.out.println("[1] Encender o apagar un dispositivo.");
            System.out.println("[2] Ver actividad de los dispositivos.");
            System.out.println("[3] Ver consumo total de los dispositivos.");
            System.out.println("-----------------------------------------------");
            System.out.println("");

            op = sc.nextInt();

            switch (op) {

                case 1:

                    int opp = 0;
                    System.out.println("Selecciona el dispositivo:");
                    System.out.println("[1] Lavadora.");
                    System.out.println("[2] Microondas.");
                    System.out.println("[3] Radiador.");
                    System.out.println("");
                    opp = sc.nextInt();

                    AparatoElectrico.encendidoOApagado(opp);

                    break;

                case 2:

                    AparatoElectrico.verDispositivosEncendidos();

                    break;

            }

        }

    }
}
