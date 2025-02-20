
import java.util.Comparator;

public class ComparadorContacto implements Comparator<Contacto> {

    enum Parametros {

        NOMBRE,
        TELEFONO,
        EMAIL,
        CUMPLEANOS;

    }

    private Parametros atributo;

    public ComparadorContacto(Parametros p) {

        this.atributo = p;

    }

    @Override
    public int compare(Contacto o1, Contacto o2) {

        switch (this.atributo) {

            case Parametros.TELEFONO:

                int t1 = o1.getTelefono();
                int t2 = o2.getTelefono();
                return t1 - t2;

            case Parametros.EMAIL:
                String e1 = o1.getCorreo();
                String e2 = o2.getCorreo();
                return e1.compareTo(e2);

            case Parametros.CUMPLEANOS:
                Fecha c1 = o1.getCumpleanios();
                Fecha c2 = o2.getCumpleanios();
                return c1.compareTo(c2);

            default:

                String n1 = o1.getNombre();
                String n2 = o2.getNombre();
                return n1.compareTo(n2);

        }

    }

}
