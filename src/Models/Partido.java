package Models;

public class Partido {
    private Team team1;
    private Team team2;
    private int winner = 0;

    public Partido(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    public Partido(Team team1, Team team2 , int winner) {
        this.team1 = team1;
        this.team2 = team2;
        setWinner(winner);
    }

    public void setWinner(int winner){
        this.winner = winner;
        if (winner == 1) {
            this.team1.addWon();
            this.team2.lostMatch();
        } else if (winner == 2) {
            this.team1.lostMatch();
            this.team2.addWon();
        }
    }

    public int getWinner() {
        return winner;
    }

    public Team getTeamWinner() {
        if (winner == 1) {
            return team1;
        } else if (winner == 2){
            return team2;
        } else {
            return null;
        }
    }

    public Team getTeamLose() {
        if (winner == 1) {
            return team2;
        } else if (winner == 2){
            return team1;
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return team1.getName() + " vs " + team2.getName();
    }
}
