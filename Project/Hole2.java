import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hole1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hole2 extends Actor
{
    /**
     * Act - do whatever the Hole1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(isTouching(Toby.class)) {
            Greenfoot.playSound("Crying.wav");
            removeTouching(Toby.class);
            getWorld().showText("You lose a life!",500, 500);
            Greenfoot.stop();
        }
    }    
}
