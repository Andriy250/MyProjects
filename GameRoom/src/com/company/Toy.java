package com.company;

import java.math.BigDecimal;

public class Toy {
    private String name;
    private IPlayable game;
    private BigDecimal price;
    private ChildrenType type;

    public Toy(String name, IPlayable game, BigDecimal price, ChildrenType type){
        this.name = name;
        this.price = price;
        this.type = type;
        this.game = game;
    }

    public void play(){
        game.play();
    }

    public String getName() {
        return name;
    }

    public IPlayable getGame() {
        return game;
    }

    public BigDecimal getPrice() {
        return price;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setGame(IPlayable game) {
        this.game = game;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name;
    }


    public ChildrenType getChsType() {
        return type;
    }

    public void setType(ChildrenType type) {
        this.type = type;
    }

}
