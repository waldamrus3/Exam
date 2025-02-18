
import java.util.Scanner;

public class App {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        Pokemon p1 = new Pokemon(1, "Pikachu", 25, Tipo.ELECTRICO, null, "Impactrueno", "Rayo");
        Pokemon p2 = new Pokemon(2, "Charmander", 4, Tipo.FUEGO, null, "Colmillo Ígneo", "Lanzallamas");
        Pokemon p3 = new Pokemon(1, "Squirtle", 7, Tipo.AGUA, null, "Pistola agua", "");
        Pokemon p4 = new Pokemon(1, "Tuvieja", 69, Tipo.HADA, Tipo.FUEGO, "Chancletazo", "");

        Pokedex pokedex = new Pokedex();

        int op = 0;

        do {

            System.out.println("");
            System.out.println("+-------------------------------------+");
            System.out.println("|             - POKEDEX -             |");
            System.out.println("+-------------------------------------+");
            System.out.println("|  [1] Atrapar un nuevo Pokémon       |");
            System.out.println("|  [2] Ver Pokémon atrapados          |");
            System.out.println("|  [3] Ver Pokémon vistos             |");
            System.out.println("|  [4] Ordenar                        |");
            System.out.println("|  [5] SALIR                          |");
            System.out.println("+-------------------------------------+");

            op = sc.nextInt();

            switch (op) {
                case 1:

                    // for (int i = 0; i < 4; i++) {
                    // String a = "p";
                    // int b = (int) (Math.random() * 4);
                    // String c = a + Integer.toString(b);
                    // }

                    pokedex.addPokemon(p1);

                    break;
                case 2:

                    pokedex.verPokemonAtrapados();
                    // System.out.println("");
                    // System.out.println(pokedex.toString());
                    break;

                case 3:

                    break;

                case 4:

                    System.out.println("");

                    int opp = 0;

                    System.out.println("[1] Ordenar por nombre");
                    System.out.println("[2] Ordenar por tipo");
                    System.out.println("[3] Ordenar por nº de Pokedex");
                    System.out.println("[4] Ordenar por etapa evolutiva");

                    if (op == 1) {

                        ComparadorPokemon c = new ComparadorPokemon(ComparadorPokemon.Filtrar.NOMBRE);

                    } else if (op == 2) {

                        ComparadorPokemon c = new ComparadorPokemon(ComparadorPokemon.Filtrar.TIPO);

                    } else if (op == 3) {

                        ComparadorPokemon c = new ComparadorPokemon(ComparadorPokemon.Filtrar.NUM_POKEDEX);

                    } else if (op == 4) {

                        ComparadorPokemon c = new ComparadorPokemon(ComparadorPokemon.Filtrar.ETAPA_EVOLUTIVA);

                    } else {

                    }

                    break;
            }

        } while (op != 4);

    }
}
