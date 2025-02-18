import java.util.Comparator;

public class ComparadorPokemon implements Comparator<Pokemon> {

    enum Filtrar {

        NOMBRE,
        TIPO,
        ETAPA_EVOLUTIVA,
        NUM_POKEDEX;

    }

    private Filtrar filtro;

    public ComparadorPokemon(Filtrar f) {

        this.filtro = f;

    }

    @Override
    public int compare(Pokemon o1, Pokemon o2) {

        switch (this.filtro) {
            case Filtrar.NOMBRE:

                String n1 = o1.getNombre();
                String n2 = o2.getNombre();

                return n1.compareTo(n2);

            case Filtrar.TIPO:

                Tipo t1 = o1.getT1();
                Tipo t2 = o2.getT1();

                if (t1 == t2) {

                    Tipo t3 = o1.getT2();
                    Tipo t4 = o2.getT2();

                    if (t3 == null && t4 == null) {

                        return o1.compareTo(o2);

                    }
                    if (t3 == null) {

                        return -1;

                    } else if (t4 == null) {

                        return +1;

                    } else {

                        return t3.compareTo(t4);

                    }

                } else {

                    return t1.compareTo(t2);

                }

            case Filtrar.ETAPA_EVOLUTIVA:

                int e1 = o1.getEtapa_evolutiva();
                int e2 = o2.getEtapa_evolutiva();

                if (e1 == e2) {

                    return o1.compareTo(o2);

                } else {

                    return e1 - e2;

                }

            case Filtrar.NUM_POKEDEX:

                int nd1 = o1.getNumDex();
                int nd2 = o2.getNumDex();

                return nd1 - nd2;

            default:

                return o1.compareTo(o2);
        }

    }

}
