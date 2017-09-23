package com.example.hockeystatsfinal.Entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Stats implements Serializable{

    private int goals;

    private int assists;

    private int plusMinus;

    private int pim;

    private int ppg;

    private int ppa;

    private int shg;

    private int sha;

    private int gwg;

    private int otg;

    private int shots;

    private Player player;

    private Game game;

    public Stats(int goals, int assists, int plusMinus, int pim, int ppg, int ppa,
                 int shg, int sha, int gwg, int otg, int shots, Player player, Game game) {
        this.goals = goals;
        this.assists = assists;
        this.plusMinus = plusMinus;
        this.pim = pim;
        this.ppg = ppg;
        this.ppa = ppa;
        this.shg = shg;
        this.sha = sha;
        this.gwg = gwg;
        this.otg = otg;
        this.shots = shots;
        this.player = player;
        this.game = game;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    @Id
    @ManyToOne
    @JoinColumn(name = "player_id")
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    @Id
    @ManyToOne
    @JoinColumn(name = "game_id")
    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public int getPlusMinus() {
        return plusMinus;
    }

    public void setPlusMinus(int plusMinus) {
        this.plusMinus = plusMinus;
    }

    public int getPim() {
        return pim;
    }

    public void setPim(int pim) {
        this.pim = pim;
    }

    public int getPpg() {
        return ppg;
    }

    public void setPpg(int ppg) {
        this.ppg = ppg;
    }

    public int getPpa() {
        return ppa;
    }

    public void setPpa(int ppa) {
        this.ppa = ppa;
    }

    public int getShg() {
        return shg;
    }

    public void setShg(int shg) {
        this.shg = shg;
    }

    public int getSha() {
        return sha;
    }

    public void setSha(int sha) {
        this.sha = sha;
    }

    public int getGwg() {
        return gwg;
    }

    public void setGwg(int gwg) {
        this.gwg = gwg;
    }

    public int getOtg() {
        return otg;
    }

    public void setOtg(int otg) {
        this.otg = otg;
    }

    public int getShots() {
        return shots;
    }

    public void setShots(int shots) {
        this.shots = shots;
    }
}
