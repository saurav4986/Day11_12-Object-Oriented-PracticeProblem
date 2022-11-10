package com.bridgelabz.OOPS.DeckOfCards;

class DeckOfCards {

    String[] suits;
    String[] ranks;

    String[] cards;

    public DeckOfCards() {
        suits = new String[]{"Spades", "Clubs", "Diamonds", "Hearts"};
        ranks = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q",
                "K", "A"};
        cards = new String[ranks.length * suits.length];
    }

    public void initDeck() {
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                cards[ranks.length * i + j] = ranks[j] + suits[i];
            }
        }
    }

    public void printCards() {
        for (String card : cards) {
            System.out.println(card);
        }
    }
}
