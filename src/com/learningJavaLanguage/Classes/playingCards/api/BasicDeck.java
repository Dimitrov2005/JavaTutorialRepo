package com.Classes.playingCards.api;
import com.Classes.playingCards.impl.Card;

public interface BasicDeck {
    /**
     * Add single Card to the Deck
     * @param rank card rank
     * @param suit card suite
     */
    void addCard(String rank, String suit);

    void addCard(Card card);

    /**
     * Remove single Card from the Deck
     * @param rank card rank
     * @param suit card suite
     */
    void removeCard(String rank, String suit);

    /**
     * Get array of all the Cards
     * @return array of Cards
     */
    Card [] getAllCards();

    /**
     * Load Deck with predefined cards
     * @param arrayOfCards
     */
    void setAllCards(Card [] arrayOfCards);
}
