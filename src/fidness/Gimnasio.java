/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fidness;

import java.util.ArrayList;
/**
 *
 * @author ramon
 */
public class Gimnasio {
    
    private ArrayList<Usuario> usuarios;
    private ArrayList<Categoria> categorias;
    private ArrayList<Ejercicio> ejercicios;
    
    public Gimnasio(){
    
    usuarios = new ArrayList<>();
    categorias = new ArrayList<>();
    ejercicios = new ArrayList<>();
    
    usuarios.add(new Usuario("Fidelitas", "fidelitas", "1234"));

        categorias.add(new Categoria("Pierna", "Ejercicios de piernas"));

        categorias.add(new Categoria("Espalda", "Ejercicios de espalda"));

        categorias.add(new Categoria("Brazo", "Ejercicios de brazos"));
    }
    
    public Usuario iniciarSesion(String nombreUsuario,String contrasena) throws DatosInvalidosException {

        if (nombreUsuario.trim().isEmpty()
                || contrasena.isEmpty()) {

            throw new DatosInvalidosException("Debe ingresar usuario y contraseña.");
        }

        for (Usuario usuario : usuarios) {
            if (usuario.validarAcceso(nombreUsuario.trim(), contrasena)) {

                return usuario;
            }
        }

        return null;
    }

    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }

    public void registrarEjercicio(Ejercicio ejercicio)
            throws DatosInvalidosException {

        if (ejercicio.getNombre().trim().isEmpty()) {
            throw new DatosInvalidosException("Debe ingresar el nombre del ejercicio.");
        }

        if (ejercicio.getCategoria() == null) {
            throw new DatosInvalidosException("Debe seleccionar una categoría.");
        }

        if (ejercicio.getDescripcion().trim().isEmpty()) {
            throw new DatosInvalidosException("Debe ingresar la descripción.");
        }

        if (ejercicio.getInstrucciones().trim().isEmpty()) {
            throw new DatosInvalidosException("Debe ingresar las instrucciones.");
        }

        ejercicios.add(ejercicio);
    }

    public ArrayList<Ejercicio> consultarEjercicios() {
        return new ArrayList<>(ejercicios);
    }

    public ArrayList<Ejercicio> consultarPorCategoria(
            Categoria categoria) {

        ArrayList<Ejercicio> resultado = new ArrayList<>();

        for (Ejercicio ejercicio : ejercicios) {
            if (ejercicio.getCategoria().getNombre().equalsIgnoreCase(categoria.getNombre())) {

                resultado.add(ejercicio);
            }
        }

        return resultado;
    }

}
    

