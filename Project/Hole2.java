import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hole2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hole2 extends Actor
{
    /**
     * Act - do whatever the Hole2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
     touchHole(); 
    }   
    
    public void touchHole() {
        if(isTouching(Toby.class)) {
            removeTouching(Toby.class);
            // put sound here -> dog cry
            getWorld().showText("You lose a life!",360, 370);
            
        }
    }
}
