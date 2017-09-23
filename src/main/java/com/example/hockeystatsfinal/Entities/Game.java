package com.example.hockeystatsfinal.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Game {

    private long gameId;

    private int date;

    private List<Team> teams;

    private List<Stats> stats;

    public Game(long gameId, int date, List<Team> teams, List<Stats> stats) {
        this.gameId = gameId;
        this.date = date;
        this.teams = teams;
        this.stats = stats;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return gameId;
    }

    public void setId(long id) {
        this.gameId = id;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "games", cascade = CascadeType.ALL)
    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public long getGameId() {
        return gameId;
    }

    public void setGameId(long gameId) {
        this.gameId = gameId;
    }

    @OneToMany(mappedBy = "game", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    public List<Stats> getStats() {
        return stats;
    }

    public void setStats(List<Stats> stats) {
        this.stats = stats;
    }
}
