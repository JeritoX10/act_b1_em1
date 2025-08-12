package com.example;

public class Main {
    public static void main(String[] args) {

        // 1. Crear dos objetos Estudiante con diferentes valores
        System.out.println("Estudiantes");
        Estudiante estudiante1 = new Estudiante("María", 19, 7.8);
        Estudiante estudiante2 = new Estudiante("Carlos", 23, 8.9);

        // 2. Mostrar la información de ambos estudiantes
        estudiante1.mostrarInformacion();
        estudiante2.mostrarInformacion();

        // 3. Modificar algún atributo usando un setter
        estudiante1.setPromedio(8.5);

        // 4. Mostrar la información actualizada
        estudiante1.mostrarInformacion();
        estudiante2.mostrarInformacion();

        // 1. Crear un libro usando el constructor completo
        System.out.println("Libros");
        Libro libro1 = new Libro("El Principito", "Antoine de Saint-Exupery", 250.0);

        // 2. Crear un libro usando el constructor con solo titulo y autor
        Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes");

        // 3. Mostrar información de ambos libros
        libro1.mostrarInformacion();
        libro2.mostrarInformacion();

        // 4. Aplicar descuento usando ambas versiones del método
        libro1.aplicarDescuento(15); 
        libro2.aplicarDescuento(25, 60); 

        // 5. Mostrar información actualizada de los libros
        libro1.mostrarInformacion();
        libro2.mostrarInformacion();
    }
}