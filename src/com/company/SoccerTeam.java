package com.company;

import com.sun.source.tree.Scope;

public class SoccerTeam {
    private static int numGames;
    private static int numGoals;
    private int win;
    private int lose;
    private int tie;



    public SoccerTeam(){
        win=0;
        lose=0;
        tie=0;
    }
    public void played(SoccerTeam other, int myScore, int otherScore){
        numGames++;
        numGoals+= myScore+otherScore;
        if (myScore==otherScore){
            this.tie++;
            other.tie++;
        }
        if (myScore>otherScore){
            this.win++;
            other.lose++;
        }
        if (myScore<otherScore){
            this.lose++;
            other.win++;
        }
    }
    public int getPoints(){
        return 3*this.win+this.tie;
    }
    public void reset(){
        this.win=0;
        this.tie=0;
        this.lose=0;
    }
    public static void startTournament(){
        numGames=0;
        numGoals=0;
    }

    public static void main(String[] args) {
        SoccerTeam alligators= new SoccerTeam();
        SoccerTeam beavers= new SoccerTeam();
        SoccerTeam cheetahs= new SoccerTeam();
        SoccerTeam ducks= new SoccerTeam();

        startTournament();

        alligators.played(beavers, 5,3);
        alligators.played(cheetahs, 6,7 );
        beavers.played(cheetahs, 2,4);
        beavers.played(ducks,9,9);

        System.out.println("aliigator points are:"+alligators.getPoints());
        System.out.println("beaver points are:"+beavers.getPoints());
        System.out.println("cheetahs points are:"+cheetahs.getPoints());
        System.out.println("duck points are:"+ducks.getPoints());

        startTournament();


        // write your code here
    }


}
