package br.edu.saolucas;

import br.edu.saolucas.modelos.Brinquedo;

public class Principal {
	
	public static void main(String[] args) {
		
		Brinquedo newBrinquedo = new Brinquedo();
		Brinquedo oldBrinquedo = new Brinquedo();
			
		newBrinquedo.atribuirType("Esporte");
		newBrinquedo.atribuirDescription("Bola de Futebol");
		newBrinquedo.atribuircategory("Infantil");
	
		oldBrinquedo.atribuirType("Laser");
		oldBrinquedo.atribuirDescription("Boneca");
		oldBrinquedo.atribuircategory("Infantil");
		
		System.out.println("|-------------------------|");
		System.out.println("|-------Brinquedos---------|");
		System.out.println(newBrinquedo.toString());
		System.out.println("\n");
		System.out.println(oldBrinquedo.toString());
		System.out.println("\n");
		
		if ((newBrinquedo.toCompare(oldBrinquedo)) == true){
			System.out.println("OS Brinquedos tem a mesma Categoria");
		} else {
			System.out.println("OS Brinquedos tem categoria Diferentes");
		}
	}

}
