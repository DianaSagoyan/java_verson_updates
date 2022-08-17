package com.cydeo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer bekham= new SoccerPlayer("Bekham");

        Team<SoccerPlayer> liverpool = new Team("Liverpool");

//        liverpool.addPlayer(joe);
//        liverpool.addPlayer(pat);
        liverpool.addPlayer(bekham);

        System.out.println(liverpool.getName());
    }
}
