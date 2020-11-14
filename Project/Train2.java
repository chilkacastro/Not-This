import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Train2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Train2 extends Actor
{
    /**
     * Act - do whatever the Train2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX()-5, getY());
        if (getX() == 0) {
            getWorld().removeObject(this);
            
        }
    }    
}
