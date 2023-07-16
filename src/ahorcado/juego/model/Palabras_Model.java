package ahorcado.juego.model;

import java.util.List;

import ahorcado.juego.pojo.Palabra;

public class Palabras_Model {

    public List<Palabra> crearPalabra(List<Palabra> pala, Palabra palabra) {
        pala.add(palabra);
        return pala;
    }

    public List<Palabra> eliminarPalabra(List<Palabra> pala, long num_palab) {
        Palabra palabra = new Palabra();
        palabra = pala.get((int) num_palab);
        pala.remove(palabra);
        return pala;
    }

    public void mostrarPalabra(List<Palabra> pala) {
        
    }
}
