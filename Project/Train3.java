import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Train here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Train3 extends Actor
{
    
    /**
     * 
     * 
     * Act - do whatever the Train wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
<<<<<<< HEAD
    public void act() {
         setLocation(getX()-5 , getY());
         
         /* if (getX() == 0) {
                getWorld().removeObject(this);
                
         }
         if(isTouching(Toby.class)) {
            
            Greenfoot.playSound("Train.wav");
            setLocation(getX()-5, getY());
            Actor Toby = getOneObjectAtOffset(0, 0, Toby.class);
            
         }
         if(isTouching(Toby.class)) {
=======
    public void act() 
    {
        setLocation(getX()-5, getY());
        Actor Toby = getOneObjectAtOffset(0, 0, Toby.class);
        if(isTouching(Toby.class))
        {
>>>>>>> d00ab9526adbc520d6367d7d63905e611f1aa673
            Greenfoot.playSound("Train.wav");
            removeTouching(Toby.class);
            getWorld().showText("You lose a life!",500, 500);
            Greenfoot.stop();
<<<<<<< HEAD
        */
            if(isAtEdge()) {
                getWorld().removeObject(this);
            } 
         }    

    
=======
        }
        if(isAtEdge()) {
            getWorld().removeObject(this);
        } 
    }    
>>>>>>> d00ab9526adbc520d6367d7d63905e611f1aa673
}
