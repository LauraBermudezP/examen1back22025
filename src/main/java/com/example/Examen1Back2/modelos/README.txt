Examen BACKEND II Primer Momento - Documentación

Autor: Bermudez Perez Laura
Fecha inicio: 14 de agosto de 2025

COMMIT 1: Configuración del proyecto y del entorno de desarrollo.

1) Configuré y definí un JDK como recomendación de IntelliJ para el proyecto Gradle.
2) Definí la configuración del proyecto y los datos de conexión con la BD en el archivo resources > application.properties.
3) Sincronicé la versión de Java del proyecto con la de mi programa local.

COMMIT 2: Corrección de la clase 'Curso'.

1) Añadí @AnotacionesJPA como @Table y su respectivo atributo 'name' (l:7).
2) Corregí errores de sintaxis, como anotaciónes incompletas (@Ge___, @I__) (l:12 - l:13). Además en la l:13 añadí el atributo 'strategy = GenerationType.' que faltaba.
3) Agregé la anotación @Column referente a la columna 'nombre' de la tabla y sus respectivos atributos para la BD (l:16).
4) Corregí un error de sintaxis por falta del ';' (l:17 - l:22). Además, en la línea 17 añadí el modificador de acceso 'private'.
5) Modifiqué el constructor con parámetros y le añadí el atributo 'docente' (l:31 - l:32).
6) Generé metodos GETTERS & SETTERS para cada atributo de la clase (l:37 - l:51)