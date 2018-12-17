package com.company;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;

public class GameRoom {
    private BigDecimal budget;
    private ArrayList<Toy> toys;
    private ArrayList<Toy> currentListOfToys;

    public GameRoom(BigDecimal budget){
        toys = new ArrayList<>();
        currentListOfToys = new ArrayList<>();
        this.budget = budget;
    }

    public void buyToy(Toy toy){
        if ((budget.add(toy.getPrice().negate())).compareTo(new BigDecimal(0)) <= 0) {
            System.out.println(toy.toString() + " we can't buy it");
            return;
        }

        toys.add(toy);
    }

    public void sortToys(){
        Collections.sort(currentListOfToys,new ToyComparator());
    }


    public void prepearRoomForChildren(ChildrenType chType){
        currentListOfToys.clear();
        for( Toy t : toys){
            if (t.getChsType() == chType) currentListOfToys.add(t);
        }
    }

    public void showCurrentRoom(){
        for (Toy t : currentListOfToys) System.out.println(t.toString());
    }

    public void showToysBetweenPrices(BigDecimal smaller, BigDecimal bigger){
        for(Toy t : currentListOfToys) {
            if ((t.getPrice().compareTo(smaller) >= 0) && (t.getPrice().compareTo(bigger))<= 0) System.out.println(t);
        }
    }

}
