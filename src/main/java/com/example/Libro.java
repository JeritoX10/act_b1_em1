package com.example;

public class Libro {
    // Declarar atributos privados para titulo, autor y precio
    private String titulo;
    private String autor;
    private double precio;

    // Crear constructor con todos los atributos (titulo, autor, precio)
    public Libro(String titulo, String autor, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    // Crear constructor con solo titulo y autor (precio = 0.0)
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = 0.0;
    }

    // Implementar métodos getter para cada atributo
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPrecio() {
        return precio;
    }

    // Implementar métodos setter para cada atributo
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPrecio(double precio) {
        if (precio >= 0.0) {
            this.precio = precio;
        } else {
            System.out.println("El precio no puede ser negativo.");
        }
    }

    // Crear método aplicarDescuento que reciba porcentaje
    public void aplicarDescuento(double porcentaje) {
        if (porcentaje > 0 && porcentaje <= 100) {
            double descuento = precio * (porcentaje / 100.0);
            setPrecio(precio - descuento);
        }
    }

    // Crear método aplicarDescuento que reciba porcentaje y monto máximo
    public void aplicarDescuento(double porcentaje, double montoMaximo) {
        if (porcentaje > 0 && porcentaje <= 100 && montoMaximo >= 0) {
            double descuento = precio * (porcentaje / 100.0);
            if (descuento <= montoMaximo) {
                setPrecio(precio - descuento);
            }
        }
    }

    // Crear método mostrarInformacion que imprima los datos del libro
    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Precio: " + precio);
    }
}
