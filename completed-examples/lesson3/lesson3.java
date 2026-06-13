public class Main {
    public static void main(String[] args) {
        int[] notas = {8, 15, 5, 6, 18};
        int aprobados = 0;
        int desaprobados = 0;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 11) {
                System.out.println("Nota " + notas[i] + " -> Aprobado :)");
                aprobados++;
            } else {
                System.out.println("Nota " + notas[i] + " -> Desaprobado :(");
                desaprobados++;
            }
        }

        System.out.println("Total aprobados: " + aprobados);
        System.out.println("Total desaprobados: " + desaprobados);

        System.out.println("\n--- Alumnos pendientes de recuperación ---");
        int pendientes = desaprobados;

        while (pendientes > 0) {
            System.out.println("Alumno en recuperación. Pendientes: " + pendientes);
            pendientes--;
        }

        if (desaprobados >= 3) {
            System.out.println("El curso ha sido desaprobado por más del 50%");
        } else {
            System.out.println("El curso va bien");
        }
    }
}
