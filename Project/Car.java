import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Actor
{
    private int speed;
    /**
     * Act - do whatever the Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        setLocation(getX()-2, getY());
        if (getX() == 0) {
            getWorld().removeObject(this);
            
        }
        if(isTouching(Toby.class))
        {
            Greenfoot.playSound("tireSkid.wav");
        }
    } 
    public void removeToby() {
        if(isTouching(Toby.class)) {
                removeTouching(Toby.class);
                // put sound here -> dog cry
                //().showText("You lose a life!",360, 370);
                
        }

    }
}
