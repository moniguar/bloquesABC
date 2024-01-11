# bloquesABC

Creamos una clase llamada BloquesABC en java con un método puedo_obtener_palabra que permita el desarrollo del caso, el cual se llama

Prueba de bloques

Descripción: 
* Tenemos una colección de bloques ABC (tal vez como los que tenía cuando era niño)
• Hay veinte (20) bloques con dos (2) letras en cada bloque.
• Se garantiza un alfabeto completo entre todos los lados de los bloques.

Considere la siguiente muestra de bloques:
(B O) (X K) (D Q) (C P) (N A) (G T) (R E) (T G) (Q D) (F S)
(H U) (V I) (A T) (O B) (E R) (F S) (L Y) (P C) (Z M) (J W)

Objetivo
Escribe una función que tome una palabra (String) y determine si la palabra se puede escribir con la colección de bloques dada.

Las reglas son simples
1. Una vez que se usa una letra en un bloque, ese bloque no se puede usar nuevamente.
2. La función no debe distinguir entre mayúsculas y minúsculas.
3. Mostrar el resultado para las palabras en el siguiente ejemplo.
4. Se deben realizar las pruebas unitarias que garanticen los resultados del punto 3.

Ejemplo
Casos de prueba
>>> puedo_obtener_palabra("A"): True
>>> puedo_obtener_palabra("LIBRO"): True
>>> puedo_obtener_palabra("BOZO"): False
>>> puedo_obtener_palabra("TRAJE"): True
>>> puedo_obtener_palabra("COMUN"): True
>>> puedo_obtener_palabra("CAMPANA"): False
>>> puedo_obtener_palabra("DORITO"): True
>>> puedo_obtener_palabra("ARLEQUIN"): True

Esta clase da solución a esta Prueba.