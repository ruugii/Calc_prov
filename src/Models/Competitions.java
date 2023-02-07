package Models;

import java.util.ArrayList;

public class Competitions {
    private ArrayList<Team> equipos = new ArrayList<>();
    private ArrayList<Jornada> jornadas = new ArrayList<>();
    private String name;

    public Competitions(){}

    public Competitions(String name, ArrayList<Team> equipos, ArrayList<Jornada> jornadas) {
        this.equipos = equipos;
        this.name = name;
        this.jornadas = jornadas;
    }

    public ArrayList<Team> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Team> equipos) {
        this.equipos = equipos;
    }

    public ArrayList<Jornada> getJornadas() {
        return jornadas;
    }

    public void setJornadas(ArrayList<Jornada> jornadas) {
        this.jornadas = jornadas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Team getTeamByName(String name) {
        for (int i = 0; i < this.equipos.size(); i++) {
            if (this.equipos.get(i).getName().equalsIgnoreCase(name)){
                return this.equipos.get(i);
            }
        }
        return null;
    }
}
