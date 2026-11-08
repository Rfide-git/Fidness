# Fidness
Proyecto Fidness del curso Programación Cliente/Servidor.
Autor: Ramón Enrique Rodríguez Núñez 
# Descripción
Agregar implementación inicial de Fidness para el Avance 2
## Funcionalidades implementadas
- Iniciar sesión con un usuario previamente registrado. 
- Validar campos obligatorios y credenciales.
- Registrar ejercicios con nombre, categoría, descripción e instrucciones.
- Consultar el catálogo de ejercicios.
- Filtrar ejercicios por categoría.
- Actualizar la consulta para mostrar nuevos registros.
- Consultar la información completa de un ejercicio.
- Cerrar sesión y regresar a la pantalla de acceso.

Estas funciones corresponden a las historias HU01, HU02, HU03 y HU04

## Tecnologías y conceptos utilizados
- Java.
- NetBeans IDE.
- Java Swing.
- Clases y objetos.
- Herencia mediante `Usuario extends Persona`.
- Polimorfismo mediante `mostrarInformacion()`.
- Excepción personalizada `DatosInvalidosException`.
- Colecciones `ArrayList`.
## Clases principales
| Clase | Responsabilidad |
|---|---|
| Persona | Contiene el nombre y define el método mostrarInformacion(). |
| Usuario | Almacena las credenciales y valida el acceso. |
| Categoria | Representa un tipo de ejercicio. |
| Ejercicio | Almacena la información y las instrucciones del ejercicio. |
| Gimnasio | Administra usuarios, categorías y ejercicios. |
| DatosInvalidosException | Informa cuando faltan datos obligatorios. |
## Ventanas

- **VentanaInicioSesion:** solicita usuario y contraseña.
- **VentanaMenuPrincipal:** muestra las opciones disponibles.
- **VentanaRegistrarEjercicio:** permite registrar ejercicios.
- **VentanaConsultarEjercicio:** permite consultar, filtrar y actualizar el catálogo.
- **VentanaDetalleEjercicio:** muestra la información del ejercicio seleccionado.
## Cómo ejecutar el proyecto

1. Descargar el repositorio.
2. Si se descargó, extraer su contenido.
3. Abrir NetBeans.
4. Seleccionar **File > Open Project**.
5. Abrir la carpeta que contiene `build.xml` y `nbproject`.
6. Comprobar que el proyecto tenga configurado un JDK compatible.
7. En **Properties > Run**, seleccionar `fidness.VentanaInicioSesion` como clase principal.
8. Ejecutar el proyecto.
Las ventanas de registro, consulta y detalle deben abrirse desde el menú para recibir los datos compartidos del gimnasio.
## Usuario de demostración

| Dato | Valor |
|---|---|
| Usuario | `fidelitas` |
| Contraseña | `1234` |

## Uso de la aplicación

1. Iniciar sesión.
2. Seleccionar **Registrar Ejercicio**.
3. Completar nombre, categoría, descripción e instrucciones.
4. Presionar **Guardar**.
5. Abrir **Consultar Ejercicio** desde el menú.
6. Seleccionar una categoría o consultar todos los ejercicios.
7. Seleccionar un ejercicio y presionar **Ver Detalle**.
8. Si la consulta estaba abierta al registrar otro ejercicio, presionar **Actualizar**.
## Funcionalidades pendientes

- **HU05:** crear rutinas, agregar y quitar ejercicios y asociarlas al usuario.
- **HU06:** consultar las rutinas del usuario y exportarlas a un archivo de texto.
