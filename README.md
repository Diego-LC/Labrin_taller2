# Taller-Lab02 POO
Taller 2 POO métodos, pruebas unitarias y gestión de errores
### Integrantes:

- Nicolás Sandoval

- Diego Labrin

---

### registro de errores:

errores sintácticos:
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

errores estructurales:

- `do {a = obtenerOpcion(a);} while (a > 0 || a < 6);` Argumento condicional del while cambiado a `while (a < 0 || a > 6);`
- `while (a == 6);` argumento condicional cambiado a `while (a != 6);`
- `int a = -1;` renombrado -> `int opcion = -1;`
- Extraído el bloque try/catch para obtener la opción a un método de la clase
- `public static int opa(String[][] registro) {}` renombrado a `public static int pocisionUltimoCupo(String[][] registro) {}`
- `if(registro[i][0].isEmpty()){}` cambiado a `if(registro[i][0] == null){}`
- `System.out.println("\nIngrese el nombre de la persona"); nombre = ...` añadido