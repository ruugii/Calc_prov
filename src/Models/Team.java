package Models;

public class Team {
    private String name;
    private int wonMatch;
    private int lostMatch;
    private int totalMatch;

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
}
