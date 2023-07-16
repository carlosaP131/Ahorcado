package ahorcado.juego.controller;

import java.util.List;

import ahorcado.juego.model.Palabras_Model;
import ahorcado.juego.pojo.Palabra;

public class PalabraController {

    private Palabras_Model model = new Palabras_Model();

    public List<Palabra> crearPalabra(List<Palabra> preg, Palabra pregunta) {
        return model.crearPalabra(preg, pregunta);
    }

    public List<Palabra> eliminarPalabra(List<Palabra> pala, long num_palab) {
        return model.eliminarPalabra(pala, num_palab);
    }

    public void mostrarPalabra(List<Palabra> pala) {
        model.mostrarPalabra(pala);
    }
}
