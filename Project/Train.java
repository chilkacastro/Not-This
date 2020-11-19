import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Train here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Train extends Actor
{
    
    /**
     * Act - do whatever the Train wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX()-5, getY());
<<<<<<< HEAD
        if (getX() == 0) {
            getWorld().removeObject(this);
            
        }
        if(isTouching(Toby.class))
        {
            Greenfoot.playSound("Train.wav");
=======
        Actor Toby = getOneObjectAtOffset(0, 0, Toby.class);
        if(isTouching(Toby.class))
        {
            Greenfoot.playSound("Train.wav");
            removeTouching(Toby.class);
            getWorld().showText("You lose a life!",500, 500);
            Greenfoot.stop();
>>>>>>> 3d1193f4033b83662cdc657eed90a216aee1ea88
        }
        if(isAtEdge()) {
            getWorld().removeObject(this);
        } 
    }    
}
