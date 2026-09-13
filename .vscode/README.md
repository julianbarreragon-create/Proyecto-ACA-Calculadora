# Proyecto ACA - Calculadora

## Información del proyecto

**Estudiante:** Julián Ricardo Barrera González  
**Programa:** Programacion Orientada a Objectos
**Proyecto:** Aca 
**Lenguaje:** Java

---

## Descripción

Este proyecto consiste en el desarrollo de una aplicación de consola
para realizar operaciones matemáticas básicas utilizando conceptos de
Programación Orientada a Objetos (POO).

La aplicación permite al usuario seleccionar una operación desde un
menú y realizar cálculos de suma, resta, multiplicación y división.

El programa funciona mediante la consola y almacena la información
necesaria en memoria, sin utilizar interfaz gráfica ni base de datos.

---

## Funcionalidades

La calculadora cuenta con las siguientes opciones:

1. Sumar dos números.
2. Restar dos números.
3. Multiplicar dos números.
4. Dividir dos números.
5. Salir del programa.

Además, el programa controla los errores cuando el usuario ingresa
datos que no corresponden a números y controla el caso de división
entre cero.

---

## Clases utilizadas

### Clase Calculadora

La clase `Calculadora` representa la calculadora y contiene los datos
y operaciones necesarias para realizar los cálculos.

Sus atributos son:

- `numero1`: primer número de la operación.
- `numero2`: segundo número de la operación.

Sus principales métodos son:

- `sumar()`
- `restar()`
- `multiplicar()`
- `dividir()`

También contiene constructor, getters y setters para trabajar con sus
atributos.

### Clase Main

La clase `Main` contiene el método principal `main()` y permite
ejecutar la aplicación.

En esta clase se encuentra el menú de opciones, la entrada de datos
del usuario y el manejo de las diferentes operaciones.

---

## Conceptos de Programación Orientada a Objetos

En el proyecto se aplican los siguientes conceptos:

### Clases y objetos

Se utiliza la clase `Calculadora` para crear objetos que realizan las
operaciones matemáticas.

### Atributos

La clase `Calculadora` contiene los atributos `numero1` y `numero2`.

### Métodos

Se utilizan métodos para realizar las operaciones:

- Suma
- Resta
- Multiplicación
- División

### Encapsulamiento

Los atributos de la clase `Calculadora` son privados (`private`) y se
accede a ellos mediante getters y setters.

### Constructor

La clase `Calculadora` utiliza un constructor para recibir los dos
números que serán utilizados en las operaciones.

### Manejo de excepciones

Se utiliza `try-catch` para controlar errores de entrada de datos y
para manejar la división entre cero mediante `ArithmeticException`.

---

## Estructura del proyecto

```text
Proyecto-ACA-Calculadora
│
├── README.md
│
└── src
    │
    ├── Main.java
    │
    └── com
        └── proyecto
            └── modelo
                └── Calculadora.java