package org.app;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Double.parseDouble;


public class Registro {
    public static void main(String[] args) {
        iniciarMenu();
    }

    private static void iniciarMenu() {
        String [][] registro = new String[50][3];
        int opcion = -1;
        do {
            System.out.println("""
                Menú
                1) Agregar persona.
                2) Mostrar la cantidad de personas mayores de edad.
                3) Mostrar la cantidad de personas menores de edad.
                4) Mostrar la cantidad de personas de tercera edad.
                5) Mostrar la cantidad de personas según estado civil (Soltero/a - Casado/a).
                6)Salir.
                """);

            do {
                opcion = obtenerOpcion(opcion);
            }while (opcion < 0 || opcion > 6);

            opcionElegida(opcion, registro);
        }while (opcion != 6);
    }

    private static void opcionElegida(int opcion, String[][] registro) {
        if(opcion == 1) {
            if(hayCupo(registro)) {
                int indiceDisponible = obtenerUltimoEspacio(registro);
                String nombre;
                String Estadocivil;
                int edad;




                while(true) {
                    try {
                        System.out.println("\nIngrese el nombre de la persona");
                        nombre = new Scanner(System.in).nextLine();
                    } catch (InputMismatchException e) {
                        System.err.println("Opción inválida");
                        continue;
                    }
                    break;
                }




                while(true) {
                    try {
                        System.out.println("\nIngrese el estado civil de la persona");
                        Estadocivil = new Scanner(System.in).nextLine();
                    } catch (InputMismatchException e) {
                        System.err.println("Opción inválida");
                        continue;
                    }
                    break;
                }




                while(true) {
                    try {
                        System.out.println("\nIngrese la edad de la persona");
                        edad = new Scanner(System.in).nextInt();
                    } catch (InputMismatchException e) {
                        System.err.println("Opción inválida");
                        continue;
                    }
                    break;
                }




                registro[indiceDisponible][0] = nombre;
                registro[indiceDisponible][1] = Estadocivil;
                registro[indiceDisponible][2] = String.valueOf(edad);
                System.out.println("Persona agregada.");
            } else {
                System.out.println("No hay cupo.");
            }
        } else if(opcion == 2) {

            int mayoresDeEdad = 0;
            for (String[] persona : registro) {
                if (persona[2] != null) {
                    if (parseDouble(persona[2]) >= 18) mayoresDeEdad++;
                }
            }


            System.out.println("Hay " + mayoresDeEdad + " mayores de edad.");
        } else if(opcion == 3) {
            int menoresDeEdad = 0;
            int queSera = obtenerUltimoEspacio(registro);




            for (int i = 0; i < queSera; i++) {
                if (parseDouble(registro[i][2]) < 18) menoresDeEdad++;
            }




            System.out.println("Hay " + menoresDeEdad + " menores de edad.");
        } else if(opcion == 4) {
            int mmmm = 0;




            for (String[] persona : registro) {
                if (parseDouble(persona[2]) >= 60 && persona[1].equals("casado/a")) {
                    mmmm++;
                } else if(parseDouble(persona[2]) >= 65 && persona[1].equals("soltero/a")) {
                    mmmm++;
                }
            }
            System.out.println("Hay " + mmmm + " personas de tercera edad");
        } else if(opcion == 5) {
            int c = 0;
            int d = 0;
            for(String[] persona : registro) {
                if(persona[1].equals("casado/a")) {
                    c++;
                } else if(persona[1].equals("soltero/a")) {
                    d++;
                }
            }




            System.out.println("Hay " + d + " casados/as.");
            System.out.println("Hay " + c + " solteros/as.");
        } else if(opcion == 6) {
            System.out.println("Programa finalizado");
        }
    }

    private static int obtenerOpcion(int a) {
        try {
            a = new Scanner(System.in).nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Opción inválida");
        }
        return a;
    }


    public static int obtenerUltimoEspacio(String[][] registro) {
        return registro.length - 1;
    }


    public static boolean hayCupo(String[][] registro) {
        return pocisionUltimoCupo(registro) != 0;
    }




    public static int pocisionUltimoCupo(String[][] registro) {
        for(int i = 0; i < registro.length; i++) {
            if(registro[i][0] == null){
                return registro.length - i;
            }
        }


        return 0;
    }
}