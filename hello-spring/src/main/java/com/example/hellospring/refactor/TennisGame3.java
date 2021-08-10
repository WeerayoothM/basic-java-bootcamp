package com.example.hellospring.refactor;

public class TennisGame3 {

    private int p2;
    private int p1;
    private final String p1Name;
    private final String p2Name;

    public TennisGame3(String p1Name, String p2Name) {
        this.p1Name = p1Name;
        this.p2Name = p2Name;
    }

    public String getScore() {
        String s;
        String[] p = new String[]{"Love", "Fifteen", "Thirty", "Forty"};

        // All
        if (isAll()) {
            return p[p1] + "-All";
        }

        // Advantage
        if (Math.abs(p1-p2) == 1 && p1 + p2 > 5){
            s = p1 > p2 ? p1Name : p2Name;
            return "Advantage " + s ;
        }

        // Deuce
        if (isDeuce()) {
            return "Deuce";
        }

        if (p1 < 4 && p2 < 4 && !(p1 + p2 == 6)) {
            // Normal
            return p[p1] + "-" + p[p2];
        }

        // TODO Next
        s = p1 > p2 ? p1Name : p2Name;
        return "Win for " + s;

    }

    private boolean isAll() {
        return p1 == p2 && p1 <= 2;
    }

    private boolean isDeuce() {
        return p1 == p2 && p1 > 2;
    }

    public void wonPoint(String playerName) {
        if ("player1".equals(playerName))
            this.p1 += 1;
        else
            this.p2 += 1;

    }

}
