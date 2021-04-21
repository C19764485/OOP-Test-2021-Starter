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

	
	// Creating an array list to be used for holding instances of the Note class
	ArrayList<Note> notesIns = new ArrayList<Note>();

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
		loadScore();

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
		int x, y;

		x = 300;
		y = 200;

		for(int i = 0; i < score.length(); i++)
		{
			fill(0);
			circle(x + (i * 60), y + map(50, 100, 0, 10, i * 10), 20);
			line(x + (i * 60) + 10, y + map(50, 100, 0, 10, i * 5) + 10, x + (i * 60), y +  map(50, 100, 0, 10, i * 10) - 50);
		}
		
		
	}

	void loadScore()
	{
		char notes = '\0';
		int duration = 0;
		int j = 0;

		// Iterrating through score string length
		for(int i = 0; i < score.length(); i++)
        {
			notes = score.charAt(i);
			
			if(Character.isDigit(score.charAt(i))) 
            {
				duration = score.charAt(j + 1) - '0';
				j++;
			}			

			Note notez = new Note(notes, duration);

			notesIns.add(notez);

			// Printing score notes and duration
			System.out.println(notez.getNote() + "   " + notez.getDuration());
        }
	}
}


