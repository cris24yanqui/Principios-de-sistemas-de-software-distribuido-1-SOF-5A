# Aprendizaje Autónomo 1 (Assignment 1)

Esta carpeta contiene los archivos correspondientes a la **Tarea 1: Linux, Configuración y Capas Superiores del Modelo OSI**.

## Contenido

- **`JavaGradle/`**: Proyecto Gradle modificado según las instrucciones `// Try:` del archivo `build.gradle`:
  1. Tarea `runAppAgain` actualizada para soportar ejecución con 2 parámetros (`-Pnum1` y `-Pnum2`), 1 solo parámetro (`-Pnum1` o `-Pnum2`) o ningún parámetro (usando valores por defecto `1` y `2`).
  2. Clase `Fraction.java` modificada en su método `main(String[] args)` para recibir hasta 2 argumentos por línea de comandos (numerador y denominador) con valores por defecto (`1` y `3`).
  3. Nueva tarea `runFrac` en `build.gradle` que permite ejecutar `Fraction` pasando `-Pnum` y `-Pdenom` en cualquier orden, con 2 parámetros, 1 parámetro o sin parámetros.
  4. Adaptación de sintaxis de `build.gradle` (`mainClass = ...`) y Gradle Wrapper (`8.14`) para compatibilidad con JDK 24.

## Comandos de prueba en `JavaGradle`

```bash
# Ejecutar Multiply con 2, 1 y 0 parámetros
./gradlew runAppAgain -Pnum1=9 -Pnum2=10 -q --console=plain
./gradlew runAppAgain -Pnum1=9 -q --console=plain
./gradlew runAppAgain -q --console=plain

# Ejecutar Fraction con 2 parámetros (en distinto orden), 1 parámetro y 0 parámetros
./gradlew runFrac -Pdenom=4 -Pnum=3 -q --console=plain
./gradlew runFrac -Pnum=3 -Pdenom=4 -q --console=plain
./gradlew runFrac -Pnum=5 -q --console=plain
./gradlew runFrac -q --console=plain
```
