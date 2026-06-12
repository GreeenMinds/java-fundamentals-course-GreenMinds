import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Registro registro = new Registro();   

        int opcion;
        do {
            System.out.println("\n===== REGISTRO DE ESTUDIANTES =====");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Ver todos los estudiantes");
            System.out.println("3. Ver el promedio del salon");
            System.out.println("4. Salir");
            System.out.print("Que deseas hacer? ");
            opcion = sc.nextInt();
            sc.nextLine();  

            if (opcion == 1) {
                System.out.print("Nombre: ");
                String nombre = sc.nextLine();
                System.out.print("Edad: ");
                int edad = sc.nextInt();
                System.out.print("Nota: ");
                double nota = sc.nextDouble();

                registro.agregar(nombre, edad, nota);

            } else if (opcion == 2) {
                registro.listar();

            } else if (opcion == 3) {
                registro.mostrarPromedio();

            } else if (opcion == 4) {
                System.out.println("Saliendo del registro. Hasta luego!");
            } else {
                System.out.println("Esa opcion no existe, intenta de nuevo.");
            }

        } while (opcion != 4);   

        sc.close();
    }
}

class Registro {
    private Estudiante[] estudiantes = new Estudiante[30];
    private int cantidad = 0;

    public void agregar(String nombre, int edad, double nota) {
        Estudiante e = new Estudiante();
        e.setNombre(nombre);
        e.setEdad(edad);
        e.setNota(nota);

        estudiantes[cantidad] = e;
        cantidad++;
        System.out.println("Estudiante agregado.");
    }

    public void listar() {
        if (cantidad == 0) {
            System.out.println("Todavia no hay estudiantes registrados.");
            return;
        }
        System.out.println("\n--- LISTA DE ESTUDIANTES ---");
        for (int i = 0; i < cantidad; i++) {
            Estudiante e = estudiantes[i];
            System.out.println((i + 1) + ") " + e.getNombre()
                    + " | Edad: " + e.getEdad()
                    + " | Nota: " + e.getNota()
                    + " -> " + (e.aprobo() ? "APROBO" : "DESAPROBO"));
        }
    }

    public void mostrarPromedio() {
        if (cantidad == 0) {
            System.out.println("No hay notas para promediar.");
            return;
        }
        double suma = 0;
        for (int i = 0; i < cantidad; i++) {
            suma = suma + estudiantes[i].getNota();
        }
        System.out.println("Promedio del salon: " + (suma / cantidad));
    }
}

class Estudiante {
    private String nombre;
    private int edad;
    private double nota;

    public void setNombre(String nuevoNombre) { nombre = nuevoNombre; }
    public String getNombre() { return nombre; }

    public void setEdad(int nuevaEdad) { edad = nuevaEdad; }
    public int getEdad() { return edad; }

    public void setNota(double nuevaNota) {
        if (nuevaNota >= 0 && nuevaNota <= 20) {
            nota = nuevaNota;
        } else {
            System.out.println("Nota invalida. Debe estar entre 0 y 20.");
        }
    }
    public double getNota() { return nota; }

    boolean aprobo() { return nota >= 11; }
}
