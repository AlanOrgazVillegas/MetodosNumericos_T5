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
  
Interpolar se entenderá estimar un valor desconocido en algún punto de una función
  
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






