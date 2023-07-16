/** **************************************************************************************************
 *Autor:Carlos Aurelio Alcántara Pérez
 *Fecha de creación: 07-04-2022 ***
 *Fecha de actualización:07-04-2022
 *Descripción: model de jugador
 *
 **
 * ************************************************************************************************ */
package ahorcado.juego.model;

import java.util.List;
import ahorcado.juego.pojo.Jugador;
import javax.swing.table.DefaultTableModel;

public class Jugador_Model {
//operaciones CRUD C=create R=read D=delete 

    public List<Jugador> crearJugador(List<Jugador> lista, Jugador jugador) {
        lista.add(jugador);
        return lista;
    }

    public List<Jugador> eliminarJugador(List<Jugador> lista, long idJugador) {
        Jugador jugador = new Jugador();
        jugador = lista.get((int) idJugador);
        lista.remove(jugador);
        return lista;
    }

    public void mostrarJugador(List<Jugador> lista, DefaultTableModel model) {
        int i;
        model.setRowCount(0);
        for (i = 0; i < lista.size(); i++) {
            Object[] fila = new Object[4];
            fila[0] = lista.get(i).getNombre();
            fila[1] = lista.get(i).getApodo();
            fila[2] = lista.get(i).getEdad();
            fila[3] = lista.get(i).getPuntaje();
            model.addRow(fila);
        }

    }

}
