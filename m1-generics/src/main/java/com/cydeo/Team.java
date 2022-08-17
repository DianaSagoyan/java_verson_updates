package com.cydeo;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> members  = new ArrayList();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean addPlayer(Player player){
        if(members.contains(player)){
            System.out.println(player.getName() + " is already on the team");
            return false;
        } else{
            members.add(player);
            System.out.println(player.getName() + " picked for the team");
            return true;
        }
    }
}
