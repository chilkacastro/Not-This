import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    protected static int score = 1000;
    protected static int lifeCount = 3;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1600, 650, 1); 
    }
    
    /**
     * addScore() - To show the score of the player.
     */
    public void addScore(int points) {
        if(points <= 0) {
            score = score + points;
        }
    }
    /**
     * showScore() - To print the score.
     */
     public void showScore() {
        showText("Score: "+ score, 80, 25);
    }
}

