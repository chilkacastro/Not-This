import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Actor
{
    private int speed = 7;
    /**
     * Act - do whatever the Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        setLocation(getX()-speed, getY());
        if (getX() == 0) {
            getWorld().removeObject(this);
            
        }
<<<<<<< HEAD
        removeToby();
        
=======
        if(isTouching(Toby.class))
        {
            Greenfoot.playSound("tireSkid.wav");
        }
>>>>>>> fa259666448617f51ce5e4e13c00decf0d4f6727
    } 
    
    /**
     * removeToby() - to remove Toby from the World and bring him back to his initial position in that level.
     */
    public void removeToby() {
       if (isTouching(Toby.class)) {
            setLocation(800, 640);
            ((MyWorld)getWorld()).lifeCount(-1);
            ((MyWorld)getWorld()).addScore(-10000);
            // put sound here -> dog cry
            //().showText("You lose a life!",360, 370);
            // put blood here?? if Toby gets hit by a car

         }     
    }
     
    /**
     * printText() - tells that Toby loses a life.
     */
     public void printText() {
         getWorld().showText("You lost a life!", 800, 400);
     }
      
        

}
