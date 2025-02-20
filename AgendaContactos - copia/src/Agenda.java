
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Agenda {

    final static Scanner sc = new Scanner(System.in);

    ArrayList<Contacto> contactos = new ArrayList<>();
    ArrayList<Evento> eventos = new ArrayList<>();

    public Agenda() {

        this.contactos = new ArrayList<>();
        this.eventos = new ArrayList<>();

    }

    public void addContacto(Contacto c) {

        if (this.contactos.contains(c) == true) {

            System.out.println("Este contacto ya existe.");

        }

        this.contactos.add(c);

    }

    public void eliminarContacto(Contacto c) {

        // if (exp instanceof Object) {
        // Object obj = (Object)exp;

        // }

        contactos.remove(c);

    }

    public void borrarContacto(String nombre) {

        for (int i = 0; i < this.contactos.size(); i++) {

            if (this.contactos.get(i).getNombre().equals(nombre)) {

                Contacto contactoABorrar = this.contactos.get(i);
                this.contactos.remove(contactoABorrar);

            }

        }

    }

    public void addEvento(Evento e) {

        this.eventos.add(e);

    }

    public void eliminarEvento(String nombre) {

        for (int i = 0; i < this.eventos.size(); i++) {

            if (this.eventos.get(i).getNombreEvento().equals(nombre)) {

                Evento eventoABorrar = this.eventos.get(i);
                this.eventos.remove(eventoABorrar);

            }

        }

    }

    public void listarContactos() {

        for (int i = 0; i < contactos.size(); i++) {

            Contacto aux = this.contactos.get(i);
            System.out.println(aux);
            System.out.println("");

        }

    }

    public void listarEventos() {

        for (int i = 0; i < eventos.size(); i++) {

            Evento aux = this.eventos.get(i);
            System.out.println(aux);
            System.out.println("");

        }

    }

    public void ordenarEventos() {

        Collections.sort(this.eventos);

    }

    public void ordenarListaContactos() {

        for (int i = 0; i < this.contactos.size() - 1; i++) {

            Contacto c1 = this.contactos.get(i);
            Contacto c2 = this.contactos.get(i + 1);

            if (c1.compareTo(c2) > 0) {

                this.contactos.set(i, c2);
                this.contactos.set(i + 1, c1);
                i = -1;

            }

        }

    }

    public void ordenarContactos() {

        ComparadorContactoFecha c = new ComparadorContactoFecha();
        Collections.sort(this.contactos, c);

        // Collections.reverse(this.contactos);

    }

    public void ordenarContactosNew(ComparadorContacto c, boolean b) {

        if (b == false) {

            Collections.sort(this.contactos, c);

        } else {

            Collections.sort(this.contactos, c);
            Collections.reverse(this.contactos);

        }

    }

    public void ordenarEventosNew(ComparadorEvento.Parametros p, boolean alReves) {

        ComparadorEvento comparadorEvento = new ComparadorEvento(p);
        Collections.sort(this.eventos, comparadorEvento);

        if (alReves == true) {

            Collections.reverse(this.eventos);

        }

    }

    public void ordenarEventoPorNombre() {

        ComparadorEventoNombre c = new ComparadorEventoNombre();
        Collections.sort(this.eventos, c);

    }

    public void ordenarEventosPorDescripcion() {

        ComparadorEventoDescripcion c = new ComparadorEventoDescripcion();
        Collections.sort(this.eventos, c);

    }

    public void ordenarContactosMayorMenor() {

        Collections.sort(this.contactos);
        Collections.reverse(this.contactos);

        // Collections.sort(this.contactos, Collections.reverseOrder());

    }

    public boolean mostrarEventosPorFecha(Fecha f) {

        boolean eventos = false;

        for (int i = 0; i < this.eventos.size(); i++) {

            Fecha aux = this.eventos.get(i).getFechaEvento();

            if (aux.compareTo(f) == 0) {
                System.out.println(this.eventos.get(i));
                eventos = true;
            }

        }

        return eventos;
    }

    @Override
    public String toString() {

        return contactos.toString() + "\n" + eventos.toString();
    }

}
