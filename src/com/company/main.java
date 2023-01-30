package com.company;

import Models.Competitions;
import Models.Jornada;
import Models.Partido;
import Models.Team;

import java.util.*;

public class main {

    public static Competitions genTeams() {
        Team G2 = new Team("G2");
        Team MAD = new Team("MAD Lions");
        Team VIT = new Team("Vitality");
        Team KOI = new Team("KOI");
        Team SK = new Team("SK Gaming");
        Team EXC = new Team("Excel");
        Team BDS = new Team("BDS");
        Team TH = new Team("Team Heretics");
        Team FNC = new Team("Fanatic");
        Team AST = new Team("Astralis");

        ArrayList<Team> teams= new ArrayList<>();
        teams.add(G2);
        teams.add(MAD);
        teams.add(VIT);
        teams.add(KOI);
        teams.add(SK);
        teams.add(EXC);
        teams.add(BDS);
        teams.add(TH);
        teams.add(FNC);
        teams.add(AST);

        ArrayList<Partido> jornada1 = new ArrayList<>();
        jornada1.add(new Partido(EXC, G2, 2));
        jornada1.add(new Partido(KOI, BDS, 1));
        jornada1.add(new Partido(AST, TH, 2));
        jornada1.add(new Partido(MAD, SK, 1));
        jornada1.add(new Partido(VIT, FNC, 1));

        ArrayList<Partido> jornada2 = new ArrayList<>();
        jornada2.add(new Partido(SK, BDS, 2));
        jornada2.add(new Partido(AST, MAD, 2));
        jornada2.add(new Partido(VIT, TH, 1));
        jornada2.add(new Partido(EXC, KOI, 2));
        jornada2.add(new Partido(FNC, G2, 2));

        ArrayList<Partido> jornada3 = new ArrayList<>();
        jornada3.add(new Partido(TH, SK, 2));
        jornada3.add(new Partido(BDS, EXC, 2));
        jornada3.add(new Partido(G2, AST, 1));
        jornada3.add(new Partido(KOI, FNC ,2));
        jornada3.add(new Partido(MAD, VIT, 2));

        ArrayList<Partido> jornada4 = new ArrayList<>();
        jornada4.add(new Partido(VIT, AST, 1));
        jornada4.add(new Partido(FNC, BDS, 2));
        jornada4.add(new Partido(TH, KOI, 1));
        jornada4.add(new Partido(SK, G2, 1));
        jornada4.add(new Partido(MAD, EXC,1));

        ArrayList<Partido> jornada5 = new ArrayList<>();
        jornada5.add(new Partido(AST, BDS,2));
        jornada5.add(new Partido(VIT, SK,2));
        jornada5.add(new Partido(TH, G2,2));
        jornada5.add(new Partido(EXC, FNC,2));
        jornada5.add(new Partido(KOI, MAD,2));

        ArrayList<Partido> jornada6 = new ArrayList<>();
        jornada6.add(new Partido(EXC, AST,2));
        jornada6.add(new Partido(BDS, MAD,1));
        jornada6.add(new Partido(SK, KOI,1));
        jornada6.add(new Partido(G2, VIT, 2));
        jornada6.add(new Partido(FNC, TH, 2));

        ArrayList<Partido> jornada7 = new ArrayList<>();
        jornada7.add(new Partido(AST, SK));
        jornada7.add(new Partido(EXC, TH));
        jornada7.add(new Partido(G2, BDS));
        jornada7.add(new Partido(FNC, MAD));
        jornada7.add(new Partido(KOI, VIT));

        ArrayList<Partido> jornada8 = new ArrayList<>();
        jornada8.add(new Partido(SK, EXC));
        jornada8.add(new Partido(BDS, VIT));
        jornada8.add(new Partido(TH, MAD));
        jornada8.add(new Partido(AST, FNC));
        jornada8.add(new Partido(G2, KOI));

        ArrayList<Partido> jornada9 = new ArrayList<>();
        jornada9.add(new Partido(BDS, TH));
        jornada9.add(new Partido(KOI, AST));
        jornada9.add(new Partido(SK, FNC));
        jornada9.add(new Partido(MAD, G2));
        jornada9.add(new Partido(VIT, EXC));

        Jornada jornada1_completa = new Jornada(jornada1);
        Jornada jornada2_completa = new Jornada(jornada2);
        Jornada jornada3_completa = new Jornada(jornada3);

        Jornada jornada4_completa = new Jornada(jornada4);
        Jornada jornada5_completa = new Jornada(jornada5);
        Jornada jornada6_completa = new Jornada(jornada6);

        Jornada jornada7_completa = new Jornada(jornada7);
        Jornada jornada8_completa = new Jornada(jornada8);
        Jornada jornada9_completa = new Jornada(jornada9);

        ArrayList<Jornada> jornadas = new ArrayList<>();
        jornadas.add(jornada1_completa);
        jornadas.add(jornada2_completa);
        jornadas.add(jornada3_completa);
        jornadas.add(jornada4_completa);
        jornadas.add(jornada5_completa);
        jornadas.add(jornada6_completa);
        jornadas.add(jornada7_completa);
        jornadas.add(jornada8_completa);
        jornadas.add(jornada9_completa);

        Competitions LEC = new Competitions("LEC", teams, jornadas);

        return LEC;
    }

    public static void main(String[] args) {
        final String menu = "Elige la opcion:\n\t1.- Ver todos los equipos\n\t2.- Ver todas las jornadas\n\t3.- Ver jornadas por jugar\n\t4.- Calcular casos\n\t5.- Salir";
        Competitions LEC = genTeams();
        int option = 0;
        do {
            option = readInt(1, 5, menu);
            switch (option){
                case 1:
                    ArrayList<Team> teams = LEC.getEquipos();

                    Collections.sort(teams, new Comparator<Team>() {
                        @Override
                        public int compare(Team o1, Team o2) {
                            return new Integer(o2.getWonMatch()).compareTo(new Integer(o1.getWonMatch()));
                        }
                    });

                    for (int i = 0; i < teams.size(); i++) {
                        Team aux = teams.get(i);
                        System.out.println(i+1 +".- " + aux.getName() + " | " + aux.getTotalMatch() + " | " + aux.getWonMatch() + " - " + aux.getLostMatch());
                    }
                    break;
                case 2:
                    ArrayList<Jornada> jornadas = LEC.getJornadas();
                    for (int i = 0; i < jornadas.size(); i++) {
                        ArrayList<Partido> jornada = jornadas.get(i).getPartidos();
                        System.out.print("Jornada " + (i+1) + ": \n");
                        for (int j = 0; j < jornada.size(); j++) {
                            System.out.println("\tPartido " +(j+1) + ": " + jornada.get(j));
                        }
                    }
                    break;
                case 3:
                    ArrayList<Jornada> Alljornadas = LEC.getJornadas();
                    for (int i = 0; i < Alljornadas.size(); i++) {
                        ArrayList<Partido> jornada = Alljornadas.get(i).getPartidos();
                        System.out.print("Jornada " + (i+1) + ": \n");
                        for (int j = 0; j < jornada.size(); j++) {
                            if (jornada.get(j).getWinner() == 0) {
                                System.out.println("\tPartido " +(j+1) + ": " + jornada.get(j));
                            } else {

                            }
                            if (j == jornada.size()-1 && jornada.get(j).getWinner() != 0){
                                System.out.println("\tJORNADA ACABADA");
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("WE ARE WORING ON IT");
            }
        } while (option != 5);





    }

    public static int readInt (int numMin, int numMax, String menu) {
        Scanner read = new Scanner(System.in);
        while (true) {
            System.out.println(menu);
            if (read.hasNextInt()) {
                int a = read.nextInt();
                read.nextLine();
                if (a >= numMin && a <= numMax) {
                    return a;
                }
            }
        }
    }
}
