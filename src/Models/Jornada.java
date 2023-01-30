package Models;

import java.util.ArrayList;

public class Jornada {
    private ArrayList<Partido> partidos = new ArrayList<>();

    public Jornada(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }
}
