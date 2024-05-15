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



## 5 Ejercicios en Java



********************************************************************************************************************************************




