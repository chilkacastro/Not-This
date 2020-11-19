import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hole1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hole1 extends Actor
{
    /**
     * Act - do whatever the Hole1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       removeToby();
        // put sound here -> dog cry
        //getWorld().showText("You lose a life!",360, 370);
        //Greenfoot.stop();
        }
    
    /**
     * removeToby() - to remove Toby from the World and bring him back to his initial position in that level.
     */
    public void removeToby() {
        if(isTouching(Toby.class)) {
            removeTouching(Toby.class);
            // put sound here -> dog cry
            //().showText("You lose a life!",360, 370);
            // put blood here?? if Toby gets hit by a car
            //reviveToby();
              
        }
        

    }

    
    /**
     * reviveToby() - bring back Toby
     */
    public void reviveToby() {
        
        MyWorld myWorld = (MyWorld)getWorld();
        myWorld.addScore(-200);
        myWorld.lifeCount(-1);
        Level1 myLevel1 = (Level1)getWorld();
        myLevel1.addObject(new Toby(), 800, 640);
    }
}
