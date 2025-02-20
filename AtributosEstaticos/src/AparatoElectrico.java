import java.util.ArrayList;

public class AparatoElectrico {

    private static double potencia;
    private boolean encendido;

    private static ArrayList<AparatoElectrico> APARATOS = new ArrayList<>();

    private static double consumoTotal;

    public AparatoElectrico(double potencia) {

        this.potencia = potencia;
        this.encendido = false;
        APARATOS.add(this);

    }

    public static void agregarAparatos(AparatoElectrico aparato) {

        APARATOS.add(aparato);

    }

    public static void encendidoOApagado(int n) {

        for (int i = 0; i < APARATOS.size(); i++) {

            if (APARATOS.get(n).encendido == true) {

                APARATOS.get(n).encendido = false;
                System.out.println("Has apagado el dispositivo.");
                consumoTotal += potencia;
                break;

            } else if (APARATOS.get(n).encendido == false) {

                APARATOS.get(n).encendido = true;
                System.out.println("Has encendido el dispositivo.");
                consumoTotal -= potencia;
                break;

            } else {

                System.out.println("Dispositivo no encontrado.");

            }

        }

    }

    public static void apagon() {

        for (int i = 0; i < APARATOS.size(); i++) {

            APARATOS.get(i).encendido = false;

        }

    }

    public static void verDispositivosEncendidos() {

        for (int i = 0; i < APARATOS.size(); i++) {

            if (APARATOS.get(i).encendido == true) {

                System.out.println("Dispositivo con potencia de " + APARATOS.get(i).potencia + " está encendido.");

            }

        }

    }

    public static void verConsumoTotal() {

        System.out.println(consumoTotal);

    }

    @Override
    public String toString() {

        String ret = "";

        for (int i = 0; i < APARATOS.size(); i++) {

            ret = ret + APARATOS.get(i);

        }

        return ret;
    }

}
