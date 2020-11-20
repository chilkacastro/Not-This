import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TrafficCone here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TrafficCone extends Actor
{
    /**
     * Act - do whatever the TrafficCone wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
<<<<<<< HEAD
     public void act() {
        deductPoints();

=======
    public void act() 
    {
       if(isTouching(Toby.class)) {
           MyWorld myWorld = (MyWorld)getWorld();
           myWorld.addScore(-100);
       }
>>>>>>> d00ab9526adbc520d6367d7d63905e611f1aa673
    }    
    
    /**
     * deducPoints() - to remove points when Toby touches the traffic cones.
     */
     public void deductPoints() {
       if (isTouching(Toby.class)) {
            MyWorld myWorld = (MyWorld)getWorld();
            myWorld.addScore(-100);
       }
    
    }
}
