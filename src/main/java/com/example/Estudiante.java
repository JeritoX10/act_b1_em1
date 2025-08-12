package com.example;

public class Estudiante {
    // Declarar atributos privados para nombre, edad y promedio
    private String nombre;
    private int edad;
    private double promedio;

    // Crear constructor que reciba nombre, edad y promedio como parámetros
    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    // Implementar métodos getter para cada atributo
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPromedio() {
        return promedio;
    }

    // Implementar métodos setter para cada atributo
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad debe ser mayor o igual a 0.");
        }
    }

    public void setPromedio(double promedio) {
        if (promedio >= 0.0 && promedio <= 10.0) {
            this.promedio = promedio;
        } else {
            System.out.println("El promedio debe estar entre 0.0 y 10.0.");
        }
    }

    // Crear método mostrarInformacion que imprima los datos del estudiante
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);
    }
}
