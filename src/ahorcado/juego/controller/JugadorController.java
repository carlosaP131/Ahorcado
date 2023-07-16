/** **************************************************************************************************
 *Autor:Carlos Aurelio Alcántara Pérez
 *Fecha de creación: 07-04-2022 ***
 *Fecha de actualización:07-04-2022
 *Descripción: controller
 **
 * ************************************************************************************************ */
package ahorcado.juego.controller;

import java.util.List;

import ahorcado.juego.model.Jugador_Model;
import ahorcado.juego.pojo.Jugador;
import javax.swing.table.DefaultTableModel;

public class JugadorController {

    private Jugador_Model model = new Jugador_Model();

    public List<Jugador> crearJugador(List<Jugador> lista, Jugador jugador) {
        return model.crearJugador(lista, jugador);
        
    }

    public List<Jugador> eliminarJugador(List<Jugador> lista, long idJugador) {
        return model.eliminarJugador(lista, idJugador);
    }

    public void mostrarJugador(List<Jugador> lista, DefaultTableModel modelo) {
        model.mostrarJugador(lista, modelo);
    }
}
