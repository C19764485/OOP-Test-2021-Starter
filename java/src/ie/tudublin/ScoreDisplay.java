/*
	OOP 1 - Lab Test 1 (Javascript)
	Author: Panagiotis Bampilis
	Date:   21/April/2021
	Score Display
*/

package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class ScoreDisplay extends PApplet
{
	String score = "DEFGABcd";
	//String score = "D2E2F2G2A2B2c2d2";
	//String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";

	// Creating variables to be used for centering objects
	float halfwidth = width / 2;
	float halfheight = height / 2;
	int x, y = 0;
	
	// Creating an array list to be used for holding instances of the Note class
	ArrayList<Note> notes = new ArrayList<Note>();

	public void settings()
	{
		size(1000, 500);

		// How to convert a character to a number
		char c = '7'; // c holds the character 7 (55)
		int i = c - '0'; // i holds the number 7 (55 - 48) 
		println(i);
	}

	public void setup() 
	{
		
	}

	public void draw()
	{
		background(255);

		//The pentacle/pentagram drawing
		for(int i = 0; i < 5; i++)
		{
			stroke(0);
			strokeWeight(2);
			line(halfwidth + 100, i * 20 + 200, halfwidth + 800, i * 20 + 200);
		}

		// Calling drawNotes function to draw notes on pentagram.
		drawNotes();
		
	}

	void drawNotes()
	{
		fill(0);
		circle(x, y, 20);
	}

	void loadScore()
	{
		for(int i = 0; i < notes.size(); i++)
        {
            Note notz = notes.get(i);
			println(notz);
        }
	}

	public abstract class Note
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
			return this.note + " " + this.duration + " ";
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
}


