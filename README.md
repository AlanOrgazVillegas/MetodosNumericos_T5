# Métodos numéricos Tema 5: Interpolación y ajuste de funciones
Problemario de la asignatura de métodos numéricos, tema 5. 5 ejericicios de interpolación lineal e interpolación cuadrática.

********************************************************************************************************************************************
## ÍNDICE
+ Interpolación lineal
  - Definición.
  - Algoritmo.
  - Código en Java.
  - Ejercicios.
+ Interpolación cuadrática
  - Definición.
  - Algoritmo.
  - Código en Java.
  - Ejercicios.
  ********************************************************************************************************************************************
  
Interpolar se entiende como estimar un valor desconocido en algún punto de una función.
  
# Interpolación lineal
## Definición
La forma más simple de interpolación consiste en unir dos puntos con una línea recta. Dicha técnica es llamada interpolación lineal.
La notación f1(x) designa que éste es un polinomio de interpolación de primer grado. Observe que además de representar la pendiente de la línea que une los puntos, el término f(x1) – f(x0)/(x1 – x0) es una aproximación en diferencia dividida finita a la primer derivada 

Fórmula: ![Captura de pantalla (160)](https://github.com/AlanOrgazVillegas/MetodosNumericos_T5/assets/147757830/6b2f7603-0ac1-4428-a816-d2c487434765)

## Algortimo
```
Algoritmo InterpolacionLineal(x0, y0, x1, y1, x)
    Entrada:
        x0, y0: coordenadas del primer punto conocido
        x1, y1: coordenadas del segundo punto conocido
        x: valor de x para el cual queremos estimar el valor de y
    Salida:
        y: valor estimado de y

    // Paso 1: Calcular la pendiente (m)
    m <- (y1 - y0) / (x1 - x0)
    
    // Paso 2: Calcular el valor interpolado de y
    y <- y0 + m * (x - x0)
    
    Retornar y
Fin Algoritmo

```
## Código en Java
```
public class InterpolacionLineal {

    // Método para realizar la interpolación lineal
    public static double interpolacionLineal(double x0, double y0, double x1, double y1, double x) {
        // Calcular la pendiente (m)
        double m = (y1 - y0) / (x1 - x0);
        // Calcular el valor interpolado de y
        return y0 + m * (x - x0);
    }

    public static void main(String[] args) {
        // Puntos conocidos
        double x0 = 1.0, y0 = 2.0;
        double x1 = 3.0, y1 = 3.0;
        // Valor de x para el cual queremos estimar y
        double x = 2.0;
        
        // Calcular el valor interpolado de y
        double y = interpolacionLineal(x0, y0, x1, y1, x);
        
        // Imprimir el resultado
        System.out.println("El valor interpolado de y para x=" + x + " es " + y);
    }
}
```

### Salida

![Captura de pantalla (163)](https://github.com/AlanOrgazVillegas/MetodosNumericos_T5/assets/147757830/d3901a4a-668d-4317-9815-c74ab3e87653)

## 5 Ejercicios en Java

[Ejemplo 1](https://github.com/AlanOrgazVillegas/MetodosNumericos_T5/blob/master/src/interpolacion_lineal/INterpolacion_lineal.java)
[Ejemplo 2](https://github.com/AlanOrgazVillegas/MetodosNumericos_T5/blob/master/src/interpolacionlineal_2/InterpolacionLineal_2.java)
[Ejemplo 3](https://github.com/AlanOrgazVillegas/MetodosNumericos_T5/blob/master/src/Interpolacionlineal_3/Interpolacionlineal_3.java)
[Ejemplo 4](https://github.com/AlanOrgazVillegas/MetodosNumericos_T5/blob/master/src/Interpolacionlineal_4/Interpolacionlineal_4.java)
[Ejemplo 5](https://github.com/AlanOrgazVillegas/MetodosNumericos_T5/blob/master/src/Interpolacionlineal_5/Interpolacionlineal_5.java)

********************************************************************************************************************************************
# Interpolación cuadrática
## Definición
para mejorar la estimación consiste en introducir alguna curvatura a la línea que une los puntos. Si se tienen tres puntos como datos,
éstos pueden ajustarse en un polinomio de segundo grado (también conocido como polinomio cuadrático o parábola).

Fórmula: ![Captura de pantalla (164)](https://github.com/AlanOrgazVillegas/MetodosNumericos_T5/assets/147757830/885caa15-7898-475d-b3e2-86f6cda06274)

## Algortimo
```
Algoritmo InterpolacionCuadratica(x0, y0, x1, y1, x2, y2, x)
    Entrada:
        x0, y0: coordenadas del primer punto conocido
        x1, y1: coordenadas del segundo punto conocido
        x2, y2: coordenadas del tercer punto conocido
        x: valor de x para el cual queremos estimar el valor de y
    Salida:
        y: valor interpolado de y

    // Paso 1: Calcular los coeficientes a, b y c
    a = ((y2 - y0) / ((x2 - x0) * (x2 - x1)) - (y1 - y0) / ((x1 - x0) * (x2 - x1))) / (x2 - x0)
    b = (y1 - y0) / (x1 - x0) - a * (x1 + x0)
    c = y0 - a * x0^2 - b * x0
    
    // Paso 2: Calcular el valor interpolado de y
    y = a * x^2 + b * x + c
    
    Retornar y
Fin Algoritmo
```
## Código en Java
```
package interpolacion_cuadratica;
/**
 *
 * @author Alan
 */
public class Interpolacion_cuadratica {

    public static void main(String[] args) {
         // Datos de ejemplo
        double x0 = 1.0;
        double x1 = 2.0;
        double x2 = 3.0;
        double y0 = 3.0;
        double y1 = 5.0;
        double y2 = 9.0;
        double x = 2.5;
        // Realizar interpolación cuadrática
        double resultado = interpolacionCuadratica(x0, x1, x2, y0, y1, y2, x);
        System.out.println("El resultado de la interpolación cuadrática en x = " + x + " es: " + resultado);
    }
    
    public static double interpolacionCuadratica(double x0, double x1, double x2, double y0, double y1, double y2, double x) {
        double L0 = ((x - x1) * (x - x2)) / ((x0 - x1) * (x0 - x2));
        double L1 = ((x - x0) * (x - x2)) / ((x1 - x0) * (x1 - x2));
        double L2 = ((x - x0) * (x - x1)) / ((x2 - x0) * (x2 - x1));

        double result = (y0 * L0) + (y1 * L1) + (y2 * L2);
        return result;
    }
}
```
### Salida

![Captura de pantalla (165)](https://github.com/AlanOrgazVillegas/MetodosNumericos_T5/assets/147757830/913d39b9-aca9-455d-ac3e-59bd85932344)

## 5 Ejercicios en Java

[Ejemplo 1](https://github.com/AlanOrgazVillegas/MetodosNumericos_T5/blob/master/src/interpolacion_cuadratica/Interpolacion_cuadratica.java)
[Ejemplo 2](https://github.com/AlanOrgazVillegas/MetodosNumericos_T5/blob/master/src/InterpolacionCuadratica_2/InterpolacionCuadratica_2.java)
[Ejemplo 3](https://github.com/AlanOrgazVillegas/MetodosNumericos_T5/blob/master/src/InterpolacionCuadratica_3/InterpolacionCuadratica_3.java)
[Ejemplo 4](https://github.com/AlanOrgazVillegas/MetodosNumericos_T5/blob/master/src/InterpolacionCuadratica_4/InterpolacionCuadratica_4.java)
[Ejemplo 5](https://github.com/AlanOrgazVillegas/MetodosNumericos_T5/blob/master/src/InterpolacionCuadratica_5/InterpolacionCuadratica_5.java)





