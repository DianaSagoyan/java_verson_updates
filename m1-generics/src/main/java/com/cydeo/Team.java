package com.cydeo;

import java.util.ArrayList;
import java.util.List;

public class Team <T>{
    private String name;
    private List<T> members  = new ArrayList();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println(((Player)player).getName() + " is already on the team");
            return false;
        } else{
            members.add(player);
            System.out.println(((Player)player).getName() + " picked for the team");
            return true;
        }
    }
}
