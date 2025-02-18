public class Pokemon implements Comparable<Pokemon> {

    private Tipo t1;
    private Tipo t2;
    private String nombre;
    private int numDex;
    private boolean atrapado;
    private boolean visto;
    private int etapa_evolutiva;
    private String habilidad1;
    private String habilidad2;

    public Pokemon(boolean atrapado, int etapa_evolutiva, String nombre, int numDex, Tipo t1, Tipo t2, boolean visto,
            String habilidad1, String habilidad2) {
        this.atrapado = atrapado;
        this.etapa_evolutiva = etapa_evolutiva;
        this.nombre = nombre;
        this.numDex = numDex;
        this.t1 = t1;
        this.t2 = t2;
        this.visto = visto;
        this.habilidad1 = habilidad1;
        this.habilidad2 = habilidad2;
    }

    public Pokemon(int etapa_evolutiva, String nombre, int numDex, Tipo t1, Tipo t2, String habilidad1,
            String habilidad2) {
        this.etapa_evolutiva = etapa_evolutiva;
        this.nombre = nombre;
        this.numDex = numDex;
        this.t1 = t1;
        this.t2 = t2;
        this.habilidad1 = habilidad1;
        this.habilidad2 = habilidad2;
    }

    @Override
    public int compareTo(Pokemon p) {

        String p1 = this.getNombre();
        String p2 = p.getNombre();

        return p1.compareTo(p2);

    }

    public Tipo getT1() {
        return t1;
    }

    public void setT1(Tipo t1) {
        this.t1 = t1;
    }

    public Tipo getT2() {
        return t2;
    }

    public void setT2(Tipo t2) {
        this.t2 = t2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumDex() {
        return numDex;
    }

    public void setNumDex(int numDex) {
        this.numDex = numDex;
    }

    // public void isAtrapado() {
    // return;
    // }

    public boolean getAtrapado() {
        return atrapado;
    }

    public void setAtrapado(boolean atrapado) {
        this.atrapado = atrapado;
    }

    public boolean isVisto() {
        return visto;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }

    public int getEtapa_evolutiva() {
        return etapa_evolutiva;
    }

    public void setEtapa_evolutiva(int etapa_evolutiva) {
        this.etapa_evolutiva = etapa_evolutiva;
    }

    public void getHabilidad1(String habilidad1) {

        this.habilidad1 = habilidad1;

    }

    public void setHabilidad1(String habilidad2) {
        this.habilidad2 = habilidad2;
    }

    public void getHabilidad2(String habilidad2) {
        this.habilidad2 = habilidad2;
    }

    public void setHabilidad2(String habilidad2) {
        this.habilidad2 = habilidad2;
    }

    @Override
    public boolean equals(Object obj) {

        Pokemon aux = (Pokemon) obj;

        return (this.getNombre().equals(aux.getNombre()) && this.getNumDex() == aux.getNumDex());
    }

    @Override
    public String toString() {

        return " [" + nombre + "]" + "\n-> Nº de Pokedex: " + numDex + "\n-> Tipo/s: " + t1 + " " + t2
                + "\n-> Etapa evolución: "
                + etapa_evolutiva + "\n-> Habilidad 1: " + habilidad1 + "\n-> Habilidad 2: " + habilidad2;
    }

}
