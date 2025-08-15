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
6) Generé metodos GETTERS & SETTERS para cada atributo de la clase (l:37 - l:51).

COMMIT 3: Corrección de la clase 'Docente'.

1) Corregí errores de sintaxis, como anotaciónes incompletas (@Ent___) (l:8).
2) Añadí la anotación @Table con el nombre de la respectiva tabla (l:9).
3) Añadí la anotación @Id para la respectiva clase (l:14).
4) Añadí la anotación @Column para el atributo 'especialidad' y algunos atributos (l:18).
5) Creé los dos constructores pertinentes para la clase: vacío y con parámetros (l:34 - l:36).
6) Creé los métodos GETTER que faltaban y los separé de los setters para tener una mejor visibilidad de los mismos (l:43).
7) Creé los métodos SETTER que faltaban y los separé de los getter para tener una mejor visibilidad de los mismos (l:61).

COMMIT 4: Cambio de nombre de la base de datos por el establecido en las instrucciones del proyecto.

COMMIT 5: Corrección de la clase 'Usuario' + Creación de un ENUM 'TipoUsuario'

1) Se completó la anotación @Entity (l:6).
2) Se cambió el nombre de la tabla de plural a singular "usuarios" -> "usuario" (l:7).
3) Se completó el valor del atributo 'strategy', añadiendo 'IDENTITY' (l:13).
4) Se eliminó la anotación @Column del atributo 'id', pues no la usamos en este caso ya que el valor de la misma se autoincrementará (l:14).
5) Se añadieron otros atributos a la anotación @Column para mejorar la estructura de la columna (l:16).
6) Se corrigió la sintaxis de la anotación @Column y se añadieron atributos como su nombre y su lontitud (l:19).
7) Se renombró el atributo 'correoElectronico' por 'correo_electronico' para mantener la misma consistencia en la convención del texto del proyecto (l:20).
8) Se añadió la anotación @Column para la columna 'contraseña' y sus respectivos atributos como lontigud de 10 caracteres (l:22).
9) Se renombró el atributo 'contraseña' por 'contrasena' para evitar posibles errores futuros con caracteres como la 'Ñ' (l:23).
10) Se añadió la anotación @Column para la columna 'telefono' (l:25).
11) Se creó un ENUM llamado 'TipoUsuario' para almacenar los diferentes tipos de usuario que podrán haber en el proyecto. El ENUM en este caso debió albergarse en el paquete de 'modelos'.
12) Se añadió la anotación @Column para la columna 'tipo_usuario' y sus atributos (l:28).
13) Se añadió y corrigió la anotación @Enumerated para poder hacer uso o llamar al ENUM 'TipoUsuario.java' (l:29).
14) Se renombró el valor del atributo TipoUsuario por tipo_usuario (l:30).
15) Se corrigió el método constructor con parámetros teniendo en cuenta los renombramientos de atributos previamente realizados (l:48).
16) Se corrigieron y añadieron los métodos getter pertinentes (l:53).
17) Se corrigieron y añadieron los métodos setter pertinentes (l:83).

COMMIT 6: Levantando servidor y ejecutando conexión con la base de datos + Corrigiendo algunos errores de sintaxis en las relaciones.
1) En la clase 'Docente' se modificó la referencia a la columna 'Usuario' por su clave primaria correcta id_usuario > id (l:28).
2) Se eliminó un ';' en una de las relaciones que estaba generando un problema la hora de ejecutar la conexión.
3) Se probó ejecución desde el IDE y desde la terminar con el comando './gradlew bootRun'.