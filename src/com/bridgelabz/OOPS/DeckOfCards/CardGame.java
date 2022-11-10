package com.bridgelabz.OOPS.DeckOfCards;

public class CardGame {

    public static void main(String[] args) {

        DistributeCard distributeCard = new DistributeCard(4, 9);

        distributeCard.distribute();

        distributeCard.printDistributedCards();
    }

}

