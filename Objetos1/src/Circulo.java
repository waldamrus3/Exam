public class Circulo {

    private double radio;

    public Circulo(double radio) {
       
        this.radio = radio;
    }

    
    public double area() {

        double Pi = Math.PI;

        return Pi * Math.pow(radio, 2);

    }

    public double circunferencia() {

        return (2 * Math.PI) * radio;

    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
