/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fidness;

/**
 *
 * @author ramon
 */
public class Ejercicio {
    
    private String nombre;
    private String descripcion;
    private String instrucciones;
    private Categoria categoria;

    public Ejercicio(String nombre, String descripcion, String instrucciones, Categoria categoria) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.instrucciones = instrucciones;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public Categoria getCategoria() {
        return categoria;
    }
    
    public String mostrarInformacion() {
        return "Ejercicio: " + nombre
                + "\nCategoría: " + categoria.getNombre()
                + "\n\nDescripción:\n" + descripcion
                + "\n\nInstrucciones:\n" + instrucciones;
    }
    
}
