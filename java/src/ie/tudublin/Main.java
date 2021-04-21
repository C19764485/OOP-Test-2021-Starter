/*
	OOP 1 - Lab Test 1 (Javascript)
	Author: Panagiotis Bampilis
	Date:   21/April/2021
	Score Display
*/

package ie.tudublin;

public class Main
{
    public void scoredisplay()
    {
        String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new ScoreDisplay());
    }

    public static void main(String[] args)
    {
        Main main = new Main();
        main.scoredisplay();
    }
} 