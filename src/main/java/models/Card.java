package models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created by michaelhilton on 1/25/16.
 */

public class Card implements Serializable {
    public final int value;
    public americanSuit amSuit;
    public spanishSuit spSuit;

    @JsonCreator
    public Card(@JsonProperty("value") int value, @JsonProperty("suit") americanSuit amSuit, @JsonProperty spanishSuit spSuit)
    {
        this.value = value;
<<<<<<< HEAD
        this.suit = suit;
=======
        this.amSuit = amSuit;
        this.spSuit = spSuit;

>>>>>>> a0b7b188a024bbf74296704d35a2805742a43a60
    }

    public americanSuit getAmericanSuit()
    {
        return amSuit;
    }

    public spanishSuit getSpanishSuit()
    {
        return spSuit;
    }

    public int getValue()
    {
        return value;
    }

    public String toString()
    {
        if (amSuit == null) { return this.value + this.spSuit.toString(); }

        return this.value + this.amSuit.toString();
    }
}
