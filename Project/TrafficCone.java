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
     * Act - do whatever the TrafficCone wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if(isTouching(Toby.class)) {
           MyWorld myWorld = (MyWorld)getWorld();
           myWorld.addScore(-100);
           
       }
        
    }    
}
