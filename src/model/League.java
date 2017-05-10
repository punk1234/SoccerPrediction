package model;

import java.util.List;

/**
 * Created by AKEJU  FATAI on 2016-12-31.
 */
public class League {

    private String name;

    private Team[] teams;

    private List<Fixture> fixtures;

    public League(){

    }

    public String getName(){

        return name;

    }

    public void setName(String name){

        this.name = name;

    }

    public void setTeams(Team[] teams){
        this.teams = teams;
    }

    public int getTeamCount(){

        return teams.length;

    }

    public Team getTeamAtIndex(int index){

        return teams[index];

    }

    public void setFixtures(List<Fixture> fixtures){
        this.fixtures = fixtures;
    }

    public int getFixturesCount(){
        return fixtures.size();
    }

    public Fixture getFixtureAtIndex(int index){
        return fixtures.get(index);
    }

}
