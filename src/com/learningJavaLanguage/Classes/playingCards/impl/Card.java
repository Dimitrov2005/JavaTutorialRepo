package com.learningJavaLanguage.Classes.playingCards.impl;

import com.learningJavaLanguage.Classes.playingCards.api.BasicCard;

import java.util.Objects;

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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(rank, card.rank) &&
                Objects.equals(suit, card.suit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rank, suit);
    }

    @Override
    public String toString() {
        return "Card{" +
                "rank='" + rank + '\'' +
                ", suit='" + suit + '\'' +
                '}';
    }

}
