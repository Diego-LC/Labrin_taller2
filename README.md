# Taller-Lab02 POO
Taller 2 POO métodos, pruebas unitarias y gestión de errores
### Integrantes:

- Nicolás Sandoval

- Diego Labrin

---

### registro de errores:

- `String [][] registro = new double[50][3];` Error sintáctico -> `String [][] registro = new String[50][3];`
- `public static boolean hayCupo(double [][] registro) {}` Error en tipo de parámetro recibido -> ``public static boolean hayCupo(String [][] registro) {}``
- `public static int opa(double [][] registro) {}` Error en tipo de parámetro recibido -> `public static int opa(String[][] registro) {}`
- `public static int obtenerUltimoEspacio(double [][] registro) {}` Error en tipo de parámetro recibido -> `public static int obtenerUltimoEspacio(String [][] registro) {}`
- `return registro.length - opa(registro);` Error en operación -> `return registro.length - 1;`
- `edad = new Scanner(System.in).nextLine();` Error en tipo de entrada requerida -> `edad = new Scanner(System.in).nextInt();`
- `registro[indiceDisponible][2] = edad;` Error en tipo de variable a guardar -> `registro[indiceDisponible][2] = String.valueOf(edad);`
- `for (double [] persona : registro) {}` Error en tipo de entrada requerida -> `for (String [] persona : registro) {`
- ` if (persona[2] >= 18) mayoresDeEdad++;}` Error en tipo de variables comparadas -> `if (parseDouble(persona[2]) >= 18) mayoresDeEdad++;`
  - `import static java.lang.Double.parseDouble;` añadida librería necesaria
