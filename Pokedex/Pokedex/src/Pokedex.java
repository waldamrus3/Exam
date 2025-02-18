
import java.util.ArrayList;
import java.util.Collections;

public class Pokedex {

    private ArrayList<Pokemon> lista;

    public Pokedex() {
        this.lista = new ArrayList<>();
    }

    public void addPokemon(Pokemon p) {

        // Si el pokemon no estaba en la lista,
        // -> visto = true;
        // -> atrapado = false;
        // Si el pokemon SI estaba en la lista,
        // -> visto = true;
        // -> atrapado = true;

        if (lista.contains(p) == false) {

            lista.add(p);
            // p.setVisto = true;

        } else {

            p.setAtrapado(true);
            System.out.println("Este Pokémon ya está registrado en la Pokedex.");

        }

    }

    public void ordenarPokemon() {

    }

    public void ordenarPorFiltroPokemon(ComparadorPokemon.Filtrar f) {

        ComparadorPokemon c = new ComparadorPokemon(f);
        Collections.sort(this.lista, c);

    }

    public void verPokemonAtrapados() {

        for (int i = 0; i < lista.size(); i++) {
            Pokemon p = lista.get(i);
            System.out.println(p);
        }

    }

    public void verPokemonVistos() {

    }

    // public void ordenarPor(Filtro f) {

    // }

    @Override
    public String toString() {
        String a = "";
        for (int i = 0; i < lista.size(); i++) {

            a = a + lista.get(i) + "\n";

        }

        return a;
    }

}
