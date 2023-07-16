/** **************************************************************************************************
 *Autor:Carlos Aurelio Alcántara Pérez
 *Fecha de creación: 07-04-2022 ***
 *Fecha de actualización:07-04-2022
 *Descripción: pojo jugador
 **
 * ************************************************************************************************ */
package ahorcado.juego.pojo;

import ahorcado.juego.view.Juego;

public class Jugador {

    private String nombre;
    private String apodo;
    private int puntaje;
    private String edad;

    public Jugador() {
    }

    public Jugador(String nombre, String apodo, int puntaje, String edad) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.puntaje = puntaje;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void getEdad(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setPuntaje(Juego puntaje) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
