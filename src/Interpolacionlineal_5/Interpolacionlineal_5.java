package Interpolacionlineal_5;

public class Interpolacionlineal_5 {
    public static void main(String[] args) {
       // Nuevos datos de ejemplo
        double x0 = 0.0;
        double x1 = 3.0;
        double y0 = 0.0;
        double y1 = 9.0;
        double x = 2.0;

         // Realizar interpolación lineal
        double resultado = interpolacionLineal(x0, x1, y0, y1, x);
        System.out.println("El resultado de la interpolación lineal en x = " + x + " es: " + resultado); 
    }
    public static double interpolacionLineal(double x0, double x1, double y0, double y1, double x) {
        // Fórmula de la interpolación lineal
        double result = y0 + ((y1 - y0) / (x1 - x0)) * (x - x0);
        return result;
    }
}
