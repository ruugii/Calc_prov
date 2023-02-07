package Models;

import java.util.ArrayList;

public class Team {
    private final String name;
    private int wonMatch;
    private int lostMatch;
    private int totalMatch;
    private ArrayList<Partido> partidos = new ArrayList<>();

    public Team(String name) {
        this.name = name;
        this.wonMatch = 0;
        this.lostMatch = 0;
        this.totalMatch = calcTotal();
    }

    public Team(String name, int won, int lost) {
        this.name = name;
        this.wonMatch = won;
        this.lostMatch = lost;
        this.totalMatch = calcTotal();
    }

    private int calcTotal(){
        totalMatch = this.wonMatch + this.lostMatch;
        return this.wonMatch + this.lostMatch;
    }

    public void addWon() {
        this.wonMatch +=1;
        calcTotal();
    }

    public void lostMatch(){
        this.lostMatch +=1;
        calcTotal();
    }

    public int getTotalMatch() {
        return totalMatch;
    }

    public String getName() {
        return name;
    }

    public int getWonMatch() {
        return wonMatch;
    }

    public int getLostMatch() {
        return lostMatch;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }
}
