import java.util.Arrays;

public class Persona {

    enum Tipo_Persona {
        ALUMNO,
        PROFESOR
    }

    private String nombre;
    private String apellido;
    private int edad;
    private Modulo[] modulos;

    private Tipo_Persona tipo;

    public Persona(String nombre, String apellido, int edad, Modulo[] modulos, Tipo_Persona tipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.modulos = modulos;
        this.tipo = Tipo_Persona.ALUMNO;
    }

    public Persona(String nombre, String apellido, int edad, Modulo[] modulos, boolean tipo) {
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

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.modulos = new Modulo[0]; // para que si el array se inicia vacio no de error(*)
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

    public void setModulos(Modulo[] modulos) {
        this.modulos = modulos;
    }

    public Modulo[] getModulos() {
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

            for (int i = 0; i < this.modulos.length; i++) { // (*) Ya que aqui en el for (this.modulos.length) si el
                                                            // array
                                                            // esta vacio la longitud es 0 y da error.
                ret = ret + "* " + this.modulos[i] + "\n";
            }

        } else {

        }

        String ret = "Nombre: " + this.nombre + "\n";
        ret = ret + "Apellido: " + this.apellido + "\n";
        ret = ret + "Edad: " + this.edad + "\n";
        ret = ret + "Tipo: " + this.tipo + "\n";
        ret = ret + "Asignaturas: \n";

        for (int i = 0; i < this.modulos.length; i++) { // (*) Ya que aqui en el for (this.modulos.length) si el array
                                                        // esta vacio la longitud es 0 y da error.
            ret = ret + "* " + this.modulos[i] + "\n";
        }
        return ret;
    }

    public void matricularse(Modulo modulo) {

        Modulo[] modulosNew = new Modulo[modulos.length + 1];

        for (int i = 0; i < modulos.length; i++) {

            modulosNew[i] = this.modulos[i];

        }

        modulosNew[modulosNew.length - 1] = modulo;
        setModulos(modulosNew);

    }

    public void desmatricularse(int codigo) {

        if (estaMatriculado(codigo) == true) {

            Modulo[] modulosNew2 = new Modulo[modulos.length - 1];

            int contador = 0;

            for (int i = 0; i < modulos.length; i++) {

                if (this.modulos[i].getCodigoAsignatura() != codigo) {

                    modulosNew2[contador] = this.modulos[i];
                    contador++;
                }

            }

            setModulos(modulosNew2);
            // modulosNew2[modulosNew2.length - 1] = null;

        } else {

            System.out.println("No se puede desmatricular ya que no esta en esta asignatura");

        }

    }

    public boolean estaMatriculado(int codigo) {

        boolean esta = false;

        for (int i = 0; i < modulos.length; i++) {

            if (this.modulos[i].getCodigoAsignatura() == codigo) {

                esta = true;

            } else {

                esta = false;

            }

        }
        return esta;
    }

}