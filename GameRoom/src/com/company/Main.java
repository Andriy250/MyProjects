package com.company;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Toy car = new Toy("police car", new CarGame(), new BigDecimal(10.0), ChildrenType.middle);
        Toy car2 = new Toy("truck", new CarGame(), new BigDecimal(20.0), ChildrenType.big);
        Toy doll = new Toy("girl doll", new DollGame(), new BigDecimal(15.0), ChildrenType.middle);
        Toy ball = new Toy("football ball", new BallGame(), new BigDecimal(5.0), ChildrenType.small);
        Toy cube = new Toy("cubes", new CubesGame(), new BigDecimal(2.5), ChildrenType.middle);

        GameRoom gameRoom = new GameRoom(new BigDecimal(50.0));
        gameRoom.buyToy(car);
        gameRoom.buyToy(car2);
        gameRoom.buyToy(doll);
        gameRoom.buyToy(ball);
        gameRoom.buyToy(cube);

        gameRoom.prepearRoomForChildren(ChildrenType.middle);
        gameRoom.showCurrentRoom();
        System.out.println("\n\n");
        gameRoom.sortToys();
        gameRoom.showCurrentRoom();
        System.out.println('\n');
        gameRoom.showToysBetweenPrices(new BigDecimal(5.0), new BigDecimal(15));

    }
}
