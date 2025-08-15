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

COMMIT 7: Documentación final (Parte 3 del PDF)

- - Descripción del proyecto:
Como examen de conocimientos para el primer momento del submódulo Backend II, se nos solicitó clonar un repositorio de GitHub creado por el profesor, cuyo objetivo era que lo instaláramos en nuestra máquina local y corrigiéramos errores de sintaxis introducidos intencionalmente.

El trabajo consistió en:

- Corregir errores de sintaxis.
- Completar anotaciones en el código.
- Crear y/o completar métodos aplicando Programación Orientada a Objetos (POO).
- Configurar la conexión a una base de datos (inicialmente embebida).

Para el desarrollo se emplearon, además de los conocimientos previos y temas vistos en clase, las siguientes herramientas:

- IntelliJ IDEA: IDE utilizado para trabajar el proyecto en el lenguaje Java en su versión 21.
- Gradle: Herramienta para la gestión de dependencias y compilación del código.
- Spring Boot y dependencias: Framework que, junto con sus librerías, permitió mapear clases como entidades reflejadas en la base de datos.
- XAMPP: Plataforma que proporcionó un entorno de desarrollo para la creación, gestión y visualización de las tablas en la base de datos MySQL.

- - Descripción de la conexión con la base de datos:

El primer paso fue abrir XAMPP, previamente instalado en mi máquina local, y asegurarme de que tanto Apache como MySQL estuvieran en ejecución.
En el panel de control de XAMPP, seleccioné la opción "Admin" de MySQL, lo que abrió en mi navegador la interfaz gráfica de phpMyAdmin. Allí creé una nueva base de datos llamada "develop_db", siguiendo las especificaciones del profesor. Posteriormente, en mi proyecto Java, abrí el archivo "application.properties" y configuré los parámetros necesarios para establecer la conexión:

- URL de conexión: Dirección JDBC hacia el servidor MySQL, especificando el puerto y el nombre de la base de datos.
- Usuario por defecto: root.
- Contraseña: Vacía (sin contraseña).
- Un parámetro llamado "spring.jpa.hibernate.ddl-auto=update" que indica que, al iniciar la aplicación, actualice automáticamente la estructura de la base de datos para que coincida con las entidades del proyecto.

Una vez confirmé que toda la configuración coincidía con mi entorno, ejecuté el proyecto de dos maneras:

- Desde el IDE: Usando el botón de ejecución de IntelliJ IDEA.
- Desde la terminal: Con el comando ""./gradlew bootRun". Este método lo aprendí gracias al apoyo de la IA ChatGPT, ya que no conocía previamente cómo iniciar un proyecto Gradle desde la terminal.

- - Complicaciones al momento de ejecutar el archivo "Examen1Back2Application":

Cuando inicialmente traté de ejecutar mi proyecto, el IDE no me permitía usar su botón de ejecución. Seguidamente, investigué cómo correr el proyecto Gradle desde la terminal, pero al ejecutar el comando para realizar dicha acción, la terminal me devolvía varios errores.
Uno de ellos indicaba problemas con la versión de Java, pues yo tenía instalada la versión 8, mientras que el proyecto requería la 17 o superior (no estoy segura si esto venía intencionalmente o si fue algo que me ocurrió solo a mí debido a la configuración previa de mi PC). Además, también me pedía hacer algunas configuraciones en las variables de entorno de mi máquina local.

Para solucionarlo, descargué e instalé, desde la página oficial de Adoptium, la versión de Java que se me solicitaba. Luego, revisé manualmente que:

- JAVA_HOME apuntara correctamente a la carpeta donde se instaló Java.
- PATH incluyera la ruta de la carpeta de Java.

Después de reiniciar la terminal y verificar la instalación con el comando "java -version", esta me confirmó que estaba usando la versión correcta. Con esto, ya pude ejecutar el proyecto de las dos maneras que anteriormente había estado utilizando, y posteriormente, la conexión con la base de datos se logró, pudiendo así visualizar las tres tablas SQL (curso, docente y usuario).

(La configuración de variables de entorno necesarias y los comandos, tanto para revisar la versión de Java en mi máquina como para ejecutar el proyecto Gradle desde la terminal, los aprendí gracias al apoyo de la IA Generativa ChatGPT).