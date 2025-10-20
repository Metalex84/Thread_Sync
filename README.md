# Sincronización de hilos

## Problema

La falta de sincronización puede causar _condiciones de carrera_. En este ejemplo, veremos un contador compartido que se ve incrementado por varios hilos. El valor final debería ser 2000 (1000 incrementos por cada hilo).

Sin embargo, el valor suele ser menor, por ejemplo 1783, 1920, etc. Esto ocurre porque ambos hilos pueden leer y escribir la variable al mismo tiempo, perdiendo incrementos.

## Solución: 

Al hacer que el método `incrementar()` sea `synchronized`, garantizamos que solo un hilo a la vez pueda ejecutar ese método en el objeto Contador. Esto previene condiciones de carrera y asegura que el valor final siempre sea 2000.
