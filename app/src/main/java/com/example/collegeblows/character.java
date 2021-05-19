package com.example.collegeblows;

import java.io.Serializable;

public class character implements Serializable {
    int charis, intel, dex, stren, consti;
    public character(){
        this.charis = 0;
        this.intel = 0;
        this.dex = 0;
        this.stren = 0;
        this.consti = 0;
    }

    public character(int c, int i, int d, int s, int ci){
        this.charis = c;
        this.intel = i;
        this.dex = d;
        this.stren = s;
        this.consti = ci;
    }

    public int getCharis() {
        return charis;
    }

    public int getConst() {
        return consti;
    }

    public int getDex() {
        return dex;
    }

    public int getInt() {
        return intel;
    }

    public int getStren() {
        return stren;
    }

    public void increaseStat(String stat){
        switch(stat) {
            case ("char"):
                this.charis += 1;
                break;
            case ("int"):
                this.intel += 1;
                break;
            case ("dex"):
                this.dex += 1;
                break;
            case ("str"):
                this.stren += 1;
                break;
            case ("const"):
                this.consti += 1;
                break;
            default:
                throw(new Error("Unknown Statistic"));
        }
    }
    public boolean statCheck(String stat, int i){
        switch(stat) {
            case ("char"):
                return this.charis >= i;
            case ("int"):
                return this.intel >= i;
            case ("dex"):
                return this.dex >= i;
            case ("str"):
                return this.stren >= i;
            case ("const"):
                return this.consti >= 1;
            default:
                throw(new Error("Unknown Statistic"));
        }
    }

    public void setStat(String stat, int i){
        switch(stat) {
            case ("char"):
                this.charis = i;
                break;
            case ("int"):
                this.intel = i;
                break;
            case ("dex"):
                this.dex = i;
                break;
            case ("str"):
                this.stren = i;
                break;
            case ("const"):
                this.consti = i;
                break;
            default:
                throw(new Error("Unknown Statistic"));
        }
    }

}
