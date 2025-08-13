package cl.bootcamp;

import java.util.ArrayList;
import java.util.Scanner;

public class Notas {
	
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
		 ArrayList<Double> notas = new ArrayList<>(5);
		
		 int cantidad = 0;
		 int opcion; 
		 
		
		
		
		 
		 do {
			 
			 System.out.println("---Menú de notas---"
				 		+ "\n 1- Agregar Notas"
						 +" \n 2- Modificar una nota"
				 		+ "\n 3- Eliminar una nota "
						 + "\n 4- Mostrar las notas"
				 		+  "\n 5- Salir" );
				 
				 System.out.println("Elija una opción: ");
				 
				 opcion = scanner.nextInt();
			 
			 
			
			 
			 if (opcion == 1) {
				 
				 System.out.println("Ingresa el numero del estudiante");
				 int numEstudiante = scanner.nextInt();
				 
				 System.out.println("Ingresa la nota del estudiante");
				 double soloNota = scanner.nextDouble();
				 
				 notas.add(soloNota);
			 }
			 
			 else if (opcion == 2) {
				 System.out.println("Ingresa el número del estudiante a modificar");
				  int numModificar = scanner.nextInt();
				  if(numModificar >=1 || numModificar <= 5 ) {
					  
					  System.out.println("Ingresa la nueva nota");
					  double soloNota = scanner.nextDouble();
					  notas.add(soloNota);
			 }
			 }
			 
				 
				  else if (opcion == 3) {
					  
					  System.out.println("Ingresa el número del estudiante a eliminar");
					  int alumEliminar = scanner.nextInt();
					  if(alumEliminar >=1 || alumEliminar <= 5 ) {
						  
						  notas.set(alumEliminar -1, 0.0);
	                        System.out.println("Nota eliminada.");
				 }
					  
				  }
			 
				  else if (opcion == 4) {
					  for(int i = 0 ; i < notas.size() ; i ++)
					  {
						  String estado = (notas.get(i) >= 6.0) ? "Aprobado" : "Reprobado";
						    System.out.println("Estudiante " + (i + 1) + ": " + notas.get(i) + " - " + estado);
					  }
					   if   (notas.size() == 0) {
						   System.out.println("No hay notas agregadas");
					   }
				  }
					 
		
			 
		 }while (opcion != 5);
		 
		 System.out.println("--Saliste del menú--");
			  
			 
			 
			
		 }
		 
					
		


	}

