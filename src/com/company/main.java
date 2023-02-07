package com.company;

import Models.Competitions;
import Models.Jornada;
import Models.Partido;
import Models.Team;

import java.util.*;

public class main {

        final String menu = "Elige la opcion:\n\t1.- Ver todos los equipos\n\t2.- Ver todas las jornadas\n\t3.- Ver jornadas por jugar\n\t4.- Calcular casos";
        final String menuLiga = "Que liga deseas visualizar?\n\t1.- LEC\n\t2.- SL\n\t3.- Salir";
        Competitions competitionAnalize = new Competitions();
        int option;
        int option_2;
        do {
            option_2 = readInt(1, 3, menuLiga);
            switch (option_2){
                case 1:
                     competitionAnalize = genLEC();
                     break;
                case 2:
                    competitionAnalize = genSL();
                    break;
                case 3:
                    System.out.println("Saliendo...");
            }
            option = readInt(1, 4, menu);
            switch (option){
                case 1:
                    ArrayList<Team> teams = competitionAnalize.getEquipos();

                    Collections.sort(teams, new Comparator<Team>() {
                        @Override
                        public int compare(Team o1, Team o2) {
                            Integer a = Integer.valueOf(o2.getWonMatch());
                            Integer b = Integer.valueOf(o1.getWonMatch());
                            return a.compareTo(b);
                        }
                    });

                    for (int i = 0; i < teams.size(); i++) {
                        Team aux = teams.get(i);
                        System.out.println(i+1 +".- " + aux.getName() + " | " + aux.getTotalMatch() + " | " + aux.getWonMatch() + " - " + aux.getLostMatch());
                    }
                    break;
                case 2:
                    ArrayList<Jornada> jornadas = competitionAnalize.getJornadas();
                    for (int i = 0; i < jornadas.size(); i++) {
                        ArrayList<Partido> jornada = jornadas.get(i).getPartidos();
                        System.out.print("Jornada " + (i+1) + ": \n");
                        for (int j = 0; j < jornada.size(); j++) {
                            System.out.println("\tPartido " +(j+1) + ": " + jornada.get(j));
                        }
                    }
                    break;
                case 3:
                    ArrayList<Jornada> Alljornadas = competitionAnalize.getJornadas();
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
                    /*
                    for (int i = 0; i < ; i++) {

                        
                    }

                    */
                    System.out.println("WE ARE WORING ON IT");
            }
        } while (option_2 != 3);
    }

    public static Competitions genLEC() {
        Team G2 = new Team("G2");
        Team MAD = new Team("MAD Lions");
        Team VIT = new Team("Vitality");
        Team KOI = new Team("KOI");
        Team SK = new Team("SK Gaming");
        Team EXC = new Team("Excel");
        Team BDS = new Team("BDS");
        Team TH = new Team("Team Heretics");
        Team FNC = new Team("Fnatic");
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
        jornada7.add(new Partido(AST, SK, 1));
        jornada7.add(new Partido(EXC, TH, 2));
        jornada7.add(new Partido(G2, BDS, 1));
        jornada7.add(new Partido(FNC, MAD, 2));
        jornada7.add(new Partido(KOI, VIT, 1));

        ArrayList<Partido> jornada8 = new ArrayList<>();
        jornada8.add(new Partido(SK, EXC, 1));
        jornada8.add(new Partido(BDS, VIT, 2));
        jornada8.add(new Partido(TH, MAD, 2));
        jornada8.add(new Partido(AST, FNC, 1));
        jornada8.add(new Partido(G2, KOI, 1));

        ArrayList<Partido> jornada9 = new ArrayList<>();
        jornada9.add(new Partido(BDS, TH, 1));
        jornada9.add(new Partido(KOI, AST, 1));
        jornada9.add(new Partido(SK, FNC, 1));
        jornada9.add(new Partido(MAD, G2, 1));
        jornada9.add(new Partido(VIT, EXC, 1));

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

        return (new Competitions("LEC", teams, jornadas));
    }

    public static Competitions genSL() {
        Team GSNS = new Team("GUASONES");
        Team HRTS = new Team("Los Heretics");
        Team FNK = new Team("Finetwork KOI");
        Team FNTQ = new Team("Fanatic TQ");
        Team GIA = new Team("Giants");
        Team UCAM = new Team("UCAM Tokiers");
        Team MRS = new Team("Movistar Riders");
        Team BAR = new Team("Barça");
        Team BSO = new Team("Bisons");
        Team RBLS = new Team("Rebels");

        ArrayList<Team> teams= new ArrayList<>();
        teams.add(GSNS);
        teams.add(GIA);
        teams.add(UCAM);
        teams.add(FNK);
        teams.add(MRS);
        teams.add(BAR);
        teams.add(BSO);
        teams.add(HRTS);
        teams.add(FNTQ);
        teams.add(RBLS);

        ArrayList<Partido> jornada1 = new ArrayList<>();
        jornada1.add(new Partido(BSO, BAR, 1));
        jornada1.add(new Partido(MRS, FNTQ, 1));
        jornada1.add(new Partido(GSNS, RBLS, 2));
        jornada1.add(new Partido(HRTS, GIA, 2));
        jornada1.add(new Partido(FNK, UCAM, 2));

        ArrayList<Partido> jornada2 = new ArrayList<>();
        jornada2.add(new Partido(GSNS, UCAM, 2));
        jornada2.add(new Partido(RBLS, HRTS, 2));
        jornada2.add(new Partido(BSO, MRS, 2));
        jornada2.add(new Partido(FNK, BAR, 2));
        jornada2.add(new Partido(GIA, FNTQ, 2));

        ArrayList<Partido> jornada3 = new ArrayList<>();
        jornada3.add(new Partido(RBLS, FNTQ, 1));
        jornada3.add(new Partido(GSNS, BAR, 2));
        jornada3.add(new Partido(HRTS, UCAM, 1));
        jornada3.add(new Partido(BSO, FNK ,1));
        jornada3.add(new Partido(MRS, GIA, 1));

        ArrayList<Partido> jornada4 = new ArrayList<>();
        jornada4.add(new Partido(GSNS, FNK, 2));
        jornada4.add(new Partido(RBLS, MRS, 1));
        jornada4.add(new Partido(BSO, GIA, 1));
        jornada4.add(new Partido(BAR, HRTS, 1));
        jornada4.add(new Partido(UCAM, FNTQ, 2));

        ArrayList<Partido> jornada5 = new ArrayList<>();
        jornada5.add(new Partido(GSNS, BSO,2));
        jornada5.add(new Partido(UCAM, MRS,2));
        jornada5.add(new Partido(BAR, FNTQ,2));
        jornada5.add(new Partido(FNK, HRTS,2));
        jornada5.add(new Partido(RBLS, GIA,1));

        ArrayList<Partido> jornada6 = new ArrayList<>();
        jornada6.add(new Partido(GSNS, HRTS, 2));
        jornada6.add(new Partido(FNK, FNTQ,1));
        jornada6.add(new Partido(UCAM, GIA,2));
        jornada6.add(new Partido(BAR, MRS, 2));
        jornada6.add(new Partido(BSO, RBLS, 1));

        ArrayList<Partido> jornada7 = new ArrayList<>();
        jornada7.add(new Partido(BSO, HRTS, 1));
        jornada7.add(new Partido(RBLS, UCAM, 1));
        jornada7.add(new Partido(GSNS, FNTQ, 2));
        jornada7.add(new Partido(BAR, GIA, 1));
        jornada7.add(new Partido(FNK, MRS, 1));

        ArrayList<Partido> jornada8 = new ArrayList<>();
        jornada8.add(new Partido(BSO, UCAM));
        jornada8.add(new Partido(HRTS, FNTQ));
        jornada8.add(new Partido(RBLS, BAR));
        jornada8.add(new Partido(GSNS, MRS));
        jornada8.add(new Partido(FNK, GIA));

        ArrayList<Partido> jornada9 = new ArrayList<>();
        jornada9.add(new Partido(BSO, FNTQ));
        jornada9.add(new Partido(BAR, UCAM));
        jornada9.add(new Partido(HRTS, MRS));
        jornada9.add(new Partido(RBLS, FNK));
        jornada9.add(new Partido(GSNS, GIA));

        ArrayList<Partido> jornada10 = new ArrayList<>();
        jornada10.add(new Partido(BSO, BAR));
        jornada10.add(new Partido(MRS, FNTQ));
        jornada10.add(new Partido(GSNS, RBLS));
        jornada10.add(new Partido(HRTS, GIA));
        jornada10.add(new Partido(FNK, UCAM));

        ArrayList<Partido> jornada11 = new ArrayList<>();
        jornada11.add(new Partido(GSNS, UCAM));
        jornada11.add(new Partido(RBLS, HRTS));
        jornada11.add(new Partido(BSO, MRS));
        jornada11.add(new Partido(FNK, BAR));
        jornada11.add(new Partido(GIA, FNTQ));

        ArrayList<Partido> jornada12 = new ArrayList<>();
        jornada12.add(new Partido(RBLS, FNTQ));
        jornada12.add(new Partido(GSNS, BAR));
        jornada12.add(new Partido(HRTS, UCAM));
        jornada12.add(new Partido(BSO, FNK));
        jornada12.add(new Partido(MRS, GIA));

        ArrayList<Partido> jornada13 = new ArrayList<>();
        jornada13.add(new Partido(GSNS, FNK));
        jornada13.add(new Partido(RBLS, MRS));
        jornada13.add(new Partido(BSO, GIA));
        jornada13.add(new Partido(BAR, HRTS));
        jornada13.add(new Partido(UCAM, FNTQ));

        ArrayList<Partido> jornada14 = new ArrayList<>();
        jornada14.add(new Partido(GSNS, BSO));
        jornada14.add(new Partido(UCAM, MRS));
        jornada14.add(new Partido(BAR, FNTQ));
        jornada14.add(new Partido(FNK, HRTS));
        jornada14.add(new Partido(RBLS, GIA));

        ArrayList<Partido> jornada15 = new ArrayList<>();
        jornada15.add(new Partido(GSNS, HRTS));
        jornada15.add(new Partido(FNK, FNTQ));
        jornada15.add(new Partido(UCAM, GIA));
        jornada15.add(new Partido(BAR, MRS));
        jornada15.add(new Partido(BSO, RBLS));

        ArrayList<Partido> jornada16 = new ArrayList<>();
        jornada16.add(new Partido(BSO, HRTS));
        jornada16.add(new Partido(RBLS, UCAM));
        jornada16.add(new Partido(GSNS, FNTQ));
        jornada16.add(new Partido(BAR, GIA));
        jornada16.add(new Partido(FNK, MRS));

        ArrayList<Partido> jornada17 = new ArrayList<>();
        jornada17.add(new Partido(BSO, UCAM));
        jornada17.add(new Partido(HRTS, FNTQ));
        jornada17.add(new Partido(RBLS, BAR));
        jornada17.add(new Partido(GSNS, MRS));
        jornada17.add(new Partido(FNK, GIA));

        ArrayList<Partido> jornada18 = new ArrayList<>();
        jornada18.add(new Partido(BSO, FNTQ));
        jornada18.add(new Partido(BAR, UCAM));
        jornada18.add(new Partido(HRTS, MRS));
        jornada18.add(new Partido(RBLS, FNK));
        jornada18.add(new Partido(GSNS, GIA));

        Jornada jornada1_completa = new Jornada(jornada1);
        Jornada jornada2_completa = new Jornada(jornada2);
        Jornada jornada3_completa = new Jornada(jornada3);

        Jornada jornada4_completa = new Jornada(jornada4);
        Jornada jornada5_completa = new Jornada(jornada5);
        Jornada jornada6_completa = new Jornada(jornada6);

        Jornada jornada7_completa = new Jornada(jornada7);
        Jornada jornada8_completa = new Jornada(jornada8);
        Jornada jornada9_completa = new Jornada(jornada9);

        Jornada jornada10_completa = new Jornada(jornada10);
        Jornada jornada11_completa = new Jornada(jornada11);
        Jornada jornada12_completa = new Jornada(jornada12);

        Jornada jornada13_completa = new Jornada(jornada13);
        Jornada jornada14_completa = new Jornada(jornada14);
        Jornada jornada15_completa = new Jornada(jornada15);

        Jornada jornada16_completa = new Jornada(jornada16);
        Jornada jornada17_completa = new Jornada(jornada17);
        Jornada jornada18_completa = new Jornada(jornada18);

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
        jornadas.add(jornada10_completa);
        jornadas.add(jornada11_completa);
        jornadas.add(jornada12_completa);
        jornadas.add(jornada13_completa);
        jornadas.add(jornada14_completa);
        jornadas.add(jornada15_completa);
        jornadas.add(jornada16_completa);
        jornadas.add(jornada17_completa);
        jornadas.add(jornada18_completa);

        return (new Competitions("SL", teams, jornadas));
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
