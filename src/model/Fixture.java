package model;

import java.util.Calendar;

/**
 * Created by AKEJU  FATAI on 2016-12-31.
 */
public class Fixture {

    private Team homeTeam;

    private Team awayTeam;

    private Calendar date;

    public Fixture(){

    }

    public Team getHomeTeam(){

        return homeTeam;

    }

    public void setHomeTeam(Team homeTeam){

        this.homeTeam = homeTeam;

    }

    public Team getAwayTeam(){

        return awayTeam;

    }

    public void setAwayTeam(Team awayTeam){

        this.awayTeam =  awayTeam;

    }

    public Calendar getDate(){

        return date;

    }

    public void setDate(Calendar date){

        this.date = date;

    }

}
