/*
	OOP 1 - Lab Test 1 (Java)
	Author: Panagiotis Bampilis
	Date:   21/April/2021
	Score Display
*/

package ie.tudublin;

import java.util.ArrayList;
import processing.core.PApplet;

public class Note extends ScoreDisplay
{

    // Creating private variables
    private char note;	
    private int duration;

    // Constructor to be used for instance creation
    public Note(char note, int duration)
    {
        this.note = note;
        this.duration = duration;
    }

    // toString method to return char note and int duration back to a string.
    public String toString()
    {
        return "Note is: " + this.note + "Duration is: " + this.duration;
    } 
    
    // Generated Setters and getters
    public char getNote() {
        return note;
    }

    public void setNote(char note) {
        this.note = note;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }	
}
