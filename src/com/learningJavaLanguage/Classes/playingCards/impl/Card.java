package com.learningJavaLanguage.Classes.playingCards.impl;

import com.learningJavaLanguage.Classes.playingCards.api.BasicCard;

public class Card implements BasicCard {
    private String rank;
    private String suit;

    /**
     * Class whose instances represent a single playing card from a deck of cards.
     * Playing cards have two distinguishing properties: rank and suit.
     * @param rank
     * @param suit
     */
    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String getRank() {
        return rank;
    }
    @Override
    public String getSuit() {
        return suit;
    }
}
