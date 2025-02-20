
import java.util.Comparator;

public class ComparadorEvento implements Comparator<Evento> {

    enum Parametros {

        NOMBRE,
        DESCRIPCION,
        FECHA;

    }

    private Parametros atributo;

    public ComparadorEvento(Parametros p) {

        this.atributo = p;

    }

    @Override
    public int compare(Evento o1, Evento o2) {

        switch (this.atributo) {

            case Parametros.NOMBRE:

                String t1 = o1.getNombreEvento();
                String t2 = o2.getNombreEvento();
                return t1.compareTo(t2);

            case Parametros.DESCRIPCION:
                String e1 = o1.getDescripcion();
                String e2 = o2.getDescripcion();
                return e1.compareTo(e2);

            case Parametros.FECHA:
                Fecha c1 = o1.getFechaEvento();
                Fecha c2 = o2.getFechaEvento();
                return c1.compareTo(c2);

            default:

                String n1 = o1.getNombreEvento();
                String n2 = o2.getNombreEvento();
                return n1.compareTo(n2);

        }

    }

}
