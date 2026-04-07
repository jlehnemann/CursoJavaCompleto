import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c, pi,  areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        pi = 3.14159;


        areaTriangulo = a * c / 2;
        areaCirculo = pi * Math.pow(c, 2.00);
        areaTrapezio = ((a + b) * c)/2;
        areaQuadrado = Math.pow(b, 2.00);
        areaRetangulo = a * b;

        System.out.printf("Triângulo - Área: %.3f %n", areaTriangulo);
        System.out.printf("Círculo - Área: %.3f %n", areaCirculo);
        System.out.printf("Trapézio - Área: %.3f %n", areaTrapezio);
        System.out.printf("Quadrado - Área: %.3f %n", areaQuadrado);
        System.out.printf("Retângulo - Área: %.3f %n", areaRetangulo);





    }
}