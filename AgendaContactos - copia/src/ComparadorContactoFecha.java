import java.util.Comparator;

public class ComparadorContactoFecha implements Comparator<Contacto> {

    @Override
    public int compare(Contacto o1, Contacto o2) {
        Fecha f1 = o1.getCumpleanios();
        Fecha f2 = o2.getCumpleanios();

        if (f1 == null || f2 == null) {

            return o1.compareTo(o2);

        }

        return f1.compareTo(f2);
    }

}
