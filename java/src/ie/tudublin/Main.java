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