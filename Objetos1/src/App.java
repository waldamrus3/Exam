import java.util.Scanner;

public class App {

    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        System.out.println("Introduce la base del rectángulo: ");
        int base = sc.nextInt();
        System.out.println("Introduce la altura del rectángulo: ");
        int altura = sc.nextInt();

        Rectangulo r1 = new Rectangulo(base, altura);

        int op = 0;

        while (op != 6) {
        
            System.out.println("-------------------------------------");
            System.out.println("RECTÁNGULO:");
            System.out.println("");
            System.out.println("[1] Calcular el área");
            System.out.println("[2] Calcular el perímetro");
            System.out.println("[3] Cambiar la base");
            System.out.println("[4] Cambiar la altura");
            System.out.println("[5] Dibujar");
            System.out.println("[6] SALIR");
            System.out.println("");
            System.out.println("-------------------------------------");

        op = sc.nextInt();

        switch (op) {

            case 1:

            int area1 = r1.area();
            System.out.println(r1.area());

                break;
        
            case 2:

            int perimetro1 = r1.perimetro();
            System.out.println(r1.perimetro());

                break;

            case 3:

            System.out.println("Introduce el nuevo valor de la base:");
            
            int base1 = sc.nextInt();

            r1.setBase(base1);

                break;

            case 4:

            System.out.println("Introduce el nuevo valor de la altura:");

            int altura1 = sc.nextInt();

            r1.setAltura(altura1);

                break;

            case 5:

            r1.dibujar();

                break;
        }
    }


        Circulo c1 = new Circulo(5);

        double areaC1 = c1.area();
        System.out.println(c1.area());

        double circunferenciaC1 = c1.circunferencia();
        System.out.println(c1.circunferencia());

        //uso el setRadio para cambiar el radio del circulo
        c1.setRadio(2);
        double circunferenciaC2 = c1.circunferencia();
        System.out.println(c1.circunferencia());


        Triangulo t1 = new Triangulo(10, 15);

        double areaT1 = t1.area();
        System.out.println(t1.area());
    }
}
