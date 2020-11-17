import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class Counter here. @author (your name) @version (a version number or a date)
 */
public class Counter extends Actor
{
    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/
    protected int score = 0;

    /**
     * Act - do whatever the Counter wants to do. A Counter will appear whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage( new  GreenfootImage("Score : " + score, 30, Color.YELLOW, Color.BLACK));
        if (score == 4) {
            Greenfoot.stop();
            getWorld().showText("VICTORY!", 300, 200);
        }
        
    }

    /**
     * 
     */
    public void addScore()
    {
        score = score + 1;
    }

    /**
     * 
     */
    public void minScore()
    {
        score = score - 1;
    }
}
