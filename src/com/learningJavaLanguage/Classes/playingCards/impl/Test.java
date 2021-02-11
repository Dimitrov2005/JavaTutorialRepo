package com.learningJavaLanguage.Classes.playingCards.impl;
import com.learningJavaLanguage.Classes.playingCards.api.*;
public class Test {

    public static void main(String[] args) {
        Card card = new Card("ace", "spade");
        Deck deck = new Deck("myDeck");
        deck.addCard(card);
        Card [] allCards = deck.getAllCards();
        for (Card c : allCards) {
            System.out.println(c.getRank() + c.getSuit());
        }
    }
}
