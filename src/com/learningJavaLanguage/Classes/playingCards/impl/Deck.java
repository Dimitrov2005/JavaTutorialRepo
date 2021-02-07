package com.Classes.playingCards.impl;

import com.Classes.playingCards.api.BasicDeck;

public class Deck implements BasicDeck {

    private Card [] cards;
    private String deckName;
    private final short numCards = 52;

    /**
     * A class whose instances represent a full deck of cards.
     * @param name
     */
    public Deck(String name){
        this.deckName = name;
        cards = new Card[numCards];
        for (int i = 0; i<numCards; i++){
            this.cards[i] = new Card(null, null);
        }
    }

    @Override
    public void addCard(String rank, String suit){
        for(int i = 0; i<cards.length; i++){
            if(cards[i].getRank() == null && cards[i].getSuit() == null){
                cards[i] = new Card(rank,suit);
                System.out.println("Added new card to deck"+rank+suit);
                break;
            }
        }
    }

    @Override
    public void addCard(Card card){
        for(int i = 0; i<cards.length; i++){
            if(cards[i].getRank() == null && cards[i].getSuit() == null){
                cards[i] = card;
                System.out.println("Added new card to deck"+card.getRank() + card.getSuit());
                break;
            }
        }
    }

    @Override
    public void removeCard(String rank, String suit) {
        for(int i = 0; i<cards.length; i++){
            if(cards[i].getRank() == rank && cards[i].getSuit() == suit){
                cards[i] = new Card(null,null);
            }
        }
    }

    @Override
    public Card[] getAllCards() {
        return cards;
    }

    @Override
    public void setAllCards(Card[] arrayOfCards) {
        cards = arrayOfCards;
    }


}
