public class Rectangulo {

    // ATRIBUTOS
private int base;
private int altura;

// CONSTRUCTOR (ES)

public Rectangulo(int base, int altura) {
    this.base = base;
    this.altura = altura;
}

// CUADRADO CONSTRUCTOR

public Rectangulo(int base) {
    this.base = base;
    this.altura = base;
}

// GETTERS / SETTERS

public int getBase() {
    return base;
}
public void setBase(int base) {
    this.base = base;
}
public int getAltura() {
    return altura;
}
public void setAltura(int altura) {
    this.altura = altura;
}

// ACCIONES / METODOS


public int area() {

    return base * altura;
}

public int perimetro() {

    return base*2 + altura*2;
}

public void dibujar() {

    for (int i = 0; i < base; i++) {
        for (int j = 0; j < altura; j++) {
            System.out.print("* ");
            }
            System.out.println();
            }

}

}
