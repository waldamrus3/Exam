
import java.util.ArrayList;

public class Persona2 {

    enum Tipo_Persona {
        ALUMNO,
        PROFESOR
    }

    private String nombre;
    private String apellido;
    private int edad;
    private ArrayList<Modulo> modulos;

    private Tipo_Persona tipo;

    public Persona2(String nombre, String apellido, int edad, ArrayList<Modulo> modulos, Tipo_Persona tipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.modulos = modulos;
        this.tipo = Tipo_Persona.ALUMNO;
    }

    public Persona2(String nombre, String apellido, int edad, ArrayList<Modulo> modulos, boolean tipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.modulos = modulos;
        if (tipo == true) {

            this.tipo = Tipo_Persona.PROFESOR;

        } else {

            this.tipo = Tipo_Persona.ALUMNO;

        }
    }

    public Persona2(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.modulos = new ArrayList<Modulo>(); // para que si el array se inicia vacio no de error(*) (AHORA CON EL ARRAYLIST NO SE COMO VA ESTO)
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setModulos(ArrayList<Modulo> modulos) {
        this.modulos = modulos;
    }

    public ArrayList<Modulo> getModulos() {
        return modulos;
    }

    @Override
    public String toString() {

        if (this.tipo == Tipo_Persona.ALUMNO) {

            String ret = "Nombre: " + this.nombre + "\n";
            ret = ret + "Apellido: " + this.apellido + "\n";
            ret = ret + "Edad: " + this.edad + "\n";
            ret = ret + "Tipo: " + this.tipo + "\n";
            ret = ret + "Asignaturas: \n";

            for (int i = 0; i < this.modulos.size(); i++) { // (*) Ya que aqui en el for (this.modulos.length) si el
                                                            // array
                                                            // esta vacio la longitud es 0 y da error.
                ret = ret + "* " + this.modulos.get(i) + "\n";
            }

        } else {

        }

        String ret = "Nombre: " + this.nombre + "\n";
        ret = ret + "Apellido: " + this.apellido + "\n";
        ret = ret + "Edad: " + this.edad + "\n";
        ret = ret + "Tipo: " + this.tipo + "\n";
        ret = ret + "Asignaturas: \n";

        for (int i = 0; i < this.modulos.size(); i++) { // (*) Ya que aqui en el for (this.modulos.length) si el array
                                                        // esta vacio la longitud es 0 y da error.
            ret = ret + "* " + this.modulos.get(i) + "\n";
        }
        return ret;
    }

    public void matricularse(Modulo modulo) {

       this.modulos.add(modulo);

    }

    public void desmatricularse(Modulo modulo) {

        this.modulos.remove(modulo);

    }

    public void desmatricularse(int codigo) {

        if (this.estaMatriculado(codigo) == true) {

            for (int i = 0; i < modulos.size(); i++) {

                if(this.modulos.get(i).getCodigoAsignatura() == codigo) {

                    this.modulos.remove(this.modulos.get(i));
                }

            }

        } else {

            System.out.println("No se puede desmatricular ya que no esta en esta asignatura");

        }

    }

    public boolean estaMatriculado(int codigo) {

        boolean esta = false;

        for (int i = 0; i < modulos.size(); i++) {

            if (this.modulos.get(i).getCodigoAsignatura() == codigo) {

                esta = true;

            } else {

                esta = false;

            }

        }
        
        return esta;
    }

    public boolean estaMatriculado(Modulo modulo) {

        return this.modulos.contains(modulo);

    }

}
