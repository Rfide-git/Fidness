/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fidness;

/**
 *
 * @author ramon
 */
public class Usuario extends Persona {
    
    private String nombreUsuario;
    private String contrasena;

    public Usuario(String nombre, String nombreUsuario, String contrasena) {
        super(nombre);
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }
    
    public boolean validarAcceso(String nombreUsuario,
            String contrasena) {

        return this.nombreUsuario.equalsIgnoreCase(nombreUsuario)
                && this.contrasena.equals(contrasena);
    }
    
    @Override
    public String mostrarInformacion() {
        return "Bienvenido " + getNombre();
    }
    
}
