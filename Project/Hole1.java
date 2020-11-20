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
<<<<<<< HEAD
       removeToby(); 
       
    }
    
    /**
     * removeToby() - to remove Toby from the World and bring him back to his initial position in that level.
     */
    public void removeToby() {
        if (isTouching(Toby.class)) {
            removeTouching(Toby.class);
            deductPoints();
            MyWorld myWorld = (MyWorld)getWorld();
            if (myWorld.getLifeCount() > 0) {
                reviveToby();
            }   

        }
    }
    
    /**
     * deducPoints() - to remove points when Toby touches the traffic cones.
     */
     public void deductPoints() {
        MyWorld myWorld = (MyWorld)getWorld();
        myWorld.lifeCount(-1);

    }
    
    /**
     * reviveToby() - bring back Toby
     */
    public void reviveToby() {
        Level1 myLevel1 = (Level1)getWorld();
        myLevel1.addObject(new Toby(), 800, 640);
       
    }
=======
        if(isTouching(Toby.class)) {
            Greenfoot.playSound("Crying.wav");
            removeTouching(Toby.class);
            getWorld().showText("You lose a life!",500, 500);
            Greenfoot.stop();
        }
    }    
>>>>>>> d00ab9526adbc520d6367d7d63905e611f1aa673
}
