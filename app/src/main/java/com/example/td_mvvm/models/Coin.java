package com.example.td_mvvm.models;

import java.io.Serializable;
import java.util.List;

public class Coin implements Serializable {
    private String symbol;
    private String name;
    private String price;
    private String uuid;
    private int rank;
    private String iconUrl;
    private String marketCap;
    private List<String> sparkline;


    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {return price;}

    public void setPrice(String price) {
        this.price = price;
    }

    public int getRank() { return rank;}

    public void setRank(int rank) {
        this.rank = rank;
    }


    public String getUuid() { return uuid;}

    public void setUuid(String uuid) {this.uuid = uuid;}

    public List<String> getSparkline() {
        return sparkline;
    }

    public void setSparkline(List<String> sparkline) {
        this.sparkline = sparkline;
    }

    public String getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(String marketCap) {
        this.marketCap = marketCap;
    }

    public String getIcon() {
        return iconUrl;
    }

    public void setIcon(String icon) {
        this.iconUrl = icon;
    }
}
