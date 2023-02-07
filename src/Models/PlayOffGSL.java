package Models;

public class PlayOffGSL {
    private String Group;
    private Partido partido1;
    private Partido partido2;
    private Partido partido3;
    private Partido partido4;
    private Partido partido5;

    public PlayOffGSL(String name, Partido partido1, Partido partido2) {
        this.Group = name;
        this.partido1 = partido1;
        this.partido2 = partido2;
        setPartido3();
        setPartido4();
        setPartido5();
    }


    private void setPartido3() {
        if (this.partido2.getTeamWinner() == null) {
            return;
        }
        this.partido3 = new Partido(this.partido1.getTeamWinner(), this.partido2.getTeamWinner());
    }

    private void setPartido4() {
        if (this.partido2.getTeamLose() == null) {
            return;
        }
        this.partido4 = new Partido(this.partido1.getTeamLose(), this.partido2.getTeamLose());
    }

    private void setPartido5() {
        if (this.partido4 == null) {
            return;
        }
        if (this.partido4.getTeamWinner() == null) {
            return;
        }
        this.partido5 = new Partido(this.partido3.getTeamLose(), this.partido4.getTeamWinner());
    }

    public Partido getPartido1() {
        return partido1;
    }

    public void setPartido1Winner(int Winner) {
        this.partido1.setWinner(Winner);;
    }

    public Partido getPartido2() {
        return partido2;
    }

    public void setPartido2Winner(int Winner) {
        this.partido2.setWinner(Winner);;
    }

    public Partido getPartido3() {
        return partido3;
    }

    public void setPartido3Winner(int Winner) {
        this.partido3.setWinner(Winner);;
    }

    public Partido getPartido4() {
        return partido4;
    }

    public void setPartido4Winner(int Winner) {
        this.partido4.setWinner(Winner);;
    }

    public Partido getPartido5() {
        return partido5;
    }

    public void setPartido5Winner(int Winner) {
        this.partido5.setWinner(Winner);;
    }

    @Override
    public String toString() {
        String aux = Group + ": \n\tPartido 1: " + partido1 + " \n\tPartido 2: " + partido2;
        if (partido3 != null) {
            aux = aux + "\n\tPartido 3: " + partido3;
        }
        if (partido4 != null) {
            aux = aux + "\n\tPartido 4: " + partido4;
        }
        if (partido5 != null) {
            aux = aux + "\n\tPartido 5: " + partido5;
        }
        return aux;
    }
}
