package cl.bootcamp;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		 
		        Scanner scanner = new Scanner(System.in);

		        double[] notas = new double[5]; // Array para 5 estudiantes
		        boolean salir = false;

		        while (!salir) {
		            System.out.println("\n--- Menú de Opciones ---");
		            System.out.println("1. Agregar nota");
		            System.out.println("2. Modificar nota");
		            System.out.println("3. Eliminar nota");
		            System.out.println("4. Mostrar todas las notas");
		            System.out.println("5. Calcular promedio");
		            System.out.println("6. Salir");
		            System.out.print("Seleccione una opción: ");
		            int opcion = scanner.nextInt();

		            switch (opcion) {
		                case 1: // Agregar nota
		                    System.out.print("Ingrese el número de estudiante (1-5): ");
		                    int estudianteAgregar = scanner.nextInt();
		                    if (estudianteAgregar >= 1 && estudianteAgregar <= 5) {
		                        System.out.print("Ingrese la nota: ");
		                        double nota = scanner.nextDouble();
		                        notas[estudianteAgregar - 1] = nota;
		                        System.out.println("Nota registrada.");
		                    } else {
		                        System.out.println("Número de estudiante inválido.");
		                    }
		                    break;

		                case 2: // Modificar nota
		                    System.out.print("Ingrese el número de estudiante (1-5): ");
		                    int estudianteModificar = scanner.nextInt();
		                    if (estudianteModificar >= 1 && estudianteModificar <= 5) {
		                        System.out.print("Ingrese la nueva nota: ");
		                        double nuevaNota = scanner.nextDouble();
		                        notas[estudianteModificar - 1] = nuevaNota;
		                        System.out.println("Nota modificada.");
		                    } else {
		                        System.out.println("Número de estudiante inválido.");
		                    }
		                    break;

		                case 3: // Eliminar nota
		                    System.out.print("Ingrese el número de estudiante (1-5): ");
		                    int estudianteEliminar = scanner.nextInt();
		                    if (estudianteEliminar >= 1 && estudianteEliminar <= 5) {
		                        notas[estudianteEliminar - 1] = 0;
		                        System.out.println("Nota eliminada.");
		                    } else {
		                        System.out.println("Número de estudiante inválido.");
		                    }
		                    break;

		                case 4: // Mostrar todas las notas
		                    System.out.println("Notas de los estudiantes:");
		                    for (int i = 0; i < notas.length; i++) {
		                        String estado = (notas[i] >= 6.0) ? "Aprobado" : "Reprobado";
		                        System.out.println("Estudiante " + (i + 1) + ": " + notas[i] + " - " + estado);
		                    }
		                    break;

		                case 5: // Calcular promedio
		                    double suma = 0;
		                    for (double nota : notas) {
		                        suma += nota;
		                    }
		                    double promedio = suma / notas.length;
		                    System.out.println("Promedio de las notas: " + promedio);
		                    if (promedio >= 6.0) {
		                        System.out.println("El grupo está aprobado.");
		                    } else {
		                        System.out.println("El grupo está reprobado.");
		                    }
		                    break;

		                case 6:
		                    salir = true;
		                    System.out.println("Saliendo del sistema...");
		                    break;

		                default:
		                    System.out.println("Opción inválida.");
		            }
		        }

		        scanner.close();
		    }
	
}
