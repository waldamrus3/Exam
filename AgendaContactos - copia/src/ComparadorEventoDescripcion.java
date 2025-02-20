
import java.util.Comparator;

public class ComparadorEventoDescripcion implements Comparator<Evento> {

    @Override
    public int compare(Evento o1, Evento o2) {
        String f1 = o1.getDescripcion();
        String f2 = o2.getDescripcion();

        if (f1 == null || f2 == null) {

            return o1.compareTo(o2);

        }
        return f1.compareTo(f2);
    }

}
