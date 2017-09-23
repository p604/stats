package com.example.hockeystatsfinal.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class Team {

    private long teamId;

    private String name;

    private String city;

    private String division;

    private String coach;

    private List<Player> players;

    private List<Game> games;

    public Team(){}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return teamId;
    }

    public void setId(long id) {
        this.teamId = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "teams", cascade = CascadeType.ALL)
    @JsonBackReference
    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "game_team", joinColumns = {
            @JoinColumn(name = "team_id", nullable = false)},
            inverseJoinColumns = {@JoinColumn(name = "game_id", nullable = false)})
    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }
}
