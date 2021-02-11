package com.learningJavaLanguage.Classes.playingCards.api;

public interface BasicCard {
    /**
     * Get card rank
     * @return rank of the card
     */
    String getRank();

    /**
     * Get card suit
     * @return suit of the card
     */
    String getSuit();
}
