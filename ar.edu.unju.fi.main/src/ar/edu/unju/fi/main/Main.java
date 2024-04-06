package ar.edu.unju.fi.main;

import java.util.Scanner;
import ar.edu.unju.fi.Model.Alumno;
import ar.edu.unju.fi.Model.Materia;
import ar.edu.unju.fi.Model.RegistroNota;

public class Main {
	
	public static void main(String[] args) {
		
	Alumno alumno = new Alumno() ;
	Scanner scanner = new Scanner(System.in);
	System.out.println("ingrese legajo:");
	Integer legajo = scanner.nextInt();
	System.out.println("ingrese apellido:");
	String apellido = scanner.next();
	System.out.println("ingrese nombre:");
	String nombre = scanner.next();
	
	alumno.setLegajo(legajo);
	alumno.setApellido(apellido);
	alumno.setNombre(nombre);
	
	System.out.println(alumno.toString());
	
	int numMaterias = 1;
	
	while(numMaterias <= 4) {
		// cargar materias
		System.out.println("Ingrese codigo de la materia:");
		String codigoMateria = scanner.next();
		System.out.println("Ingrese nombre de la materia:");
		String nombreMateria = scanner.next();
	
		Materia materia = new Materia(codigoMateria, nombreMateria);
		
		System.out.println("Ingrese codigo del registro de la nota:");
		String codigoNota = scanner.next();
		System.out.println("Ingrese la nota final:");
		float nota = scanner.nextFloat();
	
		RegistroNota registroNota = new RegistroNota(codigoNota, alumno, materia, nota);
		
		System.out.println(registroNota.toString());
		numMaterias++;
				
	}
	
	
	
	
	}
}
